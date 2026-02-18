package DSA.Arrays.Qustions;
import java.util.Scanner;
public class ScheduleAlgo {


        public static void main(String[] args) {

            //variable decleration and all

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many processes are there?");
            int arrRow=sc.nextInt();
            int[][] FCFSArray= new int[arrRow][6];

            int completationTime =0;


            //input of values
            for(int row=0 ; row<arrRow ;row++){
                FCFSArray[row][0]=(row+1);
                for(int col = 1 ; col <6 ;col++){
                    if(col==1){
                        System.out.println("Enter Arrival time of process "+(row+1));
                        FCFSArray[row][col]=sc.nextInt();
                    }else if(col==2){
                        System.out.println("Enter Burst time of process "+(row+1));
                        FCFSArray[row][col]=sc.nextInt();
                    }
                    if(row==0){
                        FCFSArray[0][3]=(FCFSArray[0][1]+FCFSArray[0][2]);
                        completationTime=FCFSArray[0][3];
                    }else{
                        completationTime=FCFSArray[row-1][3]+FCFSArray[row][2];
                        FCFSArray[row][3] = completationTime ;

                    }
                    FCFSArray[row][4] =  FCFSArray[row][3] - FCFSArray[row][1]  ;
                    FCFSArray[row][5] =  FCFSArray[row][4] - FCFSArray[row][2]  ;
                }
            }

            //value input done
            //print array
            printArr(FCFSArray,arrRow,6);

        }

        static void printArr(int[][] arr, int rowLen , int colLne){
            int avgTAT=0;
            int avgWT=0;
            System.out.println("P | AT | BT | CT | TAT | WT |");
            for(int i=0 ; i < rowLen; i++){
                for(int j=0 ; j< colLne;j++){

                    System.out.print(" "+arr[i][j] +" | ");
                }
                System.out.println();
            }

        }

    }


