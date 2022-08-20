package com.bridgelabz.hashTable;

public class hashTableMain {
    public static void main(String[] args) {

        hashTable<String, Integer> hashTable = new hashTable<>();

        String message = "To be or not to be";

        String[] value = message.toLowerCase().split(" ");

        for (String word : value) {
            //System.out.print(word);
            Integer val = hashTable.get(word);

            if (val == null)
                val = 1;
            else
                val = val + 1;
            hashTable.add(word, val);
        }
        //System.out.println(value);
        System.out.print(hashTable);
    }
}
