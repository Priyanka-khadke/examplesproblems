package streamschatgpt;

public class Transaction {
    public Transaction(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    private String id;

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Transaction() {
    }

    private double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
