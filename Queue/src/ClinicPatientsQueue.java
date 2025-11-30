import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClinicPatientsQueue {
        Queue<String> patients =new LinkedList<>();

        public void checkIn(String name){
            patients.add(name);
            System.out.println(name+"has checked in.");
        }
        public String assignPatient(){
            if(patients.isEmpty()){
                System.out.println("No patients wating...");
                return null;
            }
            String next=patients.poll();
            System.out.println("Next Patient: "+ next);
            return next;
        }
        public boolean isEmpty(){
            return patients.isEmpty();
        }

        public static void main(String[] args){
            ClinicPatientsQueue clinic =new ClinicPatientsQueue();
            Scanner sc= new Scanner(System.in);

            while(true){
                System.out.println("\n--- Medical Clinic System ---");
                System.out.println("1. Check-in Patient");
                System.out.println("2. Assign Patient to Doctor");
                System.out.println("3. Exit");
                System.out.print("Choose: ");

                int choice=sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        System.out.println("Enter patient name: ");
                        String name=sc.nextLine();
                        clinic.checkIn(name);
                        break;

                    case 2:
                        clinic.assignPatient();
                        break;

                    case 3:
                        System.out.println("Closing....");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
}
