package bank.entities;


public class SavingAcccount extends Account {

    private double interestrate;

    public SavingAcccount() {
        super();
    }

    public SavingAcccount(Integer id, String name, Double balance, double interestrate) {
        super(id, name, balance);
        this.interestrate = interestrate;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    public void updateBalance() {
        balance += balance * interestrate;
    }


}
