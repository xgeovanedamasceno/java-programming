package xd.geo.aelum.oop;

public abstract class BankAccount {
    static int number;
    private int id;
    private String name;

    private String numberAccount;
    private String numberAgency;

    private double balance;
    private Date openingDate;

    BankAccount(Date date, String name) {
        BankAccount.setNumber();
        this.setId();
        this.setOpeningDate(date);
        this.setName(name);
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNumberAgency() {
        return numberAgency;
    }

    public void setNumberAgency(String numberAgency) {
        this.numberAgency = numberAgency;
    }

    private static void setNumber() {
        BankAccount.number += 1;
    }

    public static int getNumber() {
        return BankAccount.number;
    }

    public int getId() {
        return this.id;
    }

    private void setId() {
        this.id = BankAccount.getNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOpeningDate() {
        return this.openingDate.getFormattedDate();
    }

    private void setOpeningDate(Date date) {
        this.openingDate = date;
    }

    public boolean withdraw(double value) {
        if (value > this.balance || value <= 0) {
            throw new InsufficientBalanceException("Insufficient funds or inappropriate value", value);
        } else {
            this.balance = this.balance - value;
            return true;
        }

    }

    public boolean put(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Inappropriate value or insufficient");
        } else {
            this.balance = this.balance + value;
            return true;
        }

    }

    public double getYield() {
        return this.balance * 0.01;
    }

    protected void getDataForPrint() {
        // sout here ?
        System.out.println("Account Name: " + this.getName());
        System.out.println("Account Number: " + this.getId());
        System.out.println("Account Balance: " + this.getBalance());
        System.out.println("Account Opening Date: " + this.getOpeningDate());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        String stringInfo = "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", openingDate=" + openingDate +
                '}';

        return stringInfo.toUpperCase();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        BankAccount otherAccount = (BankAccount) obj;

         return this.numberAccount == otherAccount.getNumberAccount() &&
                this.getNumberAgency().equals(otherAccount.getNumberAgency());
    }

    protected abstract String getType();

    protected void transfer(double value, BankAccount destiny) {
        if(value > this.balance || value <= 0) {
            throw new InsufficientBalanceException("Insufficient funds or inappropriate value", value);
        } else if (destiny == null) {
            throw new InsufficientBalanceException("Invalid Destination Account", value);
        } else {
            this.balance -= value;
            destiny.put(value);
            String nameDestiny = destiny.getName().toUpperCase();
            System.out.println("Amount transfered to "+ nameDestiny + " successfully" );
        }

    }


}
