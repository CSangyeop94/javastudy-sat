import math.MathUtilClass;
import students.Student;

class MathUtilClassSon extends MathUtilClass {
	
}

public class ExtendsClass {

		public static void main(String[] args) {
			/*public int x1; //--��ü����
			private int x2;	//--�ڱ⸸(MathUtilClass) ���
			protected int x3;//-- ���� ���� �ִ� ����� ���
			int x4; //-- ���� �濡 �ִ� ����� ���
			*/
			
			MathUtilClassSon son = new MathUtilClassSon();
			//son.x1 = 10;
			//son.x2 = 10; // x2�� ������ ����
						 // protected �� ��ӺҰ�
			//son.x3 = 10; // x3�� ��Ű���� �޶� x
			//son.x4 = 10; // private x
			
			Student std = new Student();
			std.setGrade(1);
			std.setGender("����");
			std.setName("�߻�");
			
			System.out.println(std.getName());
			System.out.println(std.getGrade());
			System.out.println(std.getGender());
			
		}
}
