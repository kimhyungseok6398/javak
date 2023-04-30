package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
public static void main(String[] args) {
		//List set map 
		//List 동적배열 (순서0 중복0)
		//set List 에서 중복이 불거능하게함 (순서x 중복x)
		//map 방번호를 내가 정험 {키 값 키 값 (키와 값에 쌍으로 구성)
		
		//set : HashSet (순서x 중복x) TreeSet(오름차순 정렬 중복x)
		//Iterator set 전체 사용을 위해서 많이 쓰임 (
		// Set : Map을 사용할 때, 중복값을 없애는 기능이 필요할 때
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
	
		//전체조회 Interator
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		TreeSet<String> ts = new TreeSet<String>();
		//추가 add
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("a");
		ts.add("b");
		ts.add("c");
		
		Iterator<String> iter = ts.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
}
}

