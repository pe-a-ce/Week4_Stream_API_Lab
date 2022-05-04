package org.example.streamapi;

import javax.print.DocFlavor;
import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {

//        .streams was not working because i did not put the list name here^^

        names .stream().forEach(System.out::println);
    }
    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        return null;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        Arrays.stream(numbers).map(number -> number * 2)
                .toArray();
        return numbers;
    }
    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        String[] split = input.split("");
        List<String> strings = Arrays.stream(split).map(s -> s.toUpperCase()).toList();
        return strings;
//        split letters
//        change to caps
//        return input
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
//        List<String>
//       filter list by a given letter
//       .sort the list
//        return animals
    return list.stream()
//            filter animals to start with given letter
            .filter(animals -> animals.startsWith(letter))
//            map to upper case
            .map(String::toUpperCase)
//            sort list
            .sorted()
//            strean to list
            .toList();
    }
    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)

//         if elements < i of maxlength
//        if given first letter
//        return elements
return null;
    }

}