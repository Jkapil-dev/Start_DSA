public class NumberExampleRecursion {
    public static void main(String[] args){
        printNumber(1);

    }
    static void printNumber(int num){
        if(num==5){
            System.out.println(5);
            return;
        }
        System.out.println(num);
        printNumber(num+1);
    }

}
