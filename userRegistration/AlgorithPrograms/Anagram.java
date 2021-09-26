package userRegistration.AlgorithPrograms;

import java.util.*;
public class Anagram {
    /**
     * checks if str1 and str2 are anagrams
     * @param str1
     * @param str2
     */
    public static void isAnagram(String str1,String str2)
    {
        //String s1 = str1.replaceAll("\\s", "");
       // String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (str1.length() != str2.length())
        {
            status = false;
        }
        else
        {
            char[] ArrayS1 = str1.toLowerCase().toCharArray();
            char[] ArrayS2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        isAnagram(string1,string2);
    }
}
