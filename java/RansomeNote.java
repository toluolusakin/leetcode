java.util.*;

public class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(Character m : magazine.toCharArray())
            map.put(m, map.getOrDefault(m, 0) + 1);
        
        for(Character r : ransomNote.toCharArray()){
            if(map.getOrDefault(r, 0) == 0)
                return false;
            map.put(r, map.get(r) - 1);
        }
        return true;
    }
}