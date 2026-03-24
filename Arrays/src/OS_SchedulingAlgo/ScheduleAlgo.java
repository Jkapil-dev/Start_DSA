package DSA.Arrays.OS_SchedulingAlgo;
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

    static void printArr(int[][] arr, int rowLen , int colLen){
        int totalTAT = 0;
        int totalWT = 0;

        System.out.println("\n================ FCFS Scheduling Table ================");
        System.out.printf("%-5s %-5s %-5s %-5s %-6s %-5s\n", "P", "AT", "BT", "CT", "TAT", "WT");
        System.out.println("-------------------------------------------------------");

        for(int i = 0; i < rowLen; i++){
            System.out.printf("%-5d %-5d %-5d %-5d %-6d %-5d\n",
                    arr[i][0], arr[i][1], arr[i][2],
                    arr[i][3], arr[i][4], arr[i][5]);

            totalTAT += arr[i][4];
            totalWT += arr[i][5];
        }

        double avgTAT = (double) totalTAT / rowLen;
        double avgWT = (double) totalWT / rowLen;

        System.out.println("-------------------------------------------------------");
        System.out.printf("Average Turnaround Time : %.2f\n", avgTAT);
        System.out.printf("Average Waiting Time    : %.2f\n", avgWT);
    }

    }


