
//-- ������ ����(scope)
//-- ������ { } ���̷� �Ѵ�.
public class ScopeClass {
	int age = 10; //--Ŭ���� ��������
					//--���� ����
					//--(Ŭ����) ��������
					//--Ŭ���� ����
					//--�ɹ� ����
	public static void main(String[] args)
	{
			int age3 = 200;
		{
			int age2 = 100; //���� ����
			//--Ŭ���� �����ȿ�����
			//--���� ������ ��������
			System.out.println(age3);//����
		}
		System.out.println(age);
		System.out.println(age2);//Error
		System.out.println(age3);
	}//������ ������ �ǹ� 
	
}