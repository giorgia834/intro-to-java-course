package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        
            List<String> newList = new ArrayList<>();

            for (int number : numbers) { // for number in numbers
                if (number % 3 == 0 & number % 5 == 0){
                    newList.add("FizzBuzz");
                } else if (number % 5 == 0){
                    newList.add("Buzz");

                }  else if (number % 3 == 0) {
                    newList.add("Fizz");
            } else {
                newList.add(Integer.toString(number));
            }
                
        }

        return newList;



        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

    }

    public String whichMonth(Integer number) {
             List<Integer> listNumber = new ArrayList<>();
             Collections.addAll(listNumber, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

             List<String> months = new ArrayList<>();
             Collections.addAll(months, "January,", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

             
               if (number >= listNumber.size() || number <= 0) {
                return "Invalid month number";
               } else {
                return months.get(number - 1);
            } 

            


        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
