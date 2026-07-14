public class Factorial {
    static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        int num=3;
        int ans=fact(3);
        System.out.println(ans);
    }

}
