import java.util.ArrayList;

public class BinarySearchTree {
    //Node structure
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }

    //insert node
    public static Node buildBinary(Node root,int data){
        if(root == null){
            root=new Node(data);
            return root;  
        }
        if(root.data>data){
            root.left=buildBinary(root.left, data); 
        }else{
            root.right=buildBinary(root.right, data);
        }
        return root;  
    }

    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Searching in BST
    public static boolean searchNode(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data>key){
            return searchNode(root.left, key);
        }else if(root.data==key){
            return true;
        }else{
           return searchNode(root.right, key);
        }   
    }

    //Deleting nodes in BST
    public static Node deleteNode(Node root,int data){
        if(root.data>data){
            root.left=deleteNode(root.left, data);
        }else if(root.data<data){
            root.right=deleteNode(root.right, data);
        }else{
            //root.data == value
            if(root.left == null && root.right==null){
                return null;//for leafe node CASE 1
            }
            //CASE 2 only onfe sub tree available
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //CASE 3
            Node IS = inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=deleteNode(root.right, IS.data);
        }
        return root;
    }

    //INORDER Successor
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //BST X to Y range data print 
    public static void printRange(Node root,int X,int Y){
        if(root == null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printRange(root.right, X, Y);
        }else
        if(root.data>=Y){
            printRange(root.left, X, Y);
        }else{
            printRange(root.right, X, Y);
        }
    }
    //print path function
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    //print r0ot to leaf 
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int nodes[]={6,4,2,5,8,7,9};
        Node root=null;
        ArrayList<Integer> path=new ArrayList<>();
        for(int i=0;i<nodes.length;i++){
            root=buildBinary(root, nodes[i]);
        }
        inorder(root);

        if(searchNode(root, 11)){
            System.out.println("\nfound");
        }else{
            System.out.println("\nNot found");
        }

        //deleteNode(root, 4);
        inorder(root);
        System.out.println();
        printRange(root, 3, 9);
        System.out.println();
        printRoot2Leaf(root,path);

    }
}
