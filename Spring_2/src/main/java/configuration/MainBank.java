package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Bank;

public class MainBank {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);

		Bank bank = context.getBean(Bank.class);
		bank.display();
	}
}