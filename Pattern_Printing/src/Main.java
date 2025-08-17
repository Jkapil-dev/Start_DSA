public class Main {
    public static void main(String[] args){
        System.out.println("Pattern 1 :");
        patternOne(5);
        System.out.println("Pattern 2 :");
        patternTwo(5);
        System.out.println("Pattern 3 :");
        patternThree(5);
        System.out.println("Pattern 4 :");
        patternFour(5);
        System.out.println("Pattern 5 :");
        patternFive(5);
        System.out.println("Pattern 28 :");
        pattern28(5);
        System.out.println(" pattern 30 :");
        pattern30(5);
        System.out.println("Pattern 31: ");
        pattern31(4);


    }
    static void patternOne(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
   static void patternTwo(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
   }
    static void patternThree(int n){
        for (int row=1;row<=n;row++){
            for(int col=n-row+1; col >0;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternFour(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col + " " );
            }
            System.out.println();

        }
    }
    static void patternFive(int n){

        for(int row=1;row<=2*n;row++){
            int columnElement=row>n ?2*n-row :row;
            for (int col = 1; col <=columnElement; col++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern28(int n){
        for(int row=1;row<=2*n;row++){
            int columnElement=row>n ?2*n-row :row;
            int noOfSpaces=n-columnElement;
            for(int space=0;space<noOfSpaces;space++){
                System.out.print(" ");
            }
            for (int col = 1; col <=columnElement; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int totalSpaces=n-row+1;
            for(int space=1;space<=totalSpaces;space++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col =2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN=n;
        n=n*2;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ateveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryIndex+" ");
            }
            System.out.println();
        }
    }
}

