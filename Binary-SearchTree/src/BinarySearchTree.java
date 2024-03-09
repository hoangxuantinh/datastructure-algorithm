public class BinarySearchTree {
    Node root;
    class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

    boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;

        // left
        while(true) {
            if(temp.value == value) return false;
            // left
            if(temp.value > value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            // right
            if(temp.value < value) {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }




    }

    boolean contains(int value) {
        Node temp = root;

        while(temp != null) {
            if(value > temp.value) {
                temp = temp.right;
            } else if(value < temp.value) {
                temp = temp.left;
            } else {
                return true;
            }
        }
        return false;
    }


}
