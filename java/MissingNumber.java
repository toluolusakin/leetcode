import java.util.*; 

public class MissingNumber {
    public int missingNumber(int[] nums) {
        if (nums.length <= 0) return 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums) set.add(num);
        
        for(int i = 0; i < nums.length + 1; i++)
        {
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}