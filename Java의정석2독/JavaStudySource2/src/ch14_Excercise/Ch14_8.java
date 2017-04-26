package ch14_Excercise;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.stream.Stream;

public class Ch14_8 {
	public static void main(String[] args) {
		Student[] stuArr = {
			new Student("���ڹ�", true, 1, 1, 300),
			new Student("������",false, 1, 1, 250),
			new Student("������",true,1,1,200),
			new Student("���ڹ�",true, 1,2,100),
			new Student("������",false, 1, 2, 50),
			new Student("Ȳ����",false, 1, 3 ,100),
			new Student("������",false,1,3,150),
			new Student("���ڸ�",true, 1, 3, 200),
			
			new Student("���ڹ�", true, 2, 1, 300),
			new Student("������",false, 2, 1, 250),
			new Student("������",true,2,1,200),
			new Student("���ڹ�",true, 2,2,100),
			new Student("������",false, 2, 2, 50),
			new Student("Ȳ����",false, 2, 3 ,100),
			new Student("������",false,2,3,150),
			new Student("���ڸ�",true, 2, 3, 200)
		};
		
		Map<Boolean, Map<Boolean, Long>> failedStuBySex=
				Stream.of(stuArr).collect(partitioningBy(Student::isMale,
										 partitioningBy(s->s.getScore()<=150,counting())));
		
		long failedMaleStuNnum = failedStuBySex.get(true).get(true);
		long failedFemaleStuNnum = failedStuBySex.get(false).get(true);
		
		System.out.printf("���հ�[����] : %d ��\n",failedMaleStuNnum);
		System.out.printf("���հ�[����] : %d ��\n",failedFemaleStuNnum);
	}
}
