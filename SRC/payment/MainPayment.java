package payment;

public class MainPayment {
    public static void main(String[] args) {
        Payment payment =new Payment();
        Payment payment1 = new ApplePay();
        Payment payment2 =new Paypal();
        Payment payment3 = new DebitCard();
        Payment payment4 =new GooglePay();

        payment1.pay();
        payment2.pay();
        payment3.pay();
        payment4.pay();
    }
}
