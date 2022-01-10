public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Linked List - Java \n");

        LinkedList list = new LinkedList();

        list.insertAt(new Node(new Student("Huy", 20)), 1);
        list.insertAt(new Node(new Student("Huy Nguyễn", 30)), 0);
        list.insertAt(new Node(new Student("Huy Ngọc Nguyễn", 40)), 3);
        list.insertAt(new Node(new Student("Huy 23423 Nguyễn", 45)), 2);

        list.printList();

        int id = 3;
        // list.delete(id);

        Node searchNode = list.search(id);
        if (searchNode != null) {
            System.out.print("Student cần tìm: \n");
            searchNode.student.printInfo();
        } else {
            System.out.print("Student id = " + id + " không có trong danh sách \n");
        }

        //   System.out.print("\n\nSau khi xóa:");
        //list.printList();
    }
}