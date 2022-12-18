import java.util.*;

public class BinaryTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryT{
        static int idx=-1;

        public static Node buildTree(int nodes[]){
            idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
        }

        //preorder traversal of binary tree
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //inorder traversal of BTree
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //postorder traversal
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        //level order traversal of binary tree
        public static void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left !=null){
                        q.add(curr.left);
                    }
                    if(curr.right !=null){
                        q.add(curr.right);
                    }
                }
            }
        }

        //count of nodes
        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftNodes=countNodes(root.left);
            int rightNodes=countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        //sum of all node values
        public static int sum(Node root){
            if(root == null){
                return 0;
            }
            int sleft= sum(root.left);
            int sright=sum(root.right);
            return sleft+sright +root.data;
        }

        //height of tree OR levels of tree
        public static int heightOfTree(Node root) {
            if(root == null){
                return 0;
            }
            int lheight=heightOfTree(root.left);
            int rheight=heightOfTree(root.right);

            int myLevel = Math.max(lheight, rheight) +1;
            return myLevel;
            
        }

        //diameter of tree O(n^2)
        public static int diameter1(Node root){
            if( root == null ){
                return 0;
            }
            int diam1=diameter1(root.left);
            int diam2=diameter1(root.right);
            int diam3= heightOfTree(root.left)+heightOfTree(root.right)+1;

            return Math.max(diam1, Math.max(diam2, diam3));
        }
        
        //diameter of tree optimized O(n) time complexity
        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int height,int diam){
                this.ht=height;
                this.diam=diam;
            }
        }

        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo leftInfo = diameter2(root.left);
            TreeInfo rightInfo = diameter2(root.right);

            int myHeight =Math.max(leftInfo.ht, rightInfo.ht)+1;

            int diam1 = leftInfo.diam;
            int diam2 = rightInfo.diam;
            int diam3 = leftInfo.ht+rightInfo.ht+1;

            int finaldiam=Math.max(diam1, Math.max(diam2, diam3));

            return new TreeInfo(myHeight, finaldiam);

        }

    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryT b=new BinaryT();
        Node root=b.buildTree(nodes);
        System.out.println("ROOT Node is "+root.data);
        System.out.println("preorder traversal");
        b.preorder(root);
        System.out.println("\nInorder traversal");
        b.inorder(root);
        System.out.println("\npostorder traversal");
        b.postorder(root);
        System.out.println("\nlevel order traversal ");
        b.levelorder(root);
        System.out.println("\ntotal number of nodes");
        System.out.println(b.countNodes(root)); 
        System.out.println("sum of nodes \n"+b.sum(root));
        System.out.println("Height of Binary tree \n"+b.heightOfTree(root));
        System.out.println("Diameter of tree \n"+b.diameter1(root));
        System.out.println("O^n approch diameter calculation of a tree \n"+b.diameter2(root).diam);
    }
}
