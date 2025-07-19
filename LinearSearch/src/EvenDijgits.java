public class EvenDijgits {
    public static void main(String[] args){
        int[] arr={11,2,4,677};
        int answer=0;
        for(int number:arr){
             if(iseven(number)){
                 answer++;
             }
        }
        System.out.println(answer);
    }
   static   boolean iseven(int number){
        int digitCount = 0;
        if (number==0) {
            return false;
        }
        while(number>0){
            digitCount++;
            number = number / 10;
        }
        return digitCount % 2==0 ;

    }



}
