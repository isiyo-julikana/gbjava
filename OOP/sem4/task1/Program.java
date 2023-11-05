package OOP.sem4.task1;

public class Program {

    public static void main(String[] args) {

        Person person1 = new Person("FIO #1", "1000002340");
        Entity entity1 = new Entity("ENTITY #1", "1000000451");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 30);
        DebitAccount<Entity> debitAccount1 = new DebitAccount<>(entity1, 3000000);

        var transaction = new Transaction<>(debitAccount1, creditAccount1, 20000);
        transaction.execute();
        transaction.execute();
        //Account<Person> account1 = new Account<>(person, 30000);
        //System.out.println(account1);
    }
}
