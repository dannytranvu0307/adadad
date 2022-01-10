public class Node {
    public Student student;
    public Node left;
    public Node right;

    public Node(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }

    public void printData() {
        student.printInfo();
    }

    public boolean lessThanOrEqual(Student student) {
        return this.student.getId() <= student.getId();
    }

    public boolean greaterThan(Student student) {
        return this.student.getId() > student.getId();
    }

    public boolean lessThan(int studentId) {
        return this.student.getId() < studentId;
    }

    public boolean hasStudent(int studentId) {
        return this.student.getId() == studentId;
    }
}