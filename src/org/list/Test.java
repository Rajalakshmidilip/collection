package org.list;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {

	List <Object> l=new ArrayList<>();
	l.add(10);
	l.add("name");
	l.add(67866323134l);
	l.add(true);
	l.add('u');
	for(Object o:l) {
 
	System.out.println(o);
	}
}
}


