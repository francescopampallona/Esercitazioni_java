import java.util.*;

public class Main{
	
	public static boolean isAnagram(String p1, String p2){
		HashMap<Character, Integer> occorrenze= new HashMap<>();
		for(char c: p1.toCharArray()){
			if(occorrenze.containsKey(c)){
				occorrenze.put(c, occorrenze.get(c)+1);
			} else{
				occorrenze.put(c, 1);
			}
		}
		for(char c: p2.toCharArray()){
			if(occorrenze.containsKey(c)){
				occorrenze.put(c, occorrenze.get(c)-1);
			} else{
				return false;
			}
		}
		for(Character c: occorrenze.keySet()){
			if(occorrenze.get(c)!=0){
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la prima parola:");
		String p1 = scanner.nextLine();
		System.out.println("Inserisci la seconda parola:");
		String p2 = scanner.nextLine();
		if(isAnagram(p1,p2)){
			System.out.println("Sono anagrammi");
		}else{
			System.out.println("Non sono anagrammi");
		}
		
	}

}