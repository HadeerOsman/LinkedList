package com.company;

public class Main {

    public static void main(String[] args) {
	List list=new List();
	list.insert(2,37);
	list.insert(4,27);
	list.insert(6,5);
	list.insert(8,98);
	list.insert(10,201);
		System.out.println("The original LinkedList -->");

	list.DisplayList();

	Link found=list.FindSpecfLink(6);
	if (found!=null){
        System.out.println("The Link is found with key: ("+found.Key+") with value -> "+found.item);
    }
	else {
        System.out.println("Not Found");
    }
	Link del=list.deleteLink(4);
	if (del!=null){
        System.out.println("The Deleted value with a key= ("+del.Key+")");
    }
	else {
        System.out.println("There is no value with that link to be deleted");
    }
		System.out.println("LinkedList after operations: ");
	list.DisplayList();



    }
}
