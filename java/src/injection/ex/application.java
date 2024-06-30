package injection.ex;

public class application {
    public static void main(String[] args) {

        new Pagamento(new MetodoBoleto()).iniciar();

    }
}

class Pagamento {

    Pont1 metodo1;

    public Pagamento(Pont1 paga) {
         this.metodo1 = paga;

    }
    public void iniciar() {
        System.out.println("Iniciando pagamento");
        metodo1.pagar();
    }

}


interface Pont1<T> {
    void pagar();
}


class MetodoPix implements Pont1 {
    public void pagar() {
        System.out.println("Pagou pelo pix");
    }
}
class MetodoBoleto implements Pont1 {
    public void pagar() {
        System.out.println("Pagou pelo boleto");
    }
}

