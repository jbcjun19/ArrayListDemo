package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ArrayList<String> myArr = new ArrayList<>(); // you can also have <String>

        // no size limit

        /*
        * common methods of arraylist:
        add(element)
        add(index, element)
        clear()
        boolean contains(element)
        Object get(index)
        int indexOf(Object)
        remove(index)
        remove(Object)
        int size()
        * */

        myArr.add("susie");
        myArr.add("rob");
        myArr.add("lauren");

        myArr.add(1, "paul");
        myArr.add("tom");

        System.out.println("The length of my list is " + myArr.size());
        System.out.println("Current list: " + myArr + "\n");

        System.out.println("Is 'paul' in my list?: " + myArr.contains("paul"));
        System.out.println("Is 'jake' in my list?: " + myArr.contains("jake"));

        myArr.remove(1);
        myArr.remove("tom");
        System.out.println("Current list: " + myArr + "\n");

        System.out.println("Who is at the beginning of the list?: " + myArr.get(0));
        System.out.println("What's the index position of 'lauren'?: " + myArr.indexOf("lauren"));

        myArr.clear();
        System.out.println("Current list: " + myArr + "\n");

        System.out.println("Calling a method...");
        howToAddAllToArrayList();

    }

    public static void howToAddAllToArrayList() {
        //List 1
        List<String> namesList = Arrays.asList( "alex", "brian", "charles");

        //List 2
        ArrayList<String> otherList = new ArrayList<>();

        //Copy all items from list 1 to list 2
        otherList.addAll(namesList);

        System.out.println(otherList);
    }
}
