package Collection_Demo;
import java.util.*;

public class map_ex {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++");
		System.out.println("+++++ HashMap +++++");
		System.out.println("+++++++++++++++++++");
		Map<Integer,String> stu = new HashMap<Integer,String>();
		
		stu.put(10011, "Tim");
		stu.put(10021, "Tam");
		stu.put(10013, "Tom");
		stu.put(0, null);
		stu.put(10024, "Tum");
		stu.put(10024, "Tym");
		stu.put(10025, "Tym");
		//stu.put(null, "Tym");
		
		for(Map.Entry m:stu.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		
		System.out.println();
		System.out.println("=== Ascending Order ===");
		stu.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== Descending Order ===");
		stu.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== remove(10021) ===");
		stu.remove(10021);
		for(Map.Entry m:stu.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		System.out.println();
		System.out.println("=== replace(10011, \"Tim\",\"Vim\") ===");
		stu.replace(10011, "Tim","Vim");
		for(Map.Entry m:stu.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		System.out.println();
		System.out.println("=== replaceAll((k,v)->\"Kim\") ===");
		stu.replaceAll((k,v)->"Kim");
		for(Map.Entry m:stu.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}

		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("+++++ LinkHashMap +++++");
		System.out.println("+++++++++++++++++++++++");
		Map<Integer,String> stu2 = new LinkedHashMap<Integer,String>();
		
		stu2.put(10011, "Tim");
		stu2.put(10021, "Tam");
		stu2.put(10013, "Tom");
		stu2.put(0, null);
		stu2.put(10024, "Tum");
		stu2.put(10024, "Tym");
		stu2.put(10025, "Tym");
		//stu2.put(null, "Tym");
		
		for(Map.Entry m:stu2.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		
		System.out.println();
		System.out.println("=== Ascending Order ===");
		stu2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== Descending Order ===");
		stu2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== remove(10021) ===");
		stu2.remove(10021);
		for(Map.Entry m:stu2.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		System.out.println();
		System.out.println("=== replace(10011, \"Tim\",\"Vim\") ===");
		stu2.replace(10011, "Tim","Vim");
		for(Map.Entry m:stu2.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		System.out.println();
		System.out.println("=== replaceAll((k,v)->\"Kim\") ===");
		stu2.replaceAll((k,v)->"Kim");
		for(Map.Entry m:stu2.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}

		System.out.println();
		System.out.println("+++++++++++++++++++");
		System.out.println("+++++ TreeMap +++++");
		System.out.println("+++++++++++++++++++");
		TreeMap<Integer,String> stu3 = new TreeMap<Integer,String>();
		
		stu3.put(10011, "Tim");
		stu3.put(10021, "Tam");
		stu3.put(10013, "Tom");
		stu3.put(0, null);
		stu3.put(10024, "Tum");
		stu3.put(10024, "Tym");
		stu3.put(10025, "Tym");
		//stu2.put(null, "Tym");
		
		for(Map.Entry m:stu3.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		
		System.out.println();
		System.out.println("=== Ascending Order ===");
		stu3.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== Descending Order ===");
		stu3.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);;
		System.out.println();
		System.out.println("=== remove(10021) ===");
		stu3.remove(10021);
		for(Map.Entry m:stu3.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		
		System.out.println();
		System.out.println("Descending: "+stu3.descendingMap());
		System.out.println("Head Map: "+stu3.headMap(10013,true));
		System.out.println("Tail Map: "+stu3.tailMap(10013,true));
		System.out.println("Sub Map: "+stu3.subMap(10011,false,10024,true));
		
		System.out.println();
		System.out.println("=== replace(10011, \"Tim\",\"Vim\") ===");
		stu3.replace(10011, "Tim","Vim");
		for(Map.Entry m:stu3.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}
		System.out.println();
		System.out.println("=== replaceAll((k,v)->\"Kim\") ===");
		stu3.replaceAll((k,v)->"Kim");
		for(Map.Entry m:stu3.entrySet()) {
			System.out.println("Student "+m.getKey()+": "+m.getValue());
		}

	}

}
