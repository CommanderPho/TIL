package tryHelloWorld;

public class WaterMelon {
	public String watermelon(int n) {
//		StringBuffer�� StringBuilder����ϱ�
		String result = "";
		for (int i = 1; i <= n; i++) {
			result += i%2!=0 ? "��" : "��"; 
		}
		return result;
//		return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}
/*
    public String watermelon(int n){
        StringBuffer sf = new StringBuffer();
        for (int i=1; i<=n; ++i) {
            sf.append(i%2==1?"��":"��");
        }
        return sf.toString();
}
*/