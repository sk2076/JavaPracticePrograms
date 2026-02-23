import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();
        input.close();
        double interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}