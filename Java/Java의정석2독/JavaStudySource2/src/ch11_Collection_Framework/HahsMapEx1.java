package ch11_Collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class HahsMapEx1 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("asdf", "1234");
		map.put("myId", "1234");
		map.put("myId", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)){
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�." + " �ٽ� �Է����ּ���");
				continue;
			} else{
				if(map.get(id).equals(password)){
					System.out.println("��ġ�մϴ�.");
					break;
				} else{
					System.out.println(map.get(id));
					System.out.println("��ġ���� �ʽ��ϴ�.");
					continue;
				}
			}
			
			
		}
		
	}
}
