import java.util.Scanner;

class SumCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0;
            int i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }

        input.close();
    }
}