
//  node class
class Node {
    logs object;
  int height;
  Node left, right;

  Node(logs obj) {
      object= new logs();
      //assigning the passed logs class instance to logs class instance inside node class
      object = obj;
    height = 1;
  }
}

// The AVL tree class
class AVL {
  Node root;

  int height(Node N) {
    if (N == null)
      return 0;
    return N.height;
  }

  int maxed(int a, int b) {
    return (a > b) ? a : b;
  }
// right rotate to balance the AVL tree
  Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    y.height = maxed(height(y.left), height(y.right)) + 1;
    x.height = maxed(height(x.left), height(x.right)) + 1;
    return x;
  }
// left rotate to balance the AVL tree
  Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    x.height = maxed(height(x.left), height(x.right)) + 1;
    y.height = maxed(height(y.left), height(y.right)) + 1;
    return y;
  }

  // To Get the balance factor of a node
  int getBalanceFactor(Node N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  //To Insert a node in AVL tree
  Node insertNode(Node node, logs object) {

    // To find the position and insert the new node
    if (node == null)
      return (new Node(object));
    if (object.year < node.object.year)
      node.left = insertNode(node.left, object);
    else if (object.year > node.object.year)
      node.right = insertNode(node.right, object);
    else
      return node;

    // To Update the balance factor of each node
    // and, to balance the AVL tree
    node.height = 1 + maxed(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (object.year < node.left.object.year) {
        return rightRotate(node);
      } else if (object.year > node.left.object.year) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }
    if (balanceFactor < -1) {
      if (object.year > node.right.object.year) {
        return leftRotate(node);
      } else if (object.year < node.right.object.year) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }

  Node miniValue(Node node) {
    Node current = node;
    while (current.left != null)
      current = current.left;
    return current;
  }

  // To delete a node in AVL tree
  Node deleteNode(Node root, int year) {

    // Find the node to be deleted and remove it
    if (root == null)
      return root;
    if (year < root.object.year)
      root.left = deleteNode(root.left, year);
    else if (year > root.object.year)
      root.right = deleteNode(root.right, year);
    else {
      if ((root.left == null) || (root.right == null)) {
        Node temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = miniValue(root.right);
        root.object = temp.object;
        root.right = deleteNode(root.right, temp.object.year);
      }
    }
    if (root == null)
      return root;

    

    // To Update the balance factor of each node and balance the AVL tree
    root.height = maxed(height(root.left), height(root.right)) + 1;
    int balanceFactor = getBalanceFactor(root);
    if (balanceFactor > 1) {
      if (getBalanceFactor(root.left) >= 0) {
        return rightRotate(root);
      } else {
        root.left = leftRotate(root.left);
        return rightRotate(root);
      }
    }
    if (balanceFactor < -1) {
      if (getBalanceFactor(root.right) <= 0) {
        return leftRotate(root);
      } else {
        root.right = rightRotate(root.right);
        return leftRotate(root);
      }
    }
    return root;
  }
 // for preorder traversal of tree
  void preOrder(Node node) {
    if (node != null) {
      System.out.print("Name: "+node.object.username + "  "+"Task: "+node.object.task+"  "+"Year: "+node.object.year+"\n");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  // Main code
  public static void main(String[] args) {
    AVL tree = new AVL();
    logs log= new logs("Billy","Create faculty table", 2000);
    logs log1= new logs("Sam","Create management table", 1999);
    tree.root = tree.insertNode(tree.root, log);
    tree.root = tree.insertNode(tree.root, new logs("Rocky","Updates the tasks",2001));
    tree.root = tree.insertNode(tree.root, log1);
    System.out.print("Original Log entries\n\n");
    System.out.print("******************************************************\n\n");
    tree.preOrder(tree.root);

    tree.deletion(2014); 
    tree.deletion(2009); 
    tree.deletion(2015); 

    tree.root = tree.deleteNode(tree.root, 2000);
    System.out.print("\nLogs after clearing duplicate entries\n\n");
    System.out.print("******************************************************\n\n");
    tree.preOrder(tree.root);
  }
}
