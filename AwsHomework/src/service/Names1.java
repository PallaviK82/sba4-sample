package service;

import java.util.ArrayList;
import java.util.Collections;


public class Names1 implements Comparable<Names1>{
	String name;

	public Names1(String name) {
		this.name = name;
	}

	public Names1() {}

	@Override
	public int compareTo(Names1 o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) > 0)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Names1 [name=" + name + "]";
	}

	public void sortingArray(ArrayList<Names1> list) {
		Collections.sort(list);
	}

}
	



