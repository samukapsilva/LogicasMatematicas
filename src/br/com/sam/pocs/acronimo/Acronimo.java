package br.com.sam.pocs.acronimo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Acronimo {

	public static void main(String[] args) {

		
		String s1 = "samuel";
	    String s2 = "leumas";
	    boolean isAnagram = false;
	    if (s1.length() == s2.length()) {
	        char[] s1AsChar = s1.toCharArray();
	        char[] s2AsChar = s2.toCharArray();
	        Arrays.sort(s1AsChar);
	        Arrays.sort(s2AsChar);
	        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
	        System.out.println("Primeiro algoritmo..." + isAnagram);
	        System.out.println("Segundo algoritmo..." + areAnagrams(s1, s2));
	    }
	    
	}
	
	// outra forma de ver se as palavras são acronimas
   static boolean areAnagrams(CharSequence palavra1, CharSequence palavra2) {
        int tamanho = palavra1.length();
        if (tamanho != palavra2.length()){
            return false;
        }
       
        Map<Integer, Integer> mapPadrao = new HashMap<>(64);
        palavra1.codePoints().forEach(c -> mapPadrao.merge(c, 1, Integer::sum));

        
        for (int i = 0, c = 0; i < tamanho; i += Character.charCount(c)) {
            int cc = mapPadrao.getOrDefault((c = Character.codePointAt(palavra2, i)), 0);
            if (cc == 0)                        
                return false;            
            mapPadrao.put(c, cc - 1);
        }
        return true;
    }

}
