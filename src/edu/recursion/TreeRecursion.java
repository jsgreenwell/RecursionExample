package edu.recursion;

// TODO Add comments & call in main (want to use this as Class recursion exmaple)

public class TreeRecursion {
  public int data;
  public TreeRecursion left;
  public TreeRecursion right;

  public TreeRecursion(int data){
    this.data = data;
  }

  public static void orderedTraversal(TreeRecursion root) {
    if (root != null) {
      orderedTraversal(root.left); // traverse left sub tree
      System.out.print(root.data + " "); // traverse current node
      orderedTraversal(root.right); // traverse right sub tree
    }
  }
}
