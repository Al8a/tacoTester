 class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        if (bst.contains(30)) {
            System.out.println("Found 30");
        } else {
            System.out.println("Cannot find 30");
        }

        if (bst.contains(90)) {
            System.out.println("Found 90");
        } else {
            System.out.println("Cannot find 90");
        }
    }
 }


