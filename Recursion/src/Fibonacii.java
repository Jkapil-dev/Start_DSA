public class Fibonacii {
    public static void main(String[] args){
//        int answer=fibo(50);
//        System.out.println(answer); this will take very much time and will not give answer
        int answer=fiboFormula(50);
        System.out.println(answer);

    }
    static int fiboFormula(int n){
        return (int)(Math.pow((1+Math.sqrt(5))/2,n));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
