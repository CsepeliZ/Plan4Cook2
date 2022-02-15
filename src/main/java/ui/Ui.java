package ui;

import java.util.Scanner;

public class Ui {

    Scanner scanner = new Scanner(System.in);

    public String askText() {
        return scanner.nextLine();
    }

    public int askInt() {
        int userIn = scanner.nextInt();
        scanner.nextLine();
        return userIn;
    }

    public double askDouble() {
        double userIn = scanner.nextDouble();
        scanner.nextLine();
        return userIn;
    }
}
