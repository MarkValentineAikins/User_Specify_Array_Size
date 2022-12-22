import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        int[] score = {7, 8, 9, 10, 11};
//        ++score[2]; // Pre-increment operation
//        score[4]++; // Post-increment operation
//
//        System.out.println("New Scores are: " + score[2] + " and "+ score[4] + "");
//
//        System.out.println("Hello world! " + "Array score has "+ score.length + " elements.");
//
//        int[] numbers = { 3, 6, 9 };
//        for (int val : numbers)
//            System.out.println(val);

        int NumTest;
        int [] tests;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tests: ");
        NumTest = sc.nextInt();
        tests = new int[NumTest];

        for (int i = 0; i < NumTest; i++) {
            System.out.println("Enter test scores"+(i+1) + ": ");
            tests[i] = sc.nextInt();
        }

        System.out.println("Here are the tests you entered");
        for (int i = 0; i < NumTest; i++) {
            System.out.println(tests[i] + " ");
        }

        for (int ElementSize:tests) {
            //System.out.println("Array Score has "+ ElementSize);
            System.out.print("hence, ");
            System.out.println("Array has " + tests.length + " elements ");
        }
    }

}