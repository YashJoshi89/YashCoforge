package com.coforge.Day3_collections;
import java.util.ArrayList;
public class App {
	 public static void main(String[] args) {
/**
//port java.lang.ReflectiveOperationException.Array;
import java.util.ArrayList;
/**
 * Hello world!
 
public class App {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        alist.add(10);//insertion order preserved
        alist.add("Yash");
        alist.add(56.78);
        alist.add(89.07f);
        alist.add(89.07f); ///duplicates are aloowed
        alist.add(true);
        
        System.out.println("ArrayList Elements");
        for (int i =0;i<=alist.size();i++) {
        	System.out.println(alist.get(i));
        }
    }
}
*/

ArrayList<Integer> iList = new ArrayList<Integer>();
iList.add(34);
iList.add(89);
iList.add(32);

iList.add(89);
iList.add(34);
iList.add(null);
iList.add(null);
iList.add(null);
System.out.println("ArrayList Elements");
for (int i=0;i<iList.size();i++)
	System.out.println(iList.get(i));

iList.add(3,78);
System.out.println("ArrayList Elements");
for (int i =0;i<iList.size();i++)
	System.out.println(iList.get(i));

ArrayList<Integer> alist=new ArrayList<Integer>();
alist.add(100);

iList.addAll(4,alist);
System.out.println("Arraylist elements");
for(int i =0;i<iList.size();i++)
	System.out.println(iList.get(i));
System.out.println(iList.contains(1));
System.out.println("enhanced for loop");
System.out.println("***************************************");
for(Integer i:iList)
	System.out.println(i);
System.out.println("***************************************");
System.out.println(iList.containsAll(alist));

System.out.println("****************************************");
Integer rem =34;
System.out.println(iList.remove(Integer.valueOf(34)));//object

}
}
}
