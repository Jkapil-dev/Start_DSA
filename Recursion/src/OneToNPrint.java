public class OneToNPrint {
    static void print(int num , int target){
        if(num==target){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print(num+1,target);
    }
    public static void main(String[] args) {
        print(0,10);

    }
}
