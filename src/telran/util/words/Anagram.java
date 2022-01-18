package telran.util.words;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

		/**
		 * 
		 * @param word
		 * @param anagram
		 * @return true if anagram contains a word comprising of only all letters from a given word (case insensitive)
		 * implementation requirements: O[N], using only one map and two passing's over (one is over word and other is over anagram)
		 */
			static int initialCounterValue = 0;
			public static boolean isAnagram(String word, String anagram) {
				long start = System.nanoTime();
			//TODO - Done
				if(anagram.isEmpty() || word.isEmpty() || anagram.length() != word.length()) {
					return false;
				}
				boolean res = Arrays.equals(sorted(word.toLowerCase().toCharArray()), sorted(anagram.toLowerCase().toCharArray()));
				long end = System.nanoTime();
				System.out.println(end - start);
				return res;
			}

			public static char[] sorted(char[] charArray) {
				Arrays.sort(charArray);;
				return charArray;
				
			}
			
		}