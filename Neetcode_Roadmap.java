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
