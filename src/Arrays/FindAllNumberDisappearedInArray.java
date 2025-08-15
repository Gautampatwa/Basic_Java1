package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//448. Find All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of
// all the integers in the range [1, n] that do not appear in nums.
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
public class FindAllNumberDisappearedInArray {
    public static void main(String[] args) {
         int[] nums={4,3,2,7,8,2,3,1,11,11};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        System.out.println(set);
        String originalString = "  This      is  a   string   with   extra   spaces  ";
        String singleSpaceString = originalString.replaceAll("\\s+", " ").trim();
        System.out.println(singleSpaceString); // Output: This is a string with extra spaces
        return list;
    }
}
