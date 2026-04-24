package DSA.Arrays.Questions;

public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0 , r = 0   , blank=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L')l++;
            else if (ch=='R')r++;
            else blank++;
        }
        return Math.abs(l-r)+blank;
    }
}
