public class TreeNode<E> {
    E value;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E value) {
        this(value, null, null);
    }

    public TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}