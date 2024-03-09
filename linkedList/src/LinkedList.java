public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public int getLength() {
        System.out.println("Length :: " + length);
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = head;
        Node preTemp = head;
        if (length == 0) return null;
        while (temp.next != null) {
            preTemp = temp;
            temp = temp.next;
        }
        tail = preTemp;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node preAppend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return newNode;
    }

    public Node removeFirst() {
        Node temp = head;
        if(length == 0) return null;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value) throws IndexOutOfBoundsException {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
        }
    }

    public Node insert(int index, int value) {
        if(index < 0 || index > length) {
            return null;
        }
        if(index == 0) {
            this.preAppend(value);
        }
        if(index == length) {
            this.append(value);
        }
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return newNode;
    }

    public Node remove(int index) {
        if(length == 0) return null;

        if(index < 0 || index >= length ) return null;

        if(index == 0) return this.removeFirst();

        if(index == length - 1) return this.removeLast();

        Node pre = get(index - 1);
        Node temp = pre.next;

        pre.next = get(index + 1);
        temp.next = null;
        length--;
        return temp;

    }

    public void revert() {
        // b1 swap head and tail
        Node temp = head;
        head = tail;
        tail = temp;
        // init 3 variable for move purpose
        Node after;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }




    }

    public Node findMiddleNode() {
        if(length == 0) return null;
        int mid = (int) (double) (length / 2);
        System.out.println("Middle value :: " + this.get(mid).value);
        return this.get(mid);
    }

}

// revert list
// Head                  Tail
//  1 -> 2 -> 3 -> 4 ->  null

// b1: swap head and tail       Tail                  Head
//                               1 -> 2 -> 3 -> 4 ->  null

// b2: tạo 3 biến before, temp, and after dịch chuyển mũi tên reference từ trái qua phải thành phải qua trái

