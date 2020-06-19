package kr.or.test;

import java.util.HashMap;
import java.util.Map;

class Container<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
}

class ContainerKV<K,V> {
   private K key;
   private V value;

   public void set(K key, V value) {
	   this.key = key;
	   this.value = value;
   }
   public K getkey() {
       return key;	   
   }

   public V getValue() {
	   return value;
	
}
}

   public class GenericTypeUser {
	   public static void main (String[] args) {
		   ContainerKV<String,String> containerKV1 =
				   new ContainerKV<String,String>();
		   containerKV1.set("name", "홍길동");
		   String nameK = containerKV1.getkey();
		   String nameV = containerKV1.getValue();
		   System.out.println("입력된 ContainerKV변수의 키 : " + nameK);
		   System.out.println("입력된 ContainerKV변수의 값 : " + nameV);
		   Map<String, String> tableKV = new HashMap<String, String>();
		   tableKV.put("userid","ddddd");
		   tableKV.put("userpw","1234");
		   tableKV.put("age", "3");//age key에 값을 입력.
		   System.out.println("아이디 : " + tableKV.get("userid"));
		   System.out.println("패스워드 : " + tableKV.get("userpw"));
		   System.out.println("이름 : " + tableKV.get("age"));
		   //컨테이너1 t변수 : 스트링 홍길동

		   Container<String> Container1 = 
		   new Container<String>();
		   
		   
	   }
   }