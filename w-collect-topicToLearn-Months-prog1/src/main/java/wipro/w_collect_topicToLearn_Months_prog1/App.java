package wipro.w_collect_topicToLearn_Months_prog1;

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
        a.add("January");
        a.add("February");
        a.add("March");
        a.add("April");
        a.add("May");
        a.add("June");
        a.add("July");
        a.add("August");
        a.add("September");
        a.add("October");
        a.add("November");
        a.add("December");
        
        Iterator it=a.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
    }
}
