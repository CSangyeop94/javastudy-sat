
import java.util.Scanner;
					

			import java.util.Scanner;

			public class SwitchExClass {
				
				public static void main(String[] args) {
					do {
					
					System.out.print("������ �Է��ϼ���: ");
					Scanner scan = new Scanner(System.in);
					int score = scan.nextInt();
					
					
					//---�ſ� �߿���-----------------------------
					if(score < 0) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
					
					if(score > 100) {
						System.out.println("������ 0������ 100�� �����Դϴ�.\n");
						continue;
					}
					//----------------------------------------------
					
					//- score 90 �� �̻� A
					//- score 80 �� �̻� B 
					//- score 70 �� �̻� C 
					//- �� �ܿ��� F 
					
					//-- ! score 0 ~ 100
					//-- ������ ���̾�� �Ѵ�. 
					//-- �� ���� ���� ����Ǹ� �ȵ� 
					
					//if(score >= 0 && score <= 100) 
				//	{	
						String grade = ""; 
						switch(score / 10) {
							case 10 :
								grade = "A+";
								break;
							case 9 :
								grade = "A"; 
								break; 
							case 8 :
								grade = "B";
								break;
							case 7 :
								grade = "C";
								break;
							default:
								grade = "F"; 
								break; 
						}
						
						System.out.println("���� : " + grade);
						System.out.println("");
					
					
					} while(true);
					
					
				}

			}

			