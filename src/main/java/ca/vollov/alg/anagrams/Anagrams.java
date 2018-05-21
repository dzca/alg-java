package ca.vollov.alg.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Anagrams {
	public boolean areAnagrams(String a, String b) {
		System.out.println("testing====" + a);
		Map<Character, Integer> mapa = buildCharMap(a);
		Map<Character, Integer> mapb = buildCharMap(b);
		
		if(mapa.size() != mapb.size()) {
			return false;
		}
		
		return !mapa.entrySet().stream().anyMatch((e)-> { 	
			return !mapb.get(e.getKey()).equals(e.getValue());
		});
	}
	
	public void add(Character c, Map<Character, Integer> charMap) {
		if(charMap.get(c) == null) {
			charMap.put(c, new Integer(1));
		} else {
			charMap.put(c, charMap.get(c) + 1); 
		}
	}
	
	public Map<Character, Integer> buildCharMap(String str){
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		str = str.replaceAll("[\\W]", "").toLowerCase();
		Stream<Character> charStream = str.chars().mapToObj(i->(char)i);
		
		charStream.forEach(item -> add(item, charMap));
		return charMap;
	}
}
