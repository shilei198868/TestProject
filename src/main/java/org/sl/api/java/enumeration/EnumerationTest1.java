package org.sl.api.java.enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举测试
 * @author Administrator
 *
 */
public class EnumerationTest1 {

	public static void main(String args[]) {
	      Enumeration<String> days;
	      Vector<String> dayNames = new Vector<String>();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();
	      while (days.hasMoreElements()){
	         System.out.println(days.nextElement()); 
	      }
	   }
}
