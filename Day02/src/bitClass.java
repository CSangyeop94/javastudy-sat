

public class bitClass {
	
	public static void main(String[] args) {
	
	// �������ϰ� �Ȱ���.
	// 0 �� ����
	// 1 �� ��
	byte a = 10; //<--2����
	System.out.println(
			Integer.toBinaryString(a)//2���� ���ڿ��� ������
			);
		//bit ���꿡 and ����
		byte b = 1;
		byte c = (byte)(a & b);
		System.out.println(c);
		System.out.println(
				Integer.toBinaryString(c));
		
		//--bit ���꿡 or
		System.out.println(10 | 1);
		System.out.println(
				Integer.toBinaryString(10 | 1));
		
		//--Not 
		byte z = 0;
		System.out.println(~z);
		
		//-- ����ǥ��
		System.out.println(
				Integer.toBinaryString(-1)
				);
		System.out.println(
				Integer.toBinaryString(-2)
				);
		//-- 1. ����� 2������ ��ȯ
		//-- 2. 2������ ����(����) ~
		//-- 3. 2�� ����� +1 �� �Ѵ� (2�� ����)
		
		// ����Ʈ ���� <<, >>, >>>
		byte aaa = 10;
		System.out.println(aaa << 2);
		System.out.println(
				Integer.toBinaryString(aaa)
				);
		System.out.println(
				Integer.toBinaryString(aaa << 2)
				);
		System.out.println(
				Integer.toBinaryString(aaa >> 2)
				);
		
		//--���� ���� ����Ʈ
		
		System.out.println(
				Integer.toBinaryString(-10)
				);
		System.out.println(
				Integer.toBinaryString(-10 >> 2)
				);
		System.out.println(
				-10 >> 2
				);
		
		//-- 3�� ������
		//-- ���ǽ� (��/��) ? ��1 : ��2;
		int point = 60;
		String con 
		= point  > 70 ? "�հ� " : "���հ�";
		System.out.print(con);
		
		//float + int
		//double + int ����غ���
		
		//���ڿ�������
		
		int colorpen = 5 * 12;
		int studentCount = 27;
		
		int divColorPen = 2;
				System.out.println( + divColorPen);
		int remainColorPen = 6;
				System.out.println( + remainColorPen);
				
		
		
		
	
			
		
}
}