class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    public void transferTo(Account anotherAccount, double amount) {
        if (balance < amount) {
            System.out.println("Transfer amount exceeded account balance.");
        } else {
            this.debit(amount);
            anotherAccount.credit(amount);
            System.out.println("Transfer successful.");
        }
    }

    public String toString() {
        return "Account[ID=" + id + ",Name=" + name + ",Balance=" + balance + "]";
    }
}

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Lorenzo Liunardo", 88);
        System.out.println(a1); // toString();
        Account a2 = new Account("A102", "Harry Sion"); // default balance
        System.out.println(a2);
        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());
        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);
        // Test transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}
