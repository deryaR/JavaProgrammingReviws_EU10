package week09_11_5__2022;

public class Task1_EvenOrOdd {

    public static void main(String[] args) {
/*
 Task 1 :   Write a method that can check if a number is even or odd
 isEven(number);
 */
        checkNumberEvenOrOdd(5);
        checkNumberEvenOrOdd(10);


    }

    public static void checkNumberEvenOrOdd(int number) {

        if (number%2==0){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }


    }
}