package ca.vollov.alg.anagrams;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAnagrams {
	
	Anagrams a = new Anagrams();
	
	@Test
	public void hello() {
		assertTrue("'hello' is an anagram of 'llohe'", a.areAnagrams("hello", "llohe"));
	}
	
	@Test
	public void hi() {
		assertTrue("'Whoa! Hi!' is an anagram of 'Hi! Whoa!'", a.areAnagrams("Whoa! Hi!", "Hi! Whoa!"));
	}
	
	@Test
	public void one() {
		assertFalse("'One one' is not an anagram of 'One one c'", a.areAnagrams("One one", "One one c"));
	}
}
