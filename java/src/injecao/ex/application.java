package injecao.ex;

public class application {
    public static void main(String[] args) {

        new Pagamento(new Metodo()).metodo.boleto();
    }
}


class Pagamento {

    Metodo metodo;

    public Pagamento(Metodo metodo) {
        this.metodo = metodo;
    }

    public void pagar() {
        System.out.printf("Iniciando pagamento");
    }
}



interface Pont<T> {
    void pix();
    void boleto();
}


class Metodo implements Pont {

    public void pix() {
        System.out.printf("Pagou pelo pix");
    }

    public void boleto() {
        System.out.printf("Pagou pelo botelo");
    }

}

