package ch7_Exercise;
/*
 * Ŭ������ ������ ���� ���ǵ� ���� ��, ����ȯ�� �ùٸ��� ���� ���� ����?
 * class Unit{}
 * class AirUnit extends Unit{}
 * class GroundUnit extends Unit{}
 * class Tank extends GroundUnit{}
 * class AirCraft extends AirUnit{}
 * 
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * AirCraft ac = new AirCraft();
 * ----------------------
 * a. u = (Unit)ac;         ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��ͽ� ����
 * b. u = ac;        ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��ͽ� ����
 * c. GroundUnit gu = (GroundUnit)u;   -> GroundUnit gu = (GroundUnit)new GroundUnit();    o 
 * d. AirUnit au = ac;     -> AirUnit au = new AirCraft(); ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��ͽ� ����
 * e. t = (Tank)u;           Tank t= (Tank)new GroundUnit();  �ڼ�Ÿ���� ���������� �����ν��Ͻ��� ���� X
 * f. GroundUnit gu = t;     GroundUUnit gu = new Tank(); ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��ͽ� ����
 */
public class Ch7_15 {

}
