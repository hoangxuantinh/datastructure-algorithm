//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(20);
        bst.insert(50);
        bst.insert(35);
        bst.insert(28);
        bst.insert(100);


        bst.insert(31);

        System.out.println("check " + bst.root.right.left.left.value); // 31
        System.out.println("check  contain " + bst.contains(20)); // 31

    }
}