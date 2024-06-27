package injecao.ex;

public class application {
    public static void main(String[] args) {

        new Pagamento(new Metodo()).iniciar();
        new Pagamento(new Metodo()).metodo.pix();

    }
}


class Pagamento {

    Metodo metodo;

    public Pagamento(Metodo metodo) {
        this.metodo = metodo;
    }

    public void iniciar() {
        System.out.println("Iniciando pagamento");
    }
}



interface Pont<T> {
    void pix();
    void boleto();
}


class Metodo implements Pont {

    public void pix() {
        System.out.println("Pagou pelo pix");
    }

    public void boleto() {
        System.out.println("Pagou pelo botelo");
    }

}

