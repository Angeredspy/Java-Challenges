package test;

public class BankAccount {
private String accountNumber; 
private double balance; 
private String customerName; 
private String email; 
private String phoneNumber;

public String getAccountNumber() {
	return accountNumber;
}
public double getBalance() { 
	return balance;
}
public String getCustomerName() { 
	return customerName; 
}
public String getEmail() { 
	return email; 
}
public String phoneNumber() { 
	return phoneNumber;
}

public void setBalance(double balance) { 
	this.balance = balance;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber; 
} 
public void setCustomerName (String customerName) {
	this.customerName = customerName;
}
public void setEmail (String email) {
	this.email = email;
}
public void setPhoneNumber (String phoneNumber) {
	this.phoneNumber = phoneNumber;
} 
public double depositAmount(double amount) { 
	System.out.println("Deposited $" + amount);
	this.balance = getBalance() + amount; 
	System.out.println("New Balance = $" + balance);
	return amount;
} 
public double withdrawAmount(double amount) {
	if(getBalance() < amount) {
		System.out.println("Insufficient Funds - Cannot Withdraw.");
	} else {
	System.out.println("Withdrew $" + amount);
	this.balance = getBalance() - amount; 
	System.out.println("New Balance = $" + balance);

	
	return amount;
	}
	return amount;
} 
}
//public static void main(String[] args) { Sample depiction of a possible main method
//BankAccount bobsBankAccount = new BankAccount(); 
//bobsBankAccount.setAccountNumber("12345678");
//bobsBankAccount.depositAmount(1000);
//
//System.out.println(bobsBankAccount.getBalance());
//
//bobsBankAccount.withdrawAmount(100.0);
//
//bobsBankAccount.depositAmount(50.0);
//bobsBankAccount.withdrawAmount(100.0);
//
//bobsBankAccount.depositAmount(51.0);
//bobsBankAccount.withdrawAmount(100.0);
//} 
