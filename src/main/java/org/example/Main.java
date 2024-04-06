package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        double start= System.nanoTime();
        int[] s={1,2};
        int[] f={3,4};
        System.out.println(Binomial(7,3));
        ExecuteTimer(start);
    }


    // For calculate Time Complexity
    public static void ExecuteTimer(double start){
        double end= System.nanoTime();
        System.out.println("Time:"+ (end-start) / 1_000_000  );
    }

    public static int[] generateArr(int length_array){

        int[] array=new int[length_array]; //create array

        for (int i = 0; i < length_array; i++)
            array[i]=scanner.nextInt();        // filling in the array with numbers
        return array;
    }

    // PROBLEM 1
    public static int min(int[] array){
        int minimum=array[0];
        for (int num:array) {
            if (minimum>num)    // loop for find minimum number in the array
                minimum=num;
        }

        return minimum;
    }

    // PROBLEM 2
    public static double avg(int[] array){
        double s=0;
        for (int num:array) {
            s+=num;             // for calculate sum of numbers in the array
        }
        return s/array.length; // divide by length of array to find average num
    }


    //PROBLEM 3
    public static String isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return "Composite"; // checks if the numbers are divisible to "n"
            }
        }
        return (n<2)? "Composite" : "Prime"; // ternary operator to check is "n" greater than 2
    }


    //PROBLEM 4

    public static int factorial(int n){
        if (n==0)
            return 1;
        else
            return factorial(n - 1)*n;
    }

    // PROBLEM 5
    public static int fibonacci(int n){
        if (n<2)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    // PROBLEM 6
    public static int pow(int a,int n){
        if (n==0)
            return 1;
        else
            return a*pow(a,n-1);
    }

    //PROBLEM 7
    public static int[] reverseArr(int[] array,int start,int end){
        if (start>=end)
            return array;

        int swap = array[start];
        array[start] = array[end];
        array[end] = swap;

        return reverseArr(array, start + 1, end - 1);
    }

    //problem 8
    public static boolean isDigits(String string){
        if (string.length()==1){
            return Character.isDigit(string.charAt(0));
        }
        else{
            return isDigits(string.substring(1)) && Character.isDigit(string.charAt(0));
        }
    }

    //PROBLEM 9
    public static int Binomial(int a,int b){
        return (a>0 && a>=b) ? factorial(a)/(factorial(b)*factorial(a-b)) : 1;
    }


    //PROBLEM 10
    public static int GCD(int a,int b){
        if (b==0)
            return a;
        else
            return GCD(b,a%b);
    }



}