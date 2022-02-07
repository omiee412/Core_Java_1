package Overloading;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner (System.in);
        Employee e1= new Employee();
        System.out.println("Select search option.");
        System.out.println("1: Search by Id.");
        System.out.println("2: Search by Name.");

        int choice= sc1.nextInt();
        if (choice==1){
            System.out.println("Enter Employee Id.");
            int id = sc1.nextInt();
            e1.searchEmployee(id);
        }else if (choice==2){
            System.out.println("Enter Employee Name.");
            String name= sc1.next();
            e1.searchEmployee(name);
        }
    }
}
