// import java.util.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Map map = new HashMap(); //Map은 인터페이스라서 new Map 사용불가
		
		map.put("name", "추상엽");
		map.put("age", 29);
		map.put("grade", "말단");
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("직책 : " + map.get("grade"));
		
		//---List 에 사용
		List company = new ArrayList();
	
		for(int i = 0; i < 50; i++) {
			
			Map employee = new HashMap();
			employee.put("name", "추상엽_" + i);
			employee.put("age", 29 + i);
			employee.put("grade", "말단_" + i);
			company.add(employee);
			
			
		}
		System.out.println(company);
		//--Student 객체 넣기
		List school = new ArrayList();
		
		for(int i = 0; i < 50; i++) {
			Student std = new Student();
			std.setName("추상엽_" + i);
			std.setGrade(i + "학년");
			std.setAge(29 + i);
			school.add(std);
		}
		
		Student std_1 = (Student)school.get(2); //type missmatch 형변환으로 
		std_1.sayName();
		
		Iterator it = school.iterator();
		while(it.hasNext()) {
			((Student)(it.next())).sayName();
		}
		
		
				
		
	}
}
