/*  QUESTION 1 :-  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false. */

/* 
import java.util.*;
public class Neetcode_Roadmap {
    public static boolean containduplicates(int nums[]){

Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++){
    if(nums[i]==nums[i+1]){
        return true;
    }
}
return false;


    }
    public static void main (String args []){
        int nums [] = {1,2,3,4,5,4};
       boolean ans = containduplicates(nums);
       System.out.println(ans);
    }
}

*/

/* question 2 :- Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different. */

import java.util.*;
public class Neetcode_Roadmap{
    public static boolean anagram(String s,String t){
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String sorted1 = new String(ch1);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String sorted2 = new String(ch2);
        if(sorted1.equals(sorted2)){
            return true;
        }
        return false;
        

    }
    public static void main (String [] args){
        String s = "racecar";
        String t = "carrace";
        boolean ans = anagram(s,t);
        System.out.println(ans);
    }
}