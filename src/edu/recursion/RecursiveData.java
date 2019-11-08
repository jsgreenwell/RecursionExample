package edu.recursion;

// TODO Add comments & call in main (want to use this as Class recursion exmaple)
// TODO Add File.io example & Stream Example & LinkList example

public class RecursiveData {
  public int data;
  public RecursiveData left;
  public RecursiveData right;

  public RecursiveData(int data){
    this.data = data;
  }

  public static void orderedTraversal(RecursiveData root) {
    if (root != null) {
      orderedTraversal(root.left); // traverse left sub tree
      System.out.print(root.data + " "); // traverse current node
      orderedTraversal(root.right); // traverse right sub tree
    }
  }
}
