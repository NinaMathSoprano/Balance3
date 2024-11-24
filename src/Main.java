import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Введите начальную сумму: ");

        int beginningSum = in.nextInt();
        System.out.print("Введите внесённую на баланс сумму: ");
        int addedSum = in.nextInt();


        if (addedSum >= 1000) {
            System.out.println(beginningSum + addedSum + addedSum / 100);

        } else {

            int endBalance = beginningSum + addedSum;

            System.out.println(endBalance);

        }


    }
}
