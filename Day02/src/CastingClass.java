
//����ȯ ((DATA)Type Casting)
public class CastingClass {
	public static void main(String[] args) 
	{
			long age = 100;
			int age2 = (int)age; //����ȯ
			//(int)�� long�� int��
			//������ ������Ű�ڴٴ� �ǹ�
			
			//�ڵ� ����ȯ
			char name = 100;
			int name2 = name;
			//char��2byte int��4byte
			//���������͸� ū�����Ϳ� �������� 
			//����ȯ�� �ڵ����� �ȴ�.
			
			//���� ����ȯ
			//ū�����͸� ���� �����Ϳ� ������ҋ�
			//����ȯ�� ������ �����ش�.
			//(������Ÿ��)������;
			long a = 1000;
			int b = (int)a;
		
			//!)
			//short aaa = 32767;
			//���� ����ȯ�ҋ� ������
			short aaa = 129;
			// byte�� �ִ������ �Ѿ
			byte bbb = (byte)aaa;
			System.out.println(bbb);
			
			int abc = (int)3.14;
			float c = (float)3d;
			
			int abc2 = (int)3f;
			double abc3 = 30l;
			//������ ���������� �Ǽ��� ����� �ϸ�
			//���������� ���� ����ȯ�� �ʿ�
			//�� �ݴ��� ���� �ڵ� ����ȯ
	}
}
