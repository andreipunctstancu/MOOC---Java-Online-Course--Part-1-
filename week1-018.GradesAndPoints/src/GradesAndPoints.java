
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
         int points;
        do  {

            Scanner reader = new Scanner(System.in);

            System.out.println("Type the points [0-60]: ");

            points = Integer.parseInt(reader.nextLine());


            if (points == 35) {
                System.out.println("nu");

            break;}

            else if (points <= 29) {
                    System.out.println("failed");


                }

                                     else if (points <= 34) {
                             System.out.println("1");


                            } else if (points <= 39) {
                                 System.out.println("2");


                                     } else if (points <= 44) {
                                             System.out.println("3");

                                                 } else if (points <= 49) {
                                                        System.out.println("4");

                                                                } else if (points <= 60) {
                                                                          System.out.println("5");

                                                                                         } else {
                                                                                                System.out.println("nothing");
                                                                                                 }


        }while(points >=0);

    }
}