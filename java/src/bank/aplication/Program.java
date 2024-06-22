package bank.aplication;


import bank.entities.Account;
import bank.entities.BussinesAccount;

public class Program {

    public static void main(String[] args){

        BussinesAccount acc = new BussinesAccount(3, "vinicius", 12.3, 332.2);

        System.out.println("nome : " + acc.getName());
        System.out.println("indentificador : " + acc.getId());
        System.out.println("dinheiro : " + acc.getBalance());
        System.out.println("limite : " + acc.getLoanlimit());
        System.out.println("");
        System.out.println("");

        Account acc1 = acc;
        System.out.println("nome : " + acc1.getName());
        System.out.println("indentificador : " + acc1.getId());
        System.out.println("dinheiro : " + acc1.getBalance());
    }
}
