import java.util.*;

public class ListEx {
	
	public static void main(String[] args) {
		
		//List list = new List(); // List는 인터페이스이기 떄문에
									// 독자적으로는 객체를 생성할수 없다.
		
	List list = new ArrayList(10); // List 인터페이스 구현
								   // 한 ArrayList 사용
	
	list.add(1); // 호출할때 마다 ArrayList의 길이의 영향
	list.add(2);
	list.add(3); 
	list.add(4);
	
//	list.add(3, 5); // ArrayList 길이의 영향을 미치지 않음.
	
	System.out.println(list);
	System.out.println("길이 :" + list.size());
	
	for(int i = 0; i < list.size(); i++) {
		
		 System.out.println(list.get(i));
		// 배열은 list[i] 리스트는 객체이기 때문에 .get()
	
		}
	
	    //list.set(2, 100);
		list.add(2, 200);
		//list.set(100, 200); // ArrayList의 길이를 넘어서니까.
		System.out.println(list);
		
		//--향상된 for문
		for(var obj : list) {
			System.out.println(obj);
		}
		// contains
		if(list.contains(200)) {
			
			int index = list.indexOf(200);
			System.out.println("숫자 200이 존재합니다. 인덱스"+ index);
			System.out.println(list.get(index));
			
		} else {
			System.out.println("숫지 200이 존재하지 않습니다.");
		}
	
		// indexOf 값 서치
		if(list.indexOf(1000) < 0) {
			//값이 없음
			System.out.println("숫자 1000은 존재하지 않음");
		} else {
			//값이 있음
			System.out.println("숫자 1000은 존재");
		}
		
		// remove
		list.remove(2);
		System.out.println(list + ":" + list.size());
	}
}
