package bank.entities;

public class BussinesAccount extends Account {

    private double loanlimit;

    private BussinesAccount() {

    }

    public BussinesAccount(Integer id, String name, Double balance, Double loanlimit) {
        super(id, name, balance);
        this.loanlimit = loanlimit;
    }

    public double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amount) {
        if (amount <= loanlimit) {
            deposit(amount);
        }
    }
}
