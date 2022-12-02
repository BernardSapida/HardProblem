import java.util.Scanner;

public class App {
    private int number = 0;
    private String squaredString = "";
    private int sum = 0;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.startProgram();
    }

    public void startProgram() {
        queryInteger();
        setSum(number);
        // System.out.println(squaredString);
        System.out.println("Sum is: " + getSum());
    }

    public void queryInteger() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        number = sc.nextInt();
    }

    // No array approach
    // public void setSum(int number) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = 0;

    //     System.out.print("Enter " + number + " integers: ");

    //     for(int i = 1; i <= number; i++) {
    //         num = sc.nextInt();
    //         squaredString += num + " square is: " + (int) Math.pow(num, 2) + "\n";
    //         sum += Math.pow(num, 2);
    //     }
    // }

    // Array approach
    public void setSum(int number) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[number];
        int[] squaredNumbers = new int[number];
        int num = 0;

        System.out.print("Enter " + number + " integers: ");

        for(int i = 0; i < number; i++) {
            num = sc.nextInt();
            numbers[i] = num;
            squaredNumbers[i] = (int) Math.pow(num, 2);
        }

        for(int i = 0; i < number; i++) {
            System.out.println(numbers[i] + " squared is: " + squaredNumbers[i]);
            sum += squaredNumbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
