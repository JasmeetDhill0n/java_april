package payment;

public class Payment {
    public void pay(){
        System.out.println("paying using some genric method");
    }
}
class ApplePay extends Payment{
    @Override
    public void pay() {
        System.out.println("Paying using apple pay");
    }
}

class DebitCard extends Payment{
    @Override
    public void pay() {
        System.out.println("Paying using debit card");
    }
}

class Paypal extends Payment{
    @Override
    public void pay() {
        System.out.println("paying using paypal");
    }
}
class GooglePay extends Payment{
    @Override
    public void pay() {
        System.out.println("paying using Googlepay");
    }
}