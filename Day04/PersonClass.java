package Day04;
// class Ŭ������ {
//  ....
//  }
// -- 1. �ۼ�(�ʵ�)�� ����Ȥ�� ����̴�.
// -- 2. ����(�ż���/�Լ�)
// -- ����Ÿ�� �޼���.�Լ���(�Ű�����) { }
// -- 3. ������
// -- Ŭ������(�ŰԺ���) { }

class PersonClass {
	
	String name; 
	
	public PersonClass() {} //�⺻ ������
	
	// ��� Ŭ������ "�̸�" �Ӽ��� ������.
	
	public PersonClass(String name) {
		this.name = name;
	}
	
	void sayName() { // 2. ����
		System.out.println(name);
	}
	
}

// �� Ŭ������ PersonClass�� ��ӹް� �ϰڴ�.
// ����� Ű����� extends
// class �ڽ�Ŭ������ extends �θ�Ŭ������

class PersonClassA extends PersonClass{
	public PersonClassA(String name) {
		super(name);
	}
	void sayName() { // 2. ����
		System.out.println("PersonA :" + name + "�Դϴ�.");
	}
	void sayName(String name) {
		
	}
}

class PersonClassB extends PersonClass{
	public  PersonClassB(String name) {
		super(name);
	}
	void sayName() { // 2. ����
	System.out.println("PersonB :" + name + "�Դϴ�.");
	}
}
//--�����
// �ڹٿ����� ��ü�� �����Ѵ� �ҋ� ����ϴ� Ű���尡 new
// Ŭ���� ������Ÿ�� ������ = new ������();

public class Person {
	public static void main(String[] args) {
		
		PersonClass p = new PersonClass("�߻�");
		PersonClass p1 = new PersonClass("�߻�");
		p.sayName();
		p.name = "�Ͼ��Ͼ�";
		p.sayName();
		
		PersonClassA pa = new PersonClassA("ȫ�浿");
		//���⼺
		PersonClassB pb = new PersonClassB("������");
		pa.sayName();
		pa.sayName("�߻�");
		pb.sayName();
	}
}

		/*
		if(p == p1) {
			System.out.println("p�� p1�� ���� ��ü�̴�");
		} else {
			System.out.println("p�� p1�� �ٸ� ��ü�̴�");
		}
	}
	String abc = new String("�߻�");
	String abc_1 = new String("�߻�");
	
	if(abc == abc_1) {
		System.out.println("abc�� abc_1�� ����.");
	}else {
		System.out.println("abc�� abc_1�� �ٸ���.");
	}
}
}*/
