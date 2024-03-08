package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>(); //Map은 List처럼 인덱스가 없고 키가 존재한다. (순서 유지가 안됨)
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("yu", 90); //add = put
		map1.put("kim", 80); //add 
		map1.put("lee", 70); //add 
		
		System.out.println(map1);
		System.out.println("yu: "+map1.get("yu")); // 개별 요소 접근시 인덱스가 아니라 키로 입력 해야됨
		//맵 순회1 : Iterator(분리자)에 의한 접근
		//keys={yu,kim,lee} 
		System.out.println("-----------맵순회1-----------");
		Iterator<String> keys = map1.keySet().iterator(); // 맵의 키모음(KeySet)이 하나의 
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println(key+" : "+map1.get(key)); 
		}
		//맵 순회2 : entrySet(키와 값의 쌍)에 의한 접근 (한쌍=entry)
		System.out.println("-----------맵순회2-----------");
		for(Map.Entry<String, Integer> en: map1.entrySet()) {
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key+" : "+value);
		}
		//맵 순회3 : keySet에 의한 접근
		System.out.println("-----------맵순회3-----------");
		for(String key:map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
		System.out.println("-----------맵순회3-----------");
		
		if(map1.containsKey("lee")) { // containsKey 특정 키의 존재 유무 
			System.out.println("lee : "+map1.get("lee"));
		}else {
			System.out.println("키가 lee인 요소는 없습니다.");
		}
		
		if(map1.containsValue(100)) {
			System.out.println("100점이 있습니다");
		}else {
			System.out.println("100점은 없습니다");
		}
		//map2 = Hashtable
		map2.put("김","1코스"); 
		map2.put("이","2코스");
		map2.put("유","3코스");
		map2.put("최","4코스");
		map2.put("박","5코스");
		map2.put("박","6코스"); //키는 중복될 수 없음 마지막 키가 출력됨
		System.out.println(map2);
		
		map2.remove("최"); // 특정 key 삭제
		System.out.println(map2);
		map2.clear();  // 전부 삭제, 비우기
		
		//map3 배열의 값을 TreeMap3에 대입
		String[] names = {"유정환","최여명","박경진","이은진","김지우","김경룡","이동근","이혁준","손준혁","강승영"};
		for(int i=0;i<=9;i++) {
			map3.put(i, names[i]);
		}
		System.out.println();
		System.out.println("인원수 : "+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(i);
			System.out.println(key+" : "+value);
		}
			System.out.println();
		//map4 Property의 키(필드이름)과 값은 모두 문자열로 취급한다. 
		map4.setProperty("name","유정환");
		map4.setProperty("age","32");
		map4.setProperty("height","173");
		map4.setProperty("kor","90");
		map4.setProperty("eng","80");
		map4.setProperty("mat","70");
		System.out.println("이름 : "+map4.getProperty("name"));
		System.out.println("이름 : "+map4.getProperty("age"));
		
		
	}
}
