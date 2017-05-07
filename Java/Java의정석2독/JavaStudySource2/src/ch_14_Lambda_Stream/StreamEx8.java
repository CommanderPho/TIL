package ch_14_Lambda_Stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class StreamEx8 {
	public static void main(String[] args) {
		Student[] stuArr = { 
				new Student("������", true, 1, 1, 300), 
				new Student("���ڹ�", false, 2, 1, 200),
				new Student("���ڹ�", true, 3, 2, 100), 
				new Student("���ڹ�", false, 1, 2, 150),
				new Student("���ڹ�", false, 2, 2, 200), 
				new Student("���ڹ�", false, 3, 3, 290),
				new Student("���ڹ�", true, 1, 3, 180),

				new Student("������", true, 1, 1, 50), new Student("���ڹ�", false, 2, 1, 200),
				new Student("���ڹ�", true, 3, 2, 100), new Student("���ڹ�", false, 1, 2, 150),
				new Student("���ڹ�", false, 2, 2, 200), new Student("���ڹ�", false, 3, 3, 290),
				new Student("���ڹ�", true, 1, 3, 180) };

		System.out.println(" �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)");
		Map<Integer, List<Student>> stuByban = Stream.of(stuArr).collect(groupingBy(Student::getBan));

		for (List<Student> ban : stuByban.values()) {
			for (Student s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println("\n �ܼ�ȭ�׷�ȭ(�������� �׷�ȭ)");
		Map<Student.Level, List<Student>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s->{
					if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				}));
		
		TreeSet<Student.Level> keySet =new TreeSet<>(stuByLevel.keySet());
		
		for(Student.Level key : keySet){
			System.out.println("["+key+"]");
			for(Student s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		System.out.println("\n �ܼ��׷�ȭ + ���(������ �л���)");
		Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s->{
					if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				},counting()));
		
		for(Student.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d��, ",key, stuCntByLevel.get(key));
		
		System.out.println("\n ���߱׷�ȭ(�г⺰, �ݺ�)");
		Map<Integer, Map<Integer,List<Student>>> stuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student::gethak,groupingBy(Student::getBan)));
		
		for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()){
			for(List<Student> ban : hak.values()){
				System.out.println();
				for(Student s : ban)
					System.out.println(s);
			}
		}
		
		System.out.println("\n 5. ����ȭ�׷�ȭ+���(�г⺰, �ݺ� 1��");
		Map<Integer, Map<Integer, Student>> topStuByHakAndBan =
				Stream.of(stuArr)
				.collect(groupingBy(Student::gethak,
						groupingBy(Student::getBan,
								collectingAndThen(maxBy(comparingInt(Student::getScore)),Optional::get
										))));
		
		for(Map<Integer, Student> ban : topStuByHakAndBan.values())
		{
			for(Student s : ban.values())
			{
				System.out.println(s);
			}
		}
		
		System.out.println("\n 6. ����ȭ �׷�ȭ + ���(�г⺰ , �ݺ� �����׷�)");
		Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s->s.gethak() + "-" + s.getBan(),
						mapping(s->{
							if(s.getScore() >= 200) return Student.Level.HIGH;
							else if(s.getScore() >= 100) return Student.Level.MID;
							else return Student.Level.LOW;
						}, toSet())
						));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		for(String key : keySet2){
			System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
		}
	}
}
