
public class StackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
        public static Node head=null;

        public static Boolean isEmpty(){
            if(head==null){
                return true;
            }else{
                return false;
            }
        }
        
        public static void push(int data){
            Node newNode =new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int ele=head.data;
            head=head.next;
            return ele;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int ele= head.data;
            return ele;
        }
    }
    

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while(!stk.isEmpty()){
            System.out.println(stk.peek()); 
            stk.pop();
        }

    }
}
