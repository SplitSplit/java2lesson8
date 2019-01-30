package ru.ponomaryov.se;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args ) {
        //        HashTable hashTable = new HashTableImpl(5);
        HashTable hashTable = new DoubleHashTableImpl(5);
        hashTable.put(new Item("Orange", 1), 150);
        hashTable.put(new Item("Banana", 77), 100);
        hashTable.put(new Item("Lemon",62), 250);
        hashTable.put(new Item( "Potato",21), 67);
        hashTable.put(new Item( "Milk",55), 120);

        System.out.println("Size is " + hashTable.getSize());
        hashTable.display();


        Map<String, Integer> costByTitle = new HashMap<>();
        costByTitle.put("Banana", 75);
        costByTitle.put("Potato", 175);
        costByTitle.put("Orange", 275);

        for (String key : costByTitle.keySet()) {
            Integer cost = costByTitle.get(key);
            System.out.println(key + " = " + cost);
        }
    }
}
