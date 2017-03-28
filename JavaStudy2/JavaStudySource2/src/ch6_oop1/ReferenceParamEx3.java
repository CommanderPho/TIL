package ch6_oop1;

public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum="+sumArr(arr));
	}
	
	static void printArr(int[] arr){
		System.out.print("[");
		
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr){
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	static void sortArr(int[] arr){  // bubble sort
		for(int i=0; i<arr.length; i++)
		{
			boolean change = false;  // �� �ݺ����� changed�� false�� �ʱ�ȭ
			
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])     // ���� ���� ������ ���� �ٲ۴�.
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];                                                                     
					arr[j+1] = tmp;
					change = true;       // �ڸ��ٲ��� �߻������� changed�� true�� �ٲ۴�.
				}
			}
			
			if(!change) break;  // �ڸ��ٲ��� ������ ������ �� �Ȼ����̹Ƿ� �ݺ����� ��� ���ʿ��� �񱳸� �� �̻� ���� �ʴ´�.
		}
	}
}