package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class StreamEx8 {
	public static void main(String[] args) {
		Student7[] stuArr = { 
				  new Student7("������",true, 1, 1,300),
				  new Student7("���ڹ�",false,1, 1,200),
				  new Student7("���ڹ�",true,1,2,100),
				  new Student7("���ڹ�",false,1,2,150),
				  new Student7("���ڹ�",false,1,2,200),
				  new Student7("���ڹ�",false,1,3,290),
				  new Student7("���ڹ�",true,1,3,180),
				  
				  new Student7("������",true, 1, 1,300),
				  new Student7("���ڹ�",false,1, 1,200),
				  new Student7("���ڹ�",true,1,2,100),
				  new Student7("���ڹ�",false,1,2,150),
				  new Student7("���ڹ�",false,1,2,200),
				  new Student7("���ڹ�",false,1,3,290),
				  new Student7("���ڹ�",true,1,3,180)
			};
		
		System.out.println("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)");
		Map<Integer, List<Student7>> stuByban = Stream.of(stuArr)
				.collect(groupingBy(Student7::getBan));
		
		for(List<Student7> ban : stuByban.values()){
			for(Student7 s : ban){
				System.out.println(s);
			}
		}
		
		System.out.println("&n �ܼ��׷�ȭ(�������� �׷�ȭ)");
		Map<Student7.Level, List<Student7>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					if(s.getScore() >= 200) return Student7.Level.HIGH;
					else if(s.getScore() >= 100) return Student7.Level.MID;
					else							return Student7.Level.LOW;
				}));
		TreeSet<Student7.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Student7.Level key : keySet){
			System.out.println("["+key+"]");
			
			for(Student7 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		System.out.println("%n �ܼ�ȭ�׷�ȭ + ���(������ �л���)");
		Map<Student7.Level, Long> stuCntBylevel = Stream.of(stuArr)
				.collect(groupingBy(s->{
					if(s.getScore() >= 200) return Student7.Level.HIGH;
					else if(s.getScore() >= 100) return Student7.Level.MID;
					else							return Student7.Level.LOW;
				},counting()));
		
		for(Student7.Level key : stuCntBylevel.keySet())
			System.out.printf("[%s] - %d��, ",key,stuCntBylevel.get(key));
		System.out.println();
		
//		for(List<Student7> level : stuByLevel.values()){
//			System.out.println();
//			for(Student7 s : level){
//				System.out.println(s);
//			}
//		}
		
		System.out.println("%n ���߱׷�ȭ(�г⺰, �ݺ�)");
		Map<Integer, Map<Integer, List<Student7>>> stuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student7::getHak, groupingBy(Student7::getBan)));
		
		for(Map<Integer, List<Student7>> hak : stuByHakAndBan.values()){
			for(List<Student7> ban : hak.values()){
				System.out.println();
				for(Student7 s : ban)
					System.out.println(s);
			}
		}
		
		System.out.println("%n 5. ����ȭ�׷�ȭ + ���(�г⺰, �ݺ� 1��");
		Map<Integer, Map<Integer, Student7>> topStuByHakAndBan = 
				Stream.of(stuArr)
				.collect(groupingBy(Student7::getHak, 
						groupingBy(Student7::getBan,
						  collectingAndThen(maxBy(comparingInt(Student7::getScore)),Optional::get))));
		
		for(Map<Integer, Student7> ban : topStuByHakAndBan.values())
			for(Student7 s : ban.values())
				System.out.println(s);
		
		System.out.println("%n 6. ����ȭ�׷�ȭ + ���(�г⺰, �ݺ� �����׷�)");
		Map<String, Set<Student7.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s-> s.getHak() + "-" + s.getBan(),
						mapping(s->{
							if(s.getScore() >= 200) return Student7.Level.HIGH;
							else if(s.getScore() >= 100) return Student7.Level.MID;
							else return Student7.Level.LOW;
						}, toSet())
						));
				
	   Set<String> keySet2 = stuByScoreGroup.keySet();
	   
	   for(String key : keySet2)
		   System.out.println("["+key+"]"+stuByScoreGroup.get(key));
	}
}
