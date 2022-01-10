public class BSTree {
    private int size;
    public Node root;

    public BSTree() {
        this.size = 0;
        this.root = null;
    }

    public int size() {
        return this.size;
    }

    public void insert(Node newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node insert(Node node, Node newNode) {
        if (node == null) {
            this.size++;
            return newNode;
        }

        if (newNode.lessThanOrEqual(node.student)) {
            node.left = insert(node.left, newNode);
        } else {
            node.right = insert(node.right, newNode);
        }
        return node;
    }

    public Node search(int studentId) {
        return search(this.root, studentId);
    }

    private Node search(Node node, int studentId) {
        if (node == null) return null;

        if (node.hasStudent(studentId)) {
            return node;
        }
        if (node.lessThan(studentId)) {
            return search(node.right, studentId);
        } else {
            return search(node.left, studentId);
        }
    }

    public void delete(int studentId) {
        this.root = delete(this.root, studentId);
    }

    private Node delete(Node node, int studentId) {
        if (node == null) return null;

        if (node.hasStudent(studentId)) {
            this.size--;
            if (node.left == null) {
                return node.right;
            }
            Node maxNode = node.left;
            Node preNode = maxNode;
            while (maxNode.right != null) {
                preNode = maxNode;
                maxNode = maxNode.right;
            }
            maxNode.right = node.right;
            if (maxNode != node.left) {
                maxNode.left = node.left;
                preNode.right = null;
            }
            return maxNode;
        }
        if (node.lessThan(studentId)) {
            node.right = delete(node.right, studentId);
        } else {
            node.left = delete(node.left, studentId);
        }
        return node;
    }

    public void printPreOrder() {
        System.out.print("\n\nprintPreOrder ");
        printPreOrder(this.root);
    }

    private void printPreOrder(Node node) {
        if (node == null) return;

        node.printData();
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder() {
        System.out.print("\n\nprintInOrder ");
        printInOrder(this.root);
    }

    private void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);
        node.printData();
        printInOrder(node.right);
    }

    public void printPostOrder() {
        System.out.print("\n\nprintPostOrder ");
        printPostOrder(this.root);
    }

    private void printPostOrder(Node node) {
        if (node == null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        node.printData();
    }
}