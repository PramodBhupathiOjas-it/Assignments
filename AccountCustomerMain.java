package java22May;

class Customer {
	private String first_name;
	private String last_name;

	public Customer() {
		super();
	}

	public Customer(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", last_name=" + last_name + "]";
	}

}

class Account {
	private Customer customer;
	private int accountNo;
	private double balance;
	private float interestRate;

	public Account(Customer customer, int accountNo, double balance, float interestRate) {
		super();
		this.customer = customer;
		this.accountNo = accountNo;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public double deposit(double amount) {
		balance = amount + balance;
		return balance;
	}

	public double withdraw(int amount) {

		if (balance > amount) {
			balance = balance - amount;
			return balance;
		} else {
			return -1;
		}
	}

}

public class AccountCustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer("Pramod", "Bhupathi");
		Account a = new Account(c, 12345, 10000, 3);
		System.out.println("Balance : " + a.deposit(10000));
		double remaining = a.withdraw(13000);
		if (remaining != -1)
			System.out.println("Withdraw succesfully \rRemaining Balance : " + remaining);
		else {
			System.out.println("Insuffient Balance");
		}

	}

}