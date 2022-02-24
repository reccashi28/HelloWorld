public class Hello {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Car porsche = new Car();
        ferrari.setModel("Ivory");
        porsche.setModel("Apricot");
        System.out.println("Your car model is this: " + ferrari.getModel());
        System.out.println("Your car model is this: " + porsche.getModel());

        BankAccount meyer = new BankAccount("Rebecca", "12345678", 200.00, "reb@gmail.com", "+4912232345");
        BankAccount wilhelm = new BankAccount("Wilhelm", "879836475", 2050.00, "wil@gmail.com", "+4912232345");
        BankAccount defau = new BankAccount();
        System.out.println(meyer.getBalance());
        meyer.setBalance(100.23);
        meyer.depositToBank(20);
        meyer.withdrawFromBank(90);
        meyer.withdrawFromBank(90);
    }
}


