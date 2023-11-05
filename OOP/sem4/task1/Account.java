package OOP.sem4.task1;

public abstract class Account<T extends PersonalData> {

    private T data;
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s; Сумма: %.2f руб.", data, amount);
    }
}
