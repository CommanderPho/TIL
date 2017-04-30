package ch16_Exercise;

public class Ch16_1 {
	public static void main(String[] args) {
		byte[] ip = {(byte)192, (byte)168, (byte)10, (byte)100};
		byte[] subnet = {(byte)255, (byte)255, (byte)255, (byte)0};
		
		byte[] newAddress = new byte[4]; // ��Ʈ��ũ �ּ�
		byte[] hosAddress = new byte[4]; // ȣ��Ʈ �ּ�
		
		System.out.print("��Ʈ��ũ �ּ�  : ");
		
		for(int i=0; i<ip.length; i++){
			newAddress[i] = (byte)(ip[i]&subnet[i]);
			System.out.print(newAddress[i] >= 0 ? newAddress[i] : newAddress[i]+256);
			System.out.print(".");
		}
		
		System.out.println();
		System.out.print("ȣ��Ʈ �ּ� : ");
		
		for(int i=0; i<ip.length; i++){
			hosAddress[i] = (byte)(ip[i]& ~subnet[i]);
			System.out.print(hosAddress[i] >= 0 ? hosAddress[i] : hosAddress[i]+256);
			System.out.print(".");
		}
	}
}
