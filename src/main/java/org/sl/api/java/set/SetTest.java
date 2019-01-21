package org.sl.api.java.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * HashSet、TreeSet和LinkedHashSet的区别
 * address:https://blog.csdn.net/w592376568/article/details/78180668
 * @author Administrator
 *
 */
public class SetTest {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		 
		Iterator iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
	}
	
	
	
}
