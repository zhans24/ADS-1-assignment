package org.example;


import static org.example.StorageProblems.*;
import static org.example.ProblemTime.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" \uD83D\uDE07 Hello to answer book \uD83D\uDE07 ");

        while (true){
            System.out.println("\nEnter '0' to exit");
            System.out.print("Which task do u want to check (1-10) : ");

            int choice=scanner.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    Problem1();
                    break;
                case 2:
                    Problem2();
                    break;
                case 3:
                    Problem3();
                    break;
                case 4:
                    Problem4();
                    break;
                case 5:
                    Problem5();
                    break;
                case 6:
                    Problem6();
                    break;
                case 7:
                    Problem7();
                    break;
                case 8:
                    Problem8();
                    break;
                case 9:
                    Problem9();
                    break;
                case 10:
                    Problem10();
                    break;
                default:
                    System.out.println("!!!!!!! Enter number from range 1-10 correctly !!!!!!!");
            }
        }
    }
}