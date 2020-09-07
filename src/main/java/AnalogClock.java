import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angle = scanner.nextInt();

        //Your code goes here
        int answer = (angle%30) * 12;
        System.out.print(answer);

        // closing the scanner object
        scanner.close();
    }
}