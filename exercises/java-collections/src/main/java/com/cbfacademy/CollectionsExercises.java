package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(4);
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2);
        System.out.println(integers.element());
        return integers;
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        
    }

    public Stack<Integer> useStack() {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(5);
        stacks.push(6);
        stacks.push(8);
        stacks.push(9);
        Integer firstValue = stacks.peek();
        System.out.println(firstValue);
        Integer lastValue = stacks.lastElement();
        System.out.println(lastValue);
        Integer firstValueRemoved = stacks.pop();
        System.out.println(firstValueRemoved);
        stacks.push(4);
        return stacks;

        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9); 
        Integer first = deque.getFirst();
        System.out.println(first);
        Integer last = deque.getLast();
        System.out.println(last);
        Integer firstValue = deque.poll();
        System.out.println(firstValue);
        Integer elementValue = deque.element();
        System.out.println(elementValue);
        return deque;


        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue x
        //  - print the first element of the queue on the screen x
        //  - print the last element of the queue on the screen x 
        //  - invoke the method poll() on the queue and print the result on the screen x
        //  - invoke the element() method on the queue and print the result on the screen x
        //  - return the queue
    }

    public HashMap<Integer, String> useHashMap() {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsValue("English"));
        return map;




        // TODO: create an empty hash map x
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map x
        //  - determine the set of keys from the map and print it on the screen x
        //  - determine the set of values from the map and print it on the screen x
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map

    }

    public String getName() {
        return "Collections Exercises";
    }
}
