package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeImpl implements Comparable<EmployeeImpl> {
	String name;
	int id;
	double salary;

	public EmployeeImpl(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeImpl() {}

	public int compareTo(EmployeeImpl o) {
		if (this.name.compareTo(o.name) > 0)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "EmployeeImpl [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public void sortingArray(ArrayList<EmployeeImpl> list) {
		Collections.sort(list);
	}



}


