import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// ����� ��Ʈ��
// �ܼ� �Է°� ���
// inputStream (�Է�)


public class StreamClass {
	public static void main(String[] args)
		throws Exception {
		//Ŭ����.�Ӽ�.����Ʈ(�޼ҵ�)
		//System.out.println();
/*		InputStream in = System.in;
		System.out.println("���ڸ� �Է��� �ּ��� :");
		int readInt = in.read();
		int readB = in.read();
		int readC = in.read();

		System.out.println(readInt);
		System.out.println(readB);
		System.out.println(readC);
		
		in.read(); //���� ����
*/
		// ���� Ascii �ڵ� ���� �׳� ���� �� ���� �׷��� ���̰�
		// �ϰ� �;�
		
		/*
		System.out.println("�־��");
		InputStreamReader inr
		= new InputStreamReader(System.in);
		char[] input = new char[3];
		inr.read(input);
		System.out.println(input);
		*/
		//-- �̰��� �������̸� ������ �ִ�.
		//-- �� �������̵� �� �а� �ʹ�.
		//--BufferedRdader
		
		/*
		InputStream in = System.in;
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader binr = new BufferedReader(inr);
		
		System.out.println("BufferedReader : ");
		String input = binr.readLine();
		System.out.println(input);
		*/
		
		//--�� �� ���ѹ��
		//--scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Scanner :");
		String input = sc.next();
		System.out.println(input);
	}
}
