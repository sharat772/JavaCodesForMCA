class SingleLL {
    Node head; 
    private int size; //within the class we use size
    //constructr of main class
    SingleLL () {
        size = 0;//when we create oject of SingleLL class defalut size assign to 0
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add first node
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    // add node last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //delete first node 
    public void deleteFirst(){
        if(head== null){
            System.out.println("List is empty");
            return;
        }
        size --;
        head=head.next;
    }

    //delete last node
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node lastNode=head.next;
        Node secondLast=head;

        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //display list
    public void printList(){
        if(head== null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void printsize(){
        System.out.println(size);
    }
    //search element
    public void searchEle(String ele){
        String search = ele;
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        int i=0;
        while(temp != null){
            if(temp.data==search){
                System.out.println("element found at index "+i);
            }
            temp=temp.next;
            i++;
        }
    }
    //delete element with index number
    public void deleteIndex(int idx){
        Node prev=head;
        Node next=head.next; 
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        int i=0;
        while(i == idx){
            next=next.next;
            prev = prev.next;
            i++;
        }
        next=next.next;
        prev.next=next;
    }

    //reverse single linked list
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        } 
        head.next=null;
        head=prevNode;
    }

    //reverse linked list using reccursive call 
    public Node reccursiveRevList(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead=reccursiveRevList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }

    public static void main(String[] args) {
        SingleLL list =new SingleLL();
        
        list.addFirst("hey");
        list.addLast("Man");
        list.addLast("how are you");
        list.printsize();
        list.printList();
        list.searchEle("Man");
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.printsize();
        list.addFirst("zzzz");
        list.deleteIndex(1);
        list.printList();
        list.addFirst("hello");
        list.addFirst("hp");
        list.addFirst("jQuery");
        list.printList();
        list.reverseList();
        list.printList();
        list.head=list.reccursiveRevList(list.head);
        list.printList();

    }
}
