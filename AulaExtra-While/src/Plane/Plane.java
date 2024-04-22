package Plane;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0){
            if(x > 0 && y > 0){
                System.out.println("Quadrante I");
            } else if(x < 0 && y > 0){
                System.out.println("Quadrante II");
            } else if(x < 0 && y < 0){
                System.out.println("Quadrante III");
            } else if(x > 0 && y < 0){
                System.out.println("Quadrante IV");
            }  else {
                System.out.println("Sobre os eixos ou na origem");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
