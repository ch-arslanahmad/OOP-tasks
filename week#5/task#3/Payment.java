// runtime-polymorphism

// class
public class Payment {
    // method to be overrided.
    int pay(int pay) {
        System.out.print("You must pay with credit-card or cash.");
        return 0;
    }

    // main-method
    public static void main(String[] args) {
        // creating object of CreditCard with Payment reference
        Payment card = new CreditCard();
        // calling the overrided payment method
        card.pay(100);

    }
    
}


class CreditCard extends Payment{
    // overrided method
    @Override
    int pay(int pay) {
        System.out.print("You payed $" + pay + " with credit-card.");
        return 0;
    }

}

class Cash extends Payment {
    // overrided method
    @Override
    int pay(int pay) {
        System.out.print("You payed $" + pay + " with cash.");
        return 0;
    }
}