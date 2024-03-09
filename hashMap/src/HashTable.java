import java.util.ArrayList;

public class HashTable {
    private int size = 7; // default value
    private Node[] dataMap;

    HashTable() {
        dataMap = new Node[size];
    }

    public class Node {
        public String key;
        public int value;
        public Node next;
        Node(String key,int value ) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] chars = key.toCharArray();
        for (int valueAscii : chars) {
            hash = (hash + valueAscii * 28) % dataMap.length;
        }
        return hash;
    }

    void set(String key, int value) {
        int hash = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[hash] == null) {
            dataMap[hash] = newNode;
        }else {
            Node temp = dataMap[hash];
            while(temp.next !=  null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }



    void printTable()  {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println("address of array hashmap node " + i);
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println("{" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }


    public int get(String key) {
        int hashIndex = hash(key);
        Node temp = dataMap[hashIndex];
        while(temp != null) {
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return -1;
    }


    public ArrayList<String> getKeys() {
        ArrayList<String> allKey = new ArrayList<String>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKey.add(temp.key);
                temp = temp.next;
            }
        }
        return allKey;
    }


}
