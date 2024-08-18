import java.util.Scanner;

public class skipping_even_numbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int num = obj.nextInt();

        System.out.println("Odd numbers from 1 to" + " " + num + " " + ":");

        for(int i=1; i<=num; i++){

            if(i % 2 == 0)
                continue;

            System.out.print(i + " ");

        }


    }
}
