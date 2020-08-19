package wipro.w_collect_topicsTolearn_iterable_prog3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        List<String> a=new ArrayList<String>();
        String c;
        do {
        	System.out.println("Enter the String");
        	String s=sc.next();
        	a.add(s);
        	System.out.println("Do u want to add another string");
        	 c=sc.next();
        }while(c.equals("yes"));
        printAll(a);
        
        //problem 4 list accept only numbers(int,float,double)
        System.out.println("\n\nproblem 4 list accept only numbers(int,float,double)");
        List<Number> li=new ArrayList<Number>();
        li.add(234);
        li.add(34.5);
        li.add(657);
        li.add(45.6788);
        System.out.println("list is "+li);
        
    }
    public static void printAll(List<String> a1) {
    	Iterator it=a1.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    }
}
