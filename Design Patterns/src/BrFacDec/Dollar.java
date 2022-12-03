package BrFacDec;

public class Dollar implements Money{
    private double value=0;

    @Override
    public void Transfer(double amount) {
        value = value+amount;
        System.out.println("Added money: "+amount+" $");
        System.out.println("Balance: "+value+" $");
    }

    @Override
    public void Withdraw(double amount) {
        value = value-amount;
        System.out.println("Withdrawn money: "+amount+" $");
        System.out.println("Balance: "+value+" $");
    }

    @Override
    public void Balance() {
        System.out.println("Balance: "+value+" $");
    }
}
