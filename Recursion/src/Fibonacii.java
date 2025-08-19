public class Fibonacii {
    public static void main(String[] args){
        int answer=fibo(50);
        System.out.println(answer);
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
