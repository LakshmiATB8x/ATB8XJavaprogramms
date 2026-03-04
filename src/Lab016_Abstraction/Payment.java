package Lab016_Abstraction;

// Abstract class defining the blueprint
abstract class Payment {
    abstract void pay(double amount);



        public static void main(String[] args) {
            Payment p1 = new CashPayment();
            Payment p2 = new CardPayment();

            p1.pay(100);
            p2.pay(250);
        }
}

class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash.");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " by card.");
    }
}





