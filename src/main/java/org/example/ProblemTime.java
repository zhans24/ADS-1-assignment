package org.example;

import javax.management.timer.Timer;
import java.sql.Time;
import java.util.Arrays;

import static org.example.StorageProblems.*;
import static org.example.StorageProblems.avg;

public class ProblemTime {

    public static double ExecuteTimer(double start,double end){
        return (end-start) / 1_000_000 ;
    }

    public static void Problem1(){
        System.out.print("\nEnter length of array:");
        int n=scanner.nextInt();

        System.out.print("Fill the array :");
        int[] array=generateArr(n);

        double start=System.nanoTime();
        double ans=(min(array));
        double end=System.nanoTime();

        System.out.println("Minimum in the array:"+ans);
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");
    }


    public static void Problem2(){
        System.out.print("\nEnter length of array:");
        int n=scanner.nextInt();

        System.out.print("Fill the array :");
        int[] array=generateArr(n);

        double start=System.nanoTime();
        double ans=(avg(array));
        double end=System.nanoTime();

        System.out.println("Average of the array:"+ans);
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");
    }

    public static void Problem3(){
        System.out.print("\nEnter number to check:");
        int n=scanner.nextInt();

        double start=System.nanoTime();
        String ans=isPrime(n);
        double end= System.nanoTime();

        System.out.println("Number is : "+ans);
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");
    }

    public static void Problem4(){
        System.out.print("Enter number to get factorial:");
        int n=scanner.nextInt();

        double start=System.nanoTime();
        int ans=factorial(n);
        double end=System.nanoTime();

        System.out.printf("Factorial of %d : %d ",n,ans);
        System.out.println("\nTime duration:"+ExecuteTimer(start,end)+"ms");
    }

    public static void Problem5(){
        System.out.print("Enter number to get fibonacci:");
        int n=scanner.nextInt();

        double start=System.nanoTime();
        int ans=fibonacci(n);
        double end=System.nanoTime();

        System.out.printf("Fibonacci element of %d : %d",n,ans);
        System.out.println("\nTime duration:"+ExecuteTimer(start,end)+"ms");
    }

    public static void Problem6(){
        System.out.print("Enter number to be raised:");
        int a=scanner.nextInt();

        System.out.print("Enter number of power:");
        int b=scanner.nextInt();

        double start=System.nanoTime();
        int ans=pow(a,b);
        double end=System.nanoTime();

        System.out.println(a+" to the power of "+b+" : "+ans);
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");
    }
    public static void Problem7(){
        System.out.print("\nEnter length of array:");
        int n=scanner.nextInt();

        System.out.print("Fill the array :");
        int[] array=generateArr(n);

        double start=System.nanoTime();
        String ans = Arrays.toString(reverseArr(array, 0, n - 1));
        double end=System.nanoTime();

        System.out.println("Reversed array :"+ans);
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");

    }
    public static void Problem8(){
        System.out.print("Enter the string:");
        String s=scanner.next();

        double start=System.nanoTime();
        boolean ans=isDigits(s);
        double end=System.nanoTime();

        System.out.println(s+" is all consist digits:"+(( ans ) ? "YES" : "NO"));
        System.out.println("Time duration:"+ExecuteTimer(start,end)+"ms");

    }
    public static void Problem9(){
        System.out.print("Enter the N:");
        int a=scanner.nextInt();

        System.out.print("Enter the K:");
        int b=scanner.nextInt();

        double start=System.nanoTime();
        int ans=Binomial(a,b);
        double end=System.nanoTime();

        System.out.println("Binomial coefficient of "+a+","+b+" : "+ans);
        System.out.println("Time duration : "+ExecuteTimer(start,end)+" ms");

    }
    public static void Problem10(){
        System.out.print("Enter the A:");
        int a=scanner.nextInt();

        System.out.print("Enter the B:");
        int b=scanner.nextInt();

        double start=System.nanoTime();
        int ans=GCD(a,b);
        double end=System.nanoTime();

        System.out.printf("GCD of (%d,%d) : %d",a,b,ans);
        System.out.println("\nTime duration:"+ExecuteTimer(start,end)+"ms");

    }
}
