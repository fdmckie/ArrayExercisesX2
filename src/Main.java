import java.util.Scanner;


public class Main {
    public static void main(String[] args){


// 01.



// 02.




// 03.




// 04. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
//Expected output:
//(6,7)
//
//(9,4)

//        int[] numbers = new int[10];
//        int numbersSum = 0;
//        int jValue = 0;

        int[] numbers4A = new int[]{1,7,6,5,9};
        int[] numbers4B = new int[]{2,7,6,3,4};

        int sumNumbers = 0;


        for (int i = 0; i < numbers4A.length; i++){

            for (int j = 0; j < numbers4B.length; j++) {

                sumNumbers = numbers4A[i] + numbers4B[j];

                if (sumNumbers == 13) {

                    System.out.println("(" + numbers4A[i] + "," + numbers4B[j] + ")");

                }

            }

        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


//05. Prompt the user to input 10 values and store them into an array. Output the total number of odd and even values in the array.

        int oddCount = 0;
        int evenCount = 0;
        int[] numbers5 = new int[10];
        int number = 0;


        Scanner input = new Scanner(System.in);


        for (int i = 0; i < numbers5.length; i++){
            System.out.println();
            System.out.println("Enter an integer:  ");
            number = input.nextInt();

            numbers5[i] = number;

            if (numbers5[i] % 2 == 0){
                evenCount = evenCount + 1;
            }
            else {
                oddCount = oddCount + 1;
            }



        }
        System.out.println();
        System.out.println("The number of even integers entered is " + evenCount);
        System.out.println("The number of odd integers entered is " + oddCount);





    }
}
