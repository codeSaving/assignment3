package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateChars {
    public static void main(String[] args) {
//        Find the Duplicate Characters in a String:
//        Write a program to find all duplicate characters
//        in a given string and print their counts.
//        Example Input: "programming"
//        Example Output: g: 2, r: 2, m: 2
                String sample = "programming";
                System.out.println(findDuplicateCharsInString(sample));


//        Find the Most Frequent Character: Write a program to
//        find the most frequent character in a string using a HashMap.
//                Example Input: "success, nice!"
//        Example Output: s, c
                System.out.println(findMostFrequentChar("success, nice!"));
                System.out.println(findMostFrequentChars("success, nice!"));

                // give us the count of most repeated word in a string
                //
                String str = "this is a sample test string that is test for the method sample sample";
                System.out.println(findMostFrequentWord(str));


//        Find Top K Frequent Words: Write a program
//        to find the top K most frequent words in an array of strings using a HashMap.
//                Example Input: ["i", "love", "coding", "i", "love", "java"], K = 2
//        Example Output: ["i", "love"]

            }

            public static String findMostFrequentWord(String str){
                String [] words = str.split(" ");
                HashMap<String, Integer> wordCount = new HashMap<>();
                for (String w: words){
                    if(wordCount.get(w) == null){
                        wordCount.put(w, 1);
                    }else {
                        wordCount.put(w, wordCount.get(w) +1);
                    }
                }
                int count = 0;
                String res = "";
                for (String s: wordCount.keySet()){
                    if(wordCount.get(s) > count){
                        count = wordCount.get(s);
                        res = s;
                    }
                }
                return res;
            }

            public static char findMostFrequentChar(String str){
                HashMap<Character, Integer> chars = findOccurrenceOfChar(str);
                int max = 0;
                char res = '\0';
                for(char c: chars.keySet()){
                    if(chars.get(c) > max){
                        max = chars.get(c);
                        res = c;
                    }
                }
                return res;
            }
            public static HashSet<Character> findMostFrequentChars(String str){
                HashMap<Character, Integer> chars = findOccurrenceOfChar(str);
                HashSet<Character> res = new HashSet<>();
                int max = 0;
                for(char c: chars.keySet()){
                    if(chars.get(c) > max){
                        max = chars.get(c);
                    }
                }
                for (char c: chars.keySet()){
                    if(chars.get(c) == max){
                        res.add(c);
                    }
                }
                return res;
            }

            public static HashMap<Character, Integer> findDuplicateCharsInString(String str) {
                HashMap<Character, Integer> chars = findOccurrenceOfChar(str);
                HashMap<Character, Integer> res = new HashMap<>();
                for(char c: chars.keySet()){
                    if(chars.get(c) > 1){
                        res.put(c, chars.get(c));
                    }
                }
                return res;
            }

            public static HashMap<Character, Integer> findOccurrenceOfChar(String str){
                HashMap<Character, Integer> chars = new HashMap<>();
                for (char c: str.toCharArray()){
                    if(chars.containsKey(c)){
                        chars.put(c, chars.get(c)+1);
                    } else {
                        chars.put(c, 1);
                    }
                }
                return chars;
            }



        }

