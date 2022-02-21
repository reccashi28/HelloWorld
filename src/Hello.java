public class Hello {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Car porsche = new Car();
        ferrari.setModel("Ivory");
        porsche.setModel("Apricot");
        System.out.println("Your car model is this: " + ferrari.getModel());
        System.out.println("Your car model is this: " + porsche.getModel());

        BankAccount meyer = new BankAccount();
        meyer.setBalance(100.23);
        meyer.depositToBank(20);
        meyer.withdrawFromBank(90);
        meyer.withdrawFromBank(90);
    }
}


