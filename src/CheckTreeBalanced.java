/**
 * Check if tree is balanced (diff between children heights <= 1)
 */
public class CheckTreeBalanced {

    public static void main(String[] args) {
        // level 1
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // level 2
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode(2);
        root.setChildLeft(node2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode(3);
        root.setChildRight(node3);
        // level 3
        node2.setChildLeft(new BinaryTreeNode(4));
        node2.setChildRight(new BinaryTreeNode(5));
        node3.setChildLeft(new BinaryTreeNode(6));
        node3.setChildRight(new BinaryTreeNode(7));
        System.out.println("Tree balanced? " + treeBalanced(root));
    }

    // Check if tree is balanced
    static boolean treeBalanced(BinaryTreeNode node) {
        if (node == null) return true;
        // Check children heights
        int diff = Math.abs(treeHeight(node.getChildLeft()) - treeHeight(node.getChildRight()));
        if (diff > 1) {
            // Diff big return false
            return false;
        } else {
            // Check subtrees to the left and right
            return treeBalanced(node.getChildLeft()) && treeBalanced(node.getChildRight());
        }
    }

    // Calculate tree height
    static int treeHeight(BinaryTreeNode node) {
        if (node == null) return 0;
        return Math.max(treeHeight(node.getChildRight()), treeHeight(node.getChildRight())) + 1;
    }

}
