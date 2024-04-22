package Senha;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        while (pass != 1996) {
            System.out.println("Senha Incorreta!");
            pass = sc.nextInt();
        }
        System.out.println("Senha Correta!!");
        sc.close();

    }
}

