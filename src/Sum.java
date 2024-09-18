import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        float sum, num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number :");
        num1 = kb.nextFloat();

        System.out.print("Enter the second number :");
        num2 = kb.nextFloat();

        sum = num1 + num2;
        System.out.println("the sum is : " + sum);
    }
}
