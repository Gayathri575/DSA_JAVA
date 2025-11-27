package MiniProject ;
import java.util.ArrayList;
import java.util.Scanner;

class school {
    private static ArrayList <xB> storage = new ArrayList<>();
    static class xB {
        private  String name  ;
        private String id ;
        private int phNo ;

        xB(String name , String id , int phNo){
            this.name = name ;
            this.id = id ;
            this.phNo = phNo;
        }
        public String toString ( ){
            return "Name :" + name +" "+"Roll No :"+id+" "+"Phone Num"+ phNo ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choice = 0;


        while ( Choice != 3){

            displayOptions();
            System.out.print("Enter choice: ");
            Choice = sc.nextInt();
            sc.nextLine();

            switch(Choice){
                case 1 :
                    addDetails(sc);
                    break;
                case 2:
                    viewDetails();
                    break;
                case 3 :
                    System.out.println("Exited");
                    break;
                default :
                    System.out.println("Invalid Number");
            }
        }
    }
    private static void displayOptions() {
        System.out.println("1.Add");
        System.out.println("2.View");
        System.out.println("3.Exit");
    }

    private static void viewDetails() {
        for (xB bSection : storage){
            System.out.println(bSection);
        }
    }

    private static void addDetails(Scanner sc) {

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter RollNo");
        String id = sc.next();

        System.out.println("Enter phNo");
        int phNo = sc.nextInt();
        sc.nextLine();

        xB sch = new xB(name, id, phNo);
        storage.add(sch);

        System.out.println("Details Added Successfully");


    }

}
