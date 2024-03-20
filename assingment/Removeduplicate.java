package assingment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {
	public static void main(String[] args) {
		 String string="Goolge";
		 string=string.toLowerCase();
		 Set<Character>SetCharacter=new LinkedHashSet<Character>();
		 for (int i = 0; i < string.length(); i++) {
			 SetCharacter.add(string.charAt(i));
		 
			 for (Character character : SetCharacter) {
				 System.out.println(character);
				
			}
		 }
			
				
			}
			
		
		 
		 
		 
	
				
			}
			
	