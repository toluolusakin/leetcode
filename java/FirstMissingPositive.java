import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums.length <= 0) return 1;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums) set.add(num);
        
        for(int i = 1; i <= nums.length + 1; i++)
        {
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}