import java.util.HashMap;

public class HashMapAwesomeness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Hello", "World!");
		fun.put("Fuck", "You");
		fun.put("I am a", "Programmer");
		
		fun.remove("Fuck");
		
		System.out.println(fun);
		
		fun.replace("Hello", "Again");
		
		System.out.println(fun);
		
		System.out.println(fun.containsKey("Hello"));
		System.out.println(fun.containsKey("World!"));
		
		System.out.println(fun.containsValue("Again"));
		System.out.println(fun.containsValue("Hello"));
		
		System.out.println(fun.values());
		System.out.println(fun.keySet());
		
	}
}
 