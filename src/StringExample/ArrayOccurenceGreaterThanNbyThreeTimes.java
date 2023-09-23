package StringExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayOccurenceGreaterThanNbyThreeTimes {
    public static void maxOccurence(int nums[]) {
        List<Integer> a =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(var entry:map.entrySet()){
            if(entry.getValue()>nums.length/3){
                a.add(entry.getKey());
            }
        }
        System.out.print(a);
    }

    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        maxOccurence(nums);

    }
}
