package client;
import java.util.ArrayList;

import service.EmployeeImpl;
public class Employee1 {
	public static void main(String[] args) {

		ArrayList<EmployeeImpl> records = new ArrayList<EmployeeImpl>();
		EmployeeImpl obj = new EmployeeImpl();

		records.add(new EmployeeImpl(1, "Zoe", 200.00));
		records.add(new EmployeeImpl(2, "Peter", 300.00));
		records.add(new EmployeeImpl(3, "Yamaha", 100.00));
		records.add(new EmployeeImpl(4, "Harley", 150.00));
		records.add(new EmployeeImpl(5, "Martha", 500.00));

		for (EmployeeImpl record : records) {
			System.out.println(record);
		}

		obj.sortingArray(records);

		System.out.println();

		for (EmployeeImpl record : records) {
			System.out.println(record);
		}

	}

}
