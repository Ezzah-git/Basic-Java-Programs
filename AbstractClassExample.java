abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount;
    }
    abstract void processPayment();

    void PrintAmount(){
        System.out.println("Payment of $"+amount+"processed Sucessfully!");
    }
}
class CreditCardPayment extends Payment{
    CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    void processPayment(){
        System.out.println("Processing Credit card Payment of: "+amount);
    }
}
class PayPal extends Payment{
    PayPal(double amount){
        super(amount);
    }
    @Override
    void processPayment(){
        System.out.println("Processing PayPal Payment of: "+amount);
    }
}
class BankTransfer extends Payment{
    BankTransfer(double amount){
        super(amount);
    }
    @Override
    void processPayment(){
        System.out.println("Processing BankTransfer Payment of: "+amount);
    }
}
public class AbstractClassExample {

    public static void main(String[] args) {
        Payment p = new CreditCardPayment(70000);
        p.processPayment();
//         CreditCardPayment credit = new CreditCardPayment(5000);
//        credit.processPayment();
//        credit.PrintAmount();

        PayPal pay = new PayPal(98000);
        pay.processPayment();
        pay.PrintAmount();

        BankTransfer bankPay = new BankTransfer(543000);
        bankPay.processPayment();
        bankPay.PrintAmount();
    }
}
