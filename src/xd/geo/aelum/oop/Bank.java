package xd.geo.aelum.oop;

public class Bank {
    private static int number;
    private String Name = "JavaBank";
    private int id;
    private int numberOfAccount;

    private BankAccount[] accounts;

    Bank() {
        Bank.number += 1;
        this.setId();
        this.accounts = new BankAccount[3];
        this.numberOfAccount = 0;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = Bank.number;
    }

    public void add(BankAccount bAcc) {
        var p = this.getNumberOfAccounts();
        if (p < this.accounts.length) {
            this.accounts[p] = bAcc;
            this.setNumberOfAccounts(p);
        } else {
            this.createNewArray();
            this.accounts[p] =bAcc;
            this.setNumberOfAccounts(p);
        }


    }

    private void createNewArray() {
        var oldArray = this.accounts;
        var size = this.accounts.length * 2;
        BankAccount[] newArray = new BankAccount[size];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        this.accounts = newArray;
        System.out.println("New Array was create, size: " + this.getAccountLength());
    }

    private int getNumberOfAccounts() {
        return numberOfAccount;
    }

    private void setNumberOfAccounts(int position) {
        this.numberOfAccount += 1;
    }

    public void displayAccounts() {
        for (BankAccount ac : this.accounts) {
            ac.getDataForPrint();
        }
    }

    public int getAccountLength() {
        return this.accounts.length;
    }
    public boolean contains(BankAccount bAcc) {
        for (BankAccount ac : this.accounts) {
            if(ac == bAcc) return true;
        }
        return false;
    }
}
