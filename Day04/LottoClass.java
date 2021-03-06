package Day04;

public class LottoClass {
	public static void main(String[] args) {
		
		
		//--로또 번호 1 ~45 까지 배열에 입력
		int[] lotNums = new int[45];
		for(int i=0;i<lotNums.length;i++) {
			lotNums[i] = i+1;
		}
		//--로또 번호 입력값 확인
		
		int random_num = 0; // 난수
		int num_of_printed = 0; // 출력된 로또번호 수
		System.out.println("#### 이번주 로또 번호!! ####");
		System.out.print("로또 번호는 : ");
		
		//예제1 for문으로 사용
		/* for(int i=0;i<lotNums.length && num_of_printed <=6;i++) {
			
			random_num = (int)(Math.random()*100) + 1;
			if(random_num % 2 == 0) {
			System.out.println(lotNums[i] + " ");
			num_of_printed ++;
					}
			
			//if(num_of_printed ==6) break;
		}
		*/
		//무조건 6개가 나오게 하겠다.
		// -- 조건 : 1~45 까지의 숫자를 사용한다.
		//		  : 6개의 숫자를 뽑는다,
		
		//--	: 아래의 코드의 문제점
		//  	: 1. 출력했을떄, 조건의 범위가 넓으면
		//		: 6개이상의 숫자를 출력한다.
		//		: 2. 조건의 범위가 너무 넓어서, 로또 번호가 
		//				너무 촘촘하게 나오더라 (random % 2 = 약 50%)
		//				-> 약 10% (random % 9 = 약 10%)
		//		: 3. 2번 처럼 확률을 낮추니까, 출력수가 줄어들어서
		//		: 배열의 인덱스(0-44까지)를 넘어서는 i값이 사용되는 경우도있더라.
		//		  (44까지 i에 사용되면 다시 처음으로 이동)
		//		: 4. 확률상 중복된 번호가 나올수도 있더라.
		//		
		int i = 0;
		num_of_printed = 0;
		while(true) {
			
			if(i > lotNums.length - 1) { // 3.번 해결
				i = 0;
				continue;
			}
		
			
			random_num = (int)(Math.random()*100) + 1;
			if(lotNums[i] > 0 && random_num % 9 == 0) { // 2,4번 해결
			System.out.println(lotNums[i] + " ");
			lotNums[i] = -1; // 4번해결
			num_of_printed ++;
			}
			
			i++;
			if(num_of_printed == 6) break; // 1번 해결
		}
		
		
		
		
	}

}
