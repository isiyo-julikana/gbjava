package OOP.sem4.task1;

public class DebitAccount<T extends PersonalData> extends Account<T> {
    public DebitAccount(T data, double amount) {
        super(data, amount);
    }
}