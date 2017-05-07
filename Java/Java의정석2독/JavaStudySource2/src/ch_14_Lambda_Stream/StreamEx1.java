package ch_14_Lambda_Stream;

import java.util.*;
import java.util.stream.*;

public class StreamEx1 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("������",3,300),
				new Student("���ڹ�",1,200),
				new Student("���ڹ�",2,100),
				new Student("���ڹ�",2,150),
				new Student("���ڹ�",1,200),
				new Student("���ڹ�",3,290),
				new Student("���ڹ�",3,180)
				);
		studentStream.sorted(Comparator.comparing( Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}
}
class Student implements Comparable<Student>{
	
	enum Level { HIGH, MID, LOW }
	
	String name;
	boolean isMale;
	int ban;
	int totalScore;
	int hak;
	int score;

	public Student() {
		super();
	}
	
	

	public Student(String name, boolean isMale, int ban, int hak, int score) {
		super();
		this.name = name;
		this.isMale = isMale;
		this.ban = ban;
		this.hak = hak;
		this.score = score;
	}

	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString(){
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, 
				isMale ? "��" : "��",hak, ban, score);
	
	}
	
	
	public String getName() {
		return name;
	}
	
	boolean isMale() { return isMale; }
	
	public int gethak() { return hak; }
	
	public int getScore() { return score; }
	
	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public int compareTo(Student o) {
		return o.totalScore - this.totalScore;
	}
}