package Day01._10998;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = num1 * num2;
        System.out.println(answer);

        sc.close();
    }
}