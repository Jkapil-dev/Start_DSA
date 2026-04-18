package DSA.Arrays.Questions;

public class MirrorDistanceOfInteger {
    static public int mirrorDistance(int n){
        int num=n;
        int revInt=0;
        while(num>0){
            int remainder = num%10;
            num=num/10;
            revInt=revInt*10+remainder;
        }
        return Math.abs(revInt-n);
    }

    public static void main(String[] args) {
        int num=25;
        int mirror=mirrorDistance(num);
        System.out.println(mirror);
    }
}
