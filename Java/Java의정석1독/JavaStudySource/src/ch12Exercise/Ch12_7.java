package ch12Exercise;

@interface TestInfo{
	int count() default 1;
	String[] value() default "aaa";
}

public class Ch12_7 {
/*
 * @TestInfo  class Exercise12_7{}
 * Ok!      ��� �⺻������ ���
 * @TestInfo(count=1, value="aaa")
 * 
 * 
 * @TestInfor(1) class Exercise12_7{}
 * ���� .����� �̸���  value�� �ƴϸ� �̸��� ������ �� ����
 * @TsetInfor(count=1)
 * 
 * @TsetInfor("bbb") class Excercise12_7{}
 * OK. 
 * @TestTinfor(count=1, value="bbb")
 * 
 * @Test("bbb","ccc") class Excercise12_7{}
 * ����. ���� ������ �����ؾ��� ��� '{}'�� �����
 * @Tset({"bbb","ccc"})
 * 
 */
}
