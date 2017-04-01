package ch11Exercise;

import java.util.*;

class SutdaDeck13{
	final int CARD_NUM = 20;
	SutdaCard1312[] cards = new SutdaCard1312[CARD_NUM];
	
	int pos = 0; // ������ ������ ī���� ��ġ
	HashMap jokbo = new HashMap(); // ������ ������ HashMap
	
	SutdaDeck13(){
		for(int i=0; i<cards.length; i++){
			int num = i%10+1;
			boolean isKwang = i<10 && (num==1 || num==3 || num==9);
			
			cards[i] = new SutdaCard1312(num, isKwang);
			registerJokbo();
		}
	}
	void registerJokbo(){
		/*
		 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ�
		 * jokbo(HashMap)�� ������ ����
		 * �� ī���� ���� ���ڿ��� �ٿ��� key��, ������ value�� ����
		 */
		jokbo.put("KK", 4000);
		jokbo.put("1010", 3100);
		jokbo.put("99", 3090);
		jokbo.put("88", 3080);
		jokbo.put("77", 3070);
		jokbo.put("66", 3060);
		jokbo.put("55", 3050);
		jokbo.put("44", 3040);
		jokbo.put("33", 3030);
		jokbo.put("22", 3020);
		jokbo.put("11", 3010);
		
		
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}
	int getPoint(Player13 p){
		if(p==null) return 0;
		SutdaCard1312 c1 = p.c1;
		SutdaCard1312 c2 = p.c2;
		
		Integer result = 0;

//		 1.ī�� ������ ��� ���̸�, jokbo���� Ű�� "KK"�� �ؼ� ������ ��ȸ
		if( c1.isKwang == true && c2.isKwang == true){
			result = (Integer)jokbo.get("KK");
		}else
//	      2. �� ī���� ����(num)�� jokbo���� ��� ��ȸ
		  result = (Integer) jokbo.get(""+c1.num+c2.num);
		
//		3. �ش��ϴ� ����� ������, �Ʒ��� �������� ���� ���
		if(result==null)
			result = new Integer((c1.num + c2.num ) % 10 +1000);

//		4. Player13�� ������ ����� ���� ����
		p.point = result.intValue();
		 
		
		return result.intValue();
	}
	SutdaCard1312 pick() throws Exception{
		SutdaCard1312 c = null;
		
		if(0<=pos && pos<CARD_NUM){
			c = cards[pos];
			cards[pos++] = null;
		}else{
			throw new Exception("�����ִ� ī�尡 �����ϴ�.");
		}
		return c;
	}
	void shuffle(){
		for(int x=0; x<CARD_NUM*2; x++){
			int i = (int)(Math.random()*CARD_NUM);
			int j = (int)(Math.random()*CARD_NUM);
			
			SutdaCard1312 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}

class Player13{
	String name;
	SutdaCard1312 c1;
	SutdaCard1312 c2;
	
	int point; // ī���� ��޿� ���� ����
	
	Player13(String name, SutdaCard1312 c1, SutdaCard1312 c2){
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	public String toString(){
		return "["+name+"]"+c1.toString() + ","+c2.toString();
	}
}

class SutdaCard1312{
	int num;
	boolean isKwang;
	
	SutdaCard1312(){
		this(1,true);
	}
	SutdaCard1312(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString(){
		return num + (isKwang?"K":"");
	}
}

public class Ch11_13 {
	public static void main(String[] args) throws Exception{
		SutdaDeck13 deck = new SutdaDeck13();
		
		deck.shuffle();
		
		Player13[] pArr = {
				new Player13("Ÿ¥",deck.pick(),deck.pick()),
				new Player13("���",deck.pick(),deck.pick()),
				new Player13("����",deck.pick(),deck.pick()),
				new Player13("�߼�",deck.pick(),deck.pick()),
				new Player13("�ϼ�",deck.pick(),deck.pick())
		};
		
		TreeMap rank = new TreeMap(new Comparator(){
			public int compare(Object o1, Object o2){
				if(o1 instanceof Player13 && o2 instanceof Player13){
					Player13 p1 = (Player13)o1;
					Player13 p2 = (Player13)o2;
					
					return p2.point - p1.point;
				}
				return -1;
			}
		});
		
		for(int i=0; i<pArr.length; i++){
			Player13 p = pArr[i];
			rank.put(p,deck.getPoint(p));
			System.out.println(p+" "+deck.getPoint(p));
		}
		System.out.println();
		System.out.println("1����"+rank.firstKey()+"�Դϴ�.");
	}
}
