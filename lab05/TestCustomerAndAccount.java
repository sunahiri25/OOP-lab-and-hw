public class TestCustomerAndAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer2 c1 = new Customer2(88, "Tan Ah Teck", 'm');
        System.out.println(c1);  // Customer's toString()

        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Account class
        Account2 acc1 = new Account2(101, c1, 888.8);
        System.out.println(acc1);

        acc1.setBalance(999.9);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getID());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("customer's name is: " + acc1.getCustomerName());

        System.out.println(acc1.deposit(200));
        System.out.println(acc1.withdraw(300));
        System.out.println(acc1.withdraw(1000));
    }
}
