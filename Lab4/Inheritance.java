public class Inheritance {

	public static void main(String[] args) {

		Person p1 = new Person("Smith ", 21);
		Person p2 = new Person("Kathy ", 26);

		Account acc1 = new Account(1234, 5000, p1);
		Account acc2 = new Account(1235, 8000, p2);

		acc1.deposit(5000);
		// acc1.getBalance();
		System.out.println("Smith's account balance is Rs " + acc1.getBalance()); // 10000

		acc2.withdraw(500);
		// acc2.getBalance();
		System.out.println("Kathy's account balance is Rs " + acc2.getBalance()); // 500

		CurrentAccount c = new CurrentAccount();
		SavingAccount s = new SavingAccount();
		c.deposit(5000);
		s.deposit(1000);

		doWithdrawal(c); // withdraw succeed
		doWithdrawal(s); // withdraw failed
	}

	public static void doWithdrawal(Account acc) {
		boolean result = acc.withdraw(1000.00);
		if (result) {
			System.out.println("Withdraw succeed");
		} else {
			System.out.println("Withdraw failed");
		}

	}

}