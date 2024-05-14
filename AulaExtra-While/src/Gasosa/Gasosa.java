package Gasosa;

import java.util.Scanner;

public class Gasosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Bem Vindo ao Baraka's Gas Station---------");
        System.out.println("Vai que de hj? Alcool, Gasolina ou Diesel.");

        int alc = 0;
        int gas = 0;
        int die = 0;

        int combustivel = sc.nextInt();

        while (combustivel != 4){
            if (combustivel == 1){
                alc += 1;
            }else if (combustivel == 2){
                gas += 1;
            }else if (combustivel == 3){
                die +=1;
            } else if (combustivel > 4){
                System.out.println("Opção Invalida, tente novamente.");
            }
            combustivel = sc.nextInt();
        }
        sc.close();

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: "+ alc);
        System.out.println("Gasolina: "+ gas);
        System.out.println("Diesel: "+ die);
    }
}
