import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        //Your code goes here
        class1 = class1/2 + class1%2;
        class2 = class2/2 + class2%2;
        class3 = class3/2 + class3%2;
        int total = class1 + class2 + class3;
        System.out.print(total);

        // closing the scanner object
        scanner.close();
    }
}