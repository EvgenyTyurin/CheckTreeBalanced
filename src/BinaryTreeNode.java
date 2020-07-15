import java.util.LinkedList;

/**
 * Binary tree class
 */

public class BinaryTreeNode<T> {

    private T data;
    private BinaryTreeNode childLeft;
    private BinaryTreeNode childRight;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode getChildLeft() {
        return childLeft;
    }

    public void setChildLeft(BinaryTreeNode childLeft) {
        this.childLeft = childLeft;
    }

    public BinaryTreeNode getChildRight() {
        return childRight;
    }

    public void setChildRight(BinaryTreeNode childRight) {
        this.childRight = childRight;
    }

    // Prints node + children
    public void printTree() {
        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.println(node.getData() + " ");
            if (node.getChildLeft() != null)
                queue.add(node.getChildLeft());
            if (node.getChildRight() != null)
                queue.add(node.childRight);
        }
    }

}
