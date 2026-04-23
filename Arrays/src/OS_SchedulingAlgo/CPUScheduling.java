package DSA.Arrays.OS_SchedulingAlgo;
import java.util.Scanner;



public class CPUScheduling {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nCPU Scheduling Algorithms");
            System.out.println("1. FCFS");
            System.out.println("2. SJF (Non Preemptive)");
            System.out.println("3. SRTF (Preemptive)");
            System.out.println("4. Priority (Non Preemptive)");
            System.out.println("5. Priority (Preemptive)");
            System.out.println("6. Round Robin");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1: fcfs(); break;
            case 2: sjf(); break;
            case 3: srtf(); break;
            case 4: priorityNon(); break;
            case 5: priorityPre(); break;
            case 6: roundRobin(); break;
            case 7: System.exit(0);
            default: System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- FCFS ----------------

    static void fcfs() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][6];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();
            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();
        }

        int time = 0;

        for (int i = 0; i < n; i++) {

            if (time < arr[i][1])time = arr[i][1];

            time += arr[i][2];

            arr[i][3] = time;
            arr[i][4] = arr[i][3] - arr[i][1];
            arr[i][5] = arr[i][4] - arr[i][2];
        }

        printArr(arr, n, 6);
    }

    // ---------------- SJF Non Preemptive ----------------

    static void sjf() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][6];
        boolean[] done = new boolean[n];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();

            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();
        }

        int completed = 0;
        int time = 0;

        while (completed < n) {

            int minBT = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (!done[i] && arr[i][1] <= time && arr[i][2] < minBT) {
                    minBT = arr[i][2];
                    index = i;
                }
            }

            if (index == -1) {
                time++;
                continue;
            }

            time += arr[index][2];

            arr[index][3] = time;
            arr[index][4] = arr[index][3] - arr[index][1];
            arr[index][5] = arr[index][4] - arr[index][2];

            done[index] = true;
            completed++;
        }

        printArr(arr, n, 6);
    }

    // ---------------- SRTF ----------------

    static void srtf() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][6];
        int[] remaining = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();

            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();

            remaining[i] = arr[i][2];
        }

        int completed = 0;
        int time = 0;

        while (completed != n) {

            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (arr[i][1] <= time && remaining[i] > 0 && remaining[i] < min) {

                    min = remaining[i];
                    index = i;
                }
            }

            if (index == -1) {
                time++;
                continue;
            }

            remaining[index]--;
            time++;

            if (remaining[index] == 0) {

                completed++;

                arr[index][3] = time;
                arr[index][4] = arr[index][3] - arr[index][1];
                arr[index][5] = arr[index][4] - arr[index][2];
            }
        }

        printArr(arr, n, 6);
    }

    // ---------------- Priority Non Preemptive ----------------

    static void priorityNon() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][7];
        boolean[] done = new boolean[n];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();

            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();

            System.out.print("Priority P" + (i + 1) + ": ");
            arr[i][6] = sc.nextInt();
        }

        int completed = 0;
        int time = 0;

        while (completed < n) {

            int highest = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (!done[i] && arr[i][1] <= time && arr[i][6] < highest) {
                    highest = arr[i][6];
                    index = i;
                }
            }

            if (index == -1) {
                time++;
                continue;
            }

            time += arr[index][2];

            arr[index][3] = time;
            arr[index][4] = arr[index][3] - arr[index][1];
            arr[index][5] = arr[index][4] - arr[index][2];

            done[index] = true;
            completed++;
        }

        printArr(arr, n, 6);
    }

    // ---------------- Priority Preemptive ----------------

    static void priorityPre() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][7];
        int[] remaining = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();

            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();

            System.out.print("Priority P" + (i + 1) + ": ");
            arr[i][6] = sc.nextInt();

            remaining[i] = arr[i][2];
        }

        int completed = 0;
        int time = 0;

        while (completed != n) {

            int highest = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (arr[i][1] <= time && remaining[i] > 0 && arr[i][6] < highest) {

                    highest = arr[i][6];
                    index = i;
                }
            }

            if (index == -1) {
                time++;
                continue;
            }

            remaining[index]--;
            time++;

            if (remaining[index] == 0) {

                completed++;

                arr[index][3] = time;
                arr[index][4] = arr[index][3] - arr[index][1];
                arr[index][5] = arr[index][4] - arr[index][2];
            }
        }

        printArr(arr, n, 6);
    }

    // ---------------- Round Robin ----------------

    static void roundRobin() {

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][6];
        int[] remaining = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i][0] = i + 1;

            System.out.print("Arrival time P" + (i + 1) + ": ");
            arr[i][1] = sc.nextInt();

            System.out.print("Burst time P" + (i + 1) + ": ");
            arr[i][2] = sc.nextInt();

            remaining[i] = arr[i][2];
        }

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        int time = 0;
        boolean done;

        do {

            done = true;

            for (int i = 0; i < n; i++) {

                if (remaining[i] > 0 && arr[i][1] <= time) {

                    done = false;

                    if (remaining[i] > tq) {

                        time += tq;
                        remaining[i] -= tq;

                    } else {

                        time += remaining[i];
                        remaining[i] = 0;

                        arr[i][3] = time;
                        arr[i][4] = arr[i][3] - arr[i][1];
                        arr[i][5] = arr[i][4] - arr[i][2];
                    }
                }
            }

        } while (!done);

        printArr(arr, n, 6);
    }

    // ---------------- Printing ----------------

    static void printArr(int[][] arr, int rowLen , int colLen){

        int totalTAT = 0;
        int totalWT = 0;

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