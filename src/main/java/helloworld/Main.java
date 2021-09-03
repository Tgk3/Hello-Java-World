package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Choose a type of operation: For multiplication type m , For addition type a" +
                    ", For subtraction type s, For division type d, Otherwise q to quit ");
            Scanner sc = new Scanner(System.in);
            String operation = sc.next();
            if (operation.equals("q")){
                break;
            }
            System.out.println("Enter your first number BITCH");
            int number_1 = sc.nextInt();
            System.out.println("Enter your second number MOFO");
            int number_2 = sc.nextInt();
            switch (operation) {
                case "a":
                    System.out.println(number_1 + " + " + number_2 + " = " + (number_1 + number_2));
                    break;
                case "s":
                    System.out.println(number_1 + " - " + number_2 + " = " + (number_1 - number_2));
                    break;
                case "m":
                    System.out.println(number_1 + " * " + number_2 + " = " + (number_1 * number_2));
                    break;
                case "d":
                    System.out.println(number_1 + " / " + number_2 + " = " + (number_1 / number_2));
                    break;
                default:
                    System.out.println("Sorry I'm not smart enough to understand stupid");
            }
        }
    }

}
