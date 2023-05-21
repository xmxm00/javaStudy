package week5;

public class Node {
    private int num;
    private Node left;
    private Node right;

    Node(int num) {
        this(num, null, null);
    }

    Node(int num, Node left, Node right) {
        this.num = num;
        this.left = left;
        this.right = right;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean hasChild(){
        return (right != null) || (left != null);
    }
}
