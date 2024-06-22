package funcContract.aplication;

import funcContract.entities.FazerContratoPadrao;
import funcContract.entities.FazerContratoTerceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<FazerContratoPadrao> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Hours: ");
            int hora = sc.nextInt();
            System.out.print("Value per hour: ");
            int valuePerHour = sc.nextInt();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                int additionalCharge = sc.nextInt();
                list.add(new FazerContratoTerceiro(valuePerHour, hora, nome, additionalCharge));
            }
            else {
                list.add(new FazerContratoPadrao(valuePerHour, hora, nome));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (FazerContratoPadrao emp : list) {
            System.out.println(emp.getNome() + " - $ " + "pagamento " + emp.getPagamento());
        }

        sc.close();
    }

}


