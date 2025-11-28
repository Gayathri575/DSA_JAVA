package MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

class pallikoodam {

    private static ArrayList<manavan> manavaaa = new ArrayList<>();

    static class manavan {
        private String name;
        private String id;
        private int age;
        private double fees;

        manavan(String name, String id, int age, double fees) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.fees = fees;
        }

        public String toString() {
            return "Name: " + name + " | Roll No: " + id + " | Age: " + age + " | Fees: " + fees;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choice = 0;

        while (Choice != 3) {
            displayMenu();

            System.out.print("Enter choice: ");
            Choice = sc.nextInt();
            sc.nextLine();

            switch (Choice) {
                case 1: addDet(sc); break;
                case 2: viewDet(); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Selection");
            }
        }

        sc.close();
    }

    private static void viewDet() {
        if (manavaaa.isEmpty()) {
            System.out.println("No Manavargal Found!");
            return;
        }
        for (manavan mn : manavaaa) {
            System.out.println(mn);
        }
    }

    private static void addDet(Scanner sc) {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String id = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Fees Amount (5000): ");
        double fees = sc.nextDouble();

        if (fees != 5000) {
            System.out.println("Invalid Fees Amount!");
            return;
        }

        manavan mn = new manavan(name, id, age, fees);
        manavaaa.add(mn);

        System.out.println("Student Added Successfully!");
    }

    private static void displayMenu() {
        System.out.println("\n--- Pallikoodam Menu ---");
        System.out.println("1. Add Manavan");
        System.out.println("2. View Manavargal Details");
        System.out.println("3. Exit");
    }
}
