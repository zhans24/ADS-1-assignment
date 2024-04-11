package org.example;

import java.util.Scanner;

public class StorageProblems {
    static Scanner scanner=new Scanner(System.in);

    /**
     * Generates an integer array of a specified length by taking input from the user.
     *
     * Time complexity: O(n), where n is the length of the array.
     * The method creates and fills an array with user input numbers.
     * It is not problem,this method use for to save time on solve other problems
     *
     * @param length_array The length of the array to generate.
     * @return The integer array generated from user input.
     */
    public static int[] generateArr(int length_array){

        int[] array=new int[length_array]; //create array

        for (int i = 0; i < length_array; i++)
            array[i]=scanner.nextInt();        // filling in the array with numbers
        return array;
    }

    // PROBLEM 1
    /**
     * This method finds the minimum value in an array of integers
     *
     * Time complexity: O(n), where n is the length of the input array.
     * The method iterates through each element in the array to find the minimum value.
     * It updates the minimum value if a smaller number is found while iterating.
     *
     * @param array The input array of integers.
     * @return The minimum value in the array.
     */
        public static int min(int[] array){
            int minimum=array[0];
            for (int num:array) {
                if (minimum>num)    // loop for find minimum number in the array
                    minimum=num;
            }

            return minimum;
        }

    // PROBLEM 2
    /**
     * This method calculates the average of an array of integers
     *
     * Time complexity: O(n), where n is the length of the input array.
     * The method iterates through each element in the array to calculate the sum of all numbers.
     * It then divides the sum by the length of the array to find the average number.
     *
     * @param array The input array of integers.
     * @return The average of the numbers in the array.
     */
    public static double avg(int[] array){
        double s=0;
        for (int num:array) {
            s+=num;             // for calculate sum of numbers in the array
        }
        return s/array.length; // divide by length of array to find average num
    }


    //PROBLEM 3
    /**
     * This method checks if a given number is prime or composite
     *
     * Time complexity: O(n), where n is the input number.
     * The method iterates through numbers from 2 to n-1 to check for factors of n.
     * If n is divisible by any number in this range, it is considered composite.
     * The method returns "Composite" if n is less than 2, otherwise it returns "Prime" if no factors are found.
     *
     * @param n The number to be checked for primality.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return "Composite"; // checks if the numbers are divisible to "n"
            }
        }
        return (n<2)? "Composite" : "Prime"; // ternary operator to check is "n" greater than 2
    }


    //PROBLEM 4
    /**
     * This method calculates the factorial of a given number using a recursive approach
     *
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm makes n recursive calls, each reducing the input value by 1,
     * until it reaches the base case where n is equal to 0.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n){
        if (n==0)
            return 1;
        else
            return factorial(n - 1)*n;
    }

    // PROBLEM 5
    /**
     * This method calculates the nth Fibonacci number using a recursive approach
     *
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm makes two recursive calls for each input value,
     * resulting in exponential time complexity.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n){
        if (n<2)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    // PROBLEM 6
    /**
     *  This method calculates the value of a raised to the power of n
     *
     *  It uses a recursive approach.
     *  Time complexity: O(n), where n is the input power.
     *  The recursive algorithm iterates through all numbers from 1 to n,resulting in linear time complexity.
     *
     *  @param a The base number.
     *  @param n The power to which the base number is raised.
     *  @return The value of a raised to the power of n.
     */
    public static int pow(int a,int n){
        if (n==0)
            return 1;
        else
            return a*pow(a,n-1);
    }

    //PROBLEM 7
    /**
     * This method reverses the elements in a given array between the start and end indices.
     *
     * It uses a recursive approach.
     * Time complexity: O(n/2), where n is the number of elements in the array.
     * The recursive algorithm iterates through half of the array,resulting in linear time complexity.
     *
     * @param array The array to be reversed.
     * @param start The starting index of the subarray to be reversed (usually 0).
     * @param end The ending index of the subarray to be reversed( usually array.length-1).
     * @return The reversed array.
     * */
    public static int[] reverseArr(int[] array,int start,int end){
        if (start>=end)
            return array;

        int swap = array[start];
        array[start] = array[end];
        array[end] = swap;

        return reverseArr(array, start + 1, end - 1);
    }

    //problem 8
    /**
     * This method checks if all characters in the input string are digits.
     *
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the length of the input string.
     * The recursive algorithm checks each character in the string for being a digit.
     *
     * @param string The input string to check for digits.
     * @return true if all characters in the string are digits, false otherwise.
     */
    public static boolean isDigits(String string){
        if (string.length()==1){
            return Character.isDigit(string.charAt(0));
        }
        else{
            return isDigits(string.substring(1)) && Character.isDigit(string.charAt(0));
        }
    }

    //PROBLEM 9
    /**
     * Calculates the binomial coefficient C(a, b) using the formula C(a, b) = a! / (b! * (a - b)!)
     *
     * Time complexity: O(n), where n is the input parameter 'a'.
     * The method first checks if 'a' and 'b' are valid for the binomial coefficient calculation.
     * If valid, it calculates the binomial coefficient using factorial method before was written.
     * If 'a' is not valid, it returns 1.
     *
     * @param a The first parameter of the binomial coefficient.
     * @param b The second parameter of the binomial coefficient.
     * @return The binomial coefficient C(a, b) or 1 if 'a' is not valid.
     */
    public static int Binomial(int a,int b){
        return (a>0 && a>=b) ? factorial(a)/(factorial(b)*factorial(a-b)) : 1;
    }


    //PROBLEM 10
    /**
     * Calculates the greatest common divisor (GCD) of two numbers 'a' and 'b' using Euclid's algorithm.
     *
     * Time complexity: O(log(n)),  where n is the input parameter a*b
     * The method recursively calculates the GCD until 'b' becomes 0.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of 'a' and 'b'.
     */
    public static int GCD(int a,int b){
        if (b==0)
            return a;
        else
            return GCD(b,a%b);
    }
}
