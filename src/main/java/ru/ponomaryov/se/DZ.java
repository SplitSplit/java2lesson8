package ru.ponomaryov.se;

public class DZ {

    public static void main(String[] args) {
        ChainHashTable hashTable = new ChainHashTable(5);
        Item item1 = new Item("Oleg", 26);
        Item item2 = new Item("Irina", 29);
        Item item3 = new Item("Pavel", 18);
        Item item4 = new Item("Evgeny", 42);
        Item item5 = new Item("Arcady", 47);
        Item item6 = new Item("Alexandr", 22);
        Item item7 = new Item("Nikolay", 34);

        hashTable.add(item1);
        hashTable.add(item2);
        hashTable.add(item3);
        hashTable.add(item4);
        hashTable.add(item5);
        hashTable.add(item6);
        hashTable.add(item7);

        System.out.println("After insert:");
        hashTable.display();
        System.out.println("After remove:");
        hashTable.remove(item1);
        hashTable.display();
        System.out.println("Find Pavel: " + hashTable.find(item3.getId()));

        System.out.println("Size is: " + hashTable.getSize());
        System.out.println("Finish");
    }
}
