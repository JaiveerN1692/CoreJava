package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestMethod {
public static void main(String[] args) {
	List l = new ArrayList<>();
	
	l.add(786);
	l.add(786.786);
	l.add('a');
	l.add("Jaiveer Nahta");
	
	for (Object o : l) {
	System.out.println(o);	
	}
			
	List list = new ArrayList<>();
	list.add(786);
	list.add(78);
	list.add('a');
	list.add("Jaiveer Nahta");
	list.retainAll(list);
	
	System.out.println(list.retainAll(l));
}
}
