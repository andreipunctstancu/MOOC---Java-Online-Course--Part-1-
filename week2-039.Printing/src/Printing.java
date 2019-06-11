import java.io.Reader;

public class Printing {

    public static void printStars(int amount) {

        int  i =0;
        while (i<amount) {
            System.out.print("*");
            i++;}
        System.out.println();
    }

    public static void printSquare (int sideSize){
        int i =0;
        while (i<sideSize){

            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;
        /*while ( counter < height){
            printStars(width);
            counter++;
            }
        printStars(width);
        printStars(width);
        printStars(width);*/
        while (height>0){
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {

      for (int i=1; i<size+1; i++){
          printStars(i);
      }

        /*printStars(1);
        printStars(2);
        printStars(3);
        printStars(4);*/
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct



        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");

    }

}
