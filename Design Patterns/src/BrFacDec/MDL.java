package BrFacDec;

public class MDL implements Money{
    private double value=0;

    @Override
    public void Transfer(double amount) {
        value = value+amount;
        System.out.println("Added money: "+amount+" MDL");
        System.out.println("Balance: "+value+" $");
    }

    @Override
    public void Withdraw(double amount) {
        value = value-amount;
        System.out.println("Withdrawn money: "+amount+" MDL");
        System.out.println("Balance: "+value+" $");
    }

    @Override
    public void Balance() {
        System.out.println("Balance: "+value+" MDL");
    }
}
