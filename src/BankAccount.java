public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("Default Wilhelm","879836475", 2050.00, "wil@gmail.com", "+4912232345");
        System.out.println("Default value");
    }
    public BankAccount( String name,
     String accountNumber,
     double balance,
     String email,
     String phoneNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String  name){
        this.name = name;
    }
    public void setAccountNumber(String  accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double  balance){
        this.balance = balance;
    }

    public BankAccount(String name, String accountNumber) {
        this(name, accountNumber, 100.2,"reb@gmail.com", "1509384763" );
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void setEmail(String  email){
        this.email = email;
    }

    public void setPhoneNumber(String  phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositToBank(double deposit){
        this.balance += deposit;
        System.out.println("You deposited: " + this.balance);
    }
    public void withdrawFromBank(double withdraw){
        if( withdraw > this.balance){
            System.out.println("Not allowed to withdraw!");
        } else {
            this.balance -= withdraw;
            System.out.println(withdraw + " amount withdrew.");
        }
    }
}
