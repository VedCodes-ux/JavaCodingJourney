package learningOOPS;
class account{
    String name;
    private int bankbalance;
    public account(int initbal) {
        if(initbal>=0)
        this.bankbalance = initbal;
    }
    public int getBankbalance() {
        return bankbalance;
    }
    public void setBankbalance(int deposit) {
        if(deposit>=0){
            bankbalance+=deposit;
            System.out.println("deposited money");
        } else {
            System.out.println("enter your deposit");
        }

    }
    public void withdraw(int refund){
        if(refund>=0 && bankbalance>0){
            bankbalance-=refund;
        }
    }
    

    
}
public class incapsulation {
    public static void main(String[] args) {
        account a1 = new account(0);
        a1.setBankbalance(45);
        a1.withdraw(34);
        System.out.println(a1.getBankbalance());
    }
}
