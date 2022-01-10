public class main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Binary Search Tree - BST \n");
        System.out.print("Cây nhị phân - CNP \n");

        BSTree tree = new BSTree();

        tree.insert(new Node(new Student(18, "18", 18)));
        tree.insert(new Node(new Student(20, "20", 20)));
        tree.insert(new Node(new Student(10, "10", 10)));
        tree.insert(new Node(new Student(15, "15", 15)));
        tree.insert(new Node(new Student(12, "12", 12)));
        tree.insert(new Node(new Student(17, "17", 17)));
        tree.insert(new Node(new Student(7, "7", 7)));
        tree.insert(new Node(new Student(8, "8", 8)));
        tree.insert(new Node(new Student(3, "3", 3)));
        tree.insert(new Node(new Student(10, "10", 10)));

//		tree.printPreOrder(); // N L R
//		tree.printInOrder(); // L N R
//		tree.printPostOrder(); // L R N

        tree.delete(18);
        tree.printPreOrder(); // L + R

//		int studentId = 456;
//		Node node = tree.search(studentId);
//		if (node == null) {
//			System.out.print("\nTìm không ra \n");
//		} else {
//			System.out.print("\nTìm ------------- \n");
//			node.printData();
//		}
    }

}
