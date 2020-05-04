public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        if (J == null || J.length() == 0) {
            return 0;
        }
        int count = 0;
        for (Character c : S.toCharArray()){
            if(J.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}