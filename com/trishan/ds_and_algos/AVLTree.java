
public class AVLTree {
  public static class Node {
    Node left;
    Node right;
    int data;
    int height;

    Node(int data) {
      this.data = data;
      this.height = 1;
      this.left = this.right = null;
    }
  }

  Node createBST(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }

    if (data < root.data) {
      root.left = createBST(root.left, data);
    } else if (data > root.data) {
      root.right = createBST(root.right, data);
    } else {
      return root;
    }

    root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
    int balanceFactor = getBalanceFactor(root);

    if (balanceFactor > 1 && data < root.left.data) {
      // LL Skewness, Left Confirmed as (Positive Balance Factor), LL confirmed as
      // data is less than root's left.
      return rightRotation(root);
    }
    if (balanceFactor > 1 && data > root.left.data) {
      // LR Skewness
      root.left = leftRotation(root.left);
      return rightRotation(root);
    }
    if (balanceFactor < -1 && data > root.right.data) {
      // RR Skewness
      return leftRotation(root);
    }
    if (balanceFactor < -1 && data < root.right.data) {
      // RL Skewness
      root.right = rightRotation(root.right);
      return leftRotation(root);
    }

    return root;
  }

  Node leftRotation(Node x) {
    Node y = x.right;
    Node t2 = y.left;
    y.left = x;
    x.right = t2;
    x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
    y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
    return y;
  }

  Node rightRotation(Node y) {
    Node x = y.left;
    Node t2 = x.right;
    x.right = y;
    y.left = t2;
    y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
    x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
    return x;
  }

  int getBalanceFactor(Node root) {
    if (root == null) {
      return 0;
    }
    return getHeight(root.left) - getHeight(root.right);
  }

  int getHeight(Node root) {
    if (root == null) {
      return 0;
    }
    return root.height;
  }
}
