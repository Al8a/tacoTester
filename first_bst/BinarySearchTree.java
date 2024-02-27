public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        return root;
    }

    public boolean contains(int k) {
        Node current = root;
        while (current != null) {
            if (k < current.value) {
                current = current.left;
            } else if (k > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}