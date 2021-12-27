package com.company;

import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
	    //ArrayStack stack = new ArrayStack(10);

	    //stack.push(new Employee("Agus", "Trianto", 1));
        //stack.push(new Employee("Beta", "Sonda", 2));
        //stack.push(new Employee("Citra", "Kirana", 3));
        //stack.push(new Employee("Dadang", "Nurjaman", 4));
        //stack.push(new Employee("Eko", "Patrio", 5));
        //stack.push(new Employee("Boris", "Senda", 100));

        //stack.printStack();
        //System.out.println("==================");
        //stack.pop();
        //stack.pop();
        //stack.printStack();
        //System.out.println(stack.peek());

        //System.out.println(stack.peek());


        Employee agus = new Employee("Agus","Trianto", 1);
        Employee beta = new Employee("Beta","Sonda", 2);
        Employee citra = new Employee("Citra", "Kirana", 3);
        Employee dadang = new Employee("Dadang", "Nurjaman", 4);
        Employee eko = new Employee("Eko", "Patrio", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(agus);
        stack.push(beta);
        stack.push(citra);
        stack.push(dadang);
        stack.push(eko);

        stack.printStack();

        System.out.println("============");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("=============");
        stack.printStack();

        System.out.println(stack.size());

        //System.out.println(stack.peek());

    }
}
