import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

     //   String printResult = firstNumber == secondNumber ? "The numbers are equal" :
    //            ((firstNumber > secondNumber) ? "Greater number: " + firstNumber  : "Greater Number:" + secondNumber );
   //     System.out.println(printResult);

        if (firstNumber == secondNumber)
        {
            System.out.println("The numbers are equal");
        } else if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else {
            System.out.println("Greater Number: " + secondNumber);
        }

        String a = "2";
        String b;


        /*b = a.isEmpty() ? a : a.substring(3);
        if(a.isEmpty())
            b=a;
        else
            b = a.substring(3);*/


    }
}
