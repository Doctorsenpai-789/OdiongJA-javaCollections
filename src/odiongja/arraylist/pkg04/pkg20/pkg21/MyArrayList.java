/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odiongja.arraylist.pkg04.pkg20.pkg21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author 2ndyrGroupA
 */
public class MyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number 1:");
        sortingArrayList();//number1
        System.out.println("");
        System.out.println("Number 2:");
        rearrangeArrayList();
        System.out.println("");
        System.out.println("Number 3:");

        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(5);
        number.add(1);
        number.add(2);
        number.add(4);

        System.out.print(displays(number));
        System.out.println("");

        //Number 4
        System.out.println("Number 4:");
        System.out.println("");
        System.out.println("The top reasons for using isempty rather than size would be:\nit is more expressive (the code is easier to read and to maintain) it is faster, in some cases by orders of magnitude.\ntwo examples from the jdk where this is extremely visible would be the concurrentlinkedqueue and navigablemap / navigableset");
        System.out.println("");

        //Number 5
        System.out.println("Numeber 5:");
        System.out.println("The biggest differences are that a foreach loop processes an instance of each element in a collection in turn,\nwhile a for loop can work with any data and is not restricted to collection elements alone.\nThis means that a for loop can modify a collection - \nwhich is illegal and will cause an error in a foreach loop.");

        System.out.println("");
        //Number 6
        System.out.println("Number 6");
        commonValues();

        System.out.println("");
        //Number 7
        System.out.println("Number 7");
        uniqueValues();
        
         System.out.println("");
        //Number 8
        System.out.println("Number 8");
        countKeys();
        
        
        

    }
    //number1

    public static void sortingArrayList() {

        int[] ids = {-5, 0, 500, 20, 35, 65};
        List<Integer> values = new ArrayList<>();

        for (int id : ids) {
            values.add(id);
        }

        System.out.println("Before sorting:" + values);
        Collections.sort(values);
        System.out.println("After sorting:" + values);
    }

    //number 2
    public static void rearrangeArrayList() {
        List<String> nbaPlayer = new ArrayList<String>();
        nbaPlayer.add("James");
        nbaPlayer.add("Durant");
        nbaPlayer.add("Curry");
        nbaPlayer.add("Harden");
        nbaPlayer.add("Kawai");
        System.out.println("Before shuffle: " + nbaPlayer);
        Collections.shuffle(nbaPlayer);
        System.out.println("After sorting: " + nbaPlayer);

    }
    //number 3

    static List<Integer> displays(List<Integer> number) {

        int min = 0;
        for (int i = 1; i < number.size(); i++) {
            if (number.get(i) < number.get(min)) {
                min = i;
            }
        }
        int oldValue = number.remove(min);
        number.add(0, oldValue);
        return number;

    }

    //number 6
    public static void commonValues() {

        List<String> nbaPlayer = new ArrayList<String>();
        nbaPlayer.add("Lebron");
        nbaPlayer.add("Durant");
        nbaPlayer.add("Curry");
        nbaPlayer.add("Harden");
        nbaPlayer.add("Kawai");

        List<String> nbaPlayer2 = new ArrayList<String>();
        nbaPlayer2.add("Curry");
        nbaPlayer2.add("Durant");
        nbaPlayer2.add("Paul");
        nbaPlayer2.add("Westbrook");
        nbaPlayer2.add("Kawai");

        System.out.println(nbaPlayer);
        System.out.println(nbaPlayer2);

        nbaPlayer2.retainAll(nbaPlayer);

        System.out.println("Common Values: " + nbaPlayer2);

    }

    //number7
    public static void uniqueValues() {

        List<String> nbaPlayer1 = new ArrayList<>();
        nbaPlayer1.add("Lebron");
        nbaPlayer1.add("Durant");
        nbaPlayer1.add("Curry");
        nbaPlayer1.add("Harden");
        nbaPlayer1.add("Kawai");

        List<String> nbaPlayer3 = new ArrayList<>();
        nbaPlayer3.add("Curry");
        nbaPlayer3.add("Durant");
        nbaPlayer3.add("Paul");
        nbaPlayer3.add("Westbrook");
        nbaPlayer3.add("Kawai");

        System.out.println(nbaPlayer1);
        System.out.println(nbaPlayer3);

        // nbaPlayer1.addAll(nbaPlayer3);
        Set<String> uniqueValues = new LinkedHashSet<>(nbaPlayer1);

        System.out.println("Unique List" + uniqueValues);

    }

    //number8 
    public static void countKeys() {

        HashMap<String, String> hash_map = new HashMap<String, String>();
        hash_map.put("concordia1", "Red");
        hash_map.put("acconcordia", "Test");
        hash_map.put("condensada", "Sweet");
        hash_map.put("concordiaed", "blue");
        hash_map.put("concordia789", "pink");
    
       // System.out.println("Size of the hash map: " + hash_map.size());
       
         Set<String> countkey = hash_map.entrySet()
                               .stream()
                               .filter(entry -> entry.getKey().startsWith("concordia"))
                               .map(Map.Entry::getValue)
                                .collect(Collectors.toSet());
         
         System.out.println("The number Keys that startwith concordia is "+countkey.size());
        

    }
    
    
    
    
}
