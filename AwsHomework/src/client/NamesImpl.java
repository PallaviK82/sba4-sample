package client;

import java.util.ArrayList;

import service.Names1;

public class NamesImpl {
public static void main(String[] args) {

	ArrayList<Names1> list = new ArrayList<Names1>();
	Names1 obj = new Names1();

	list.add(new Names1("pals"));
	list.add(new Names1("koppal"));
	list.add(new Names1("kavi"));
	list.add(new Names1("rashi"));
	list.add(new Names1("prakash"));
	list.add(new Names1("kavya"));
	list.add(new Names1("sindu"));
	list.add(new Names1("gowri"));
	list.add(new Names1("sumukh"));
	list.add(new Names1("sid"));
	for (Names1 name : list) {
		System.out.println(name);
	}

	
	obj.sortingArray(list);

	System.out.println();

	for (Names1 name : list) {
		System.out.println(name);
	}

}



}
