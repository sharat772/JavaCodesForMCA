public class CircularQueueArr {
    static class Queue{
        static int size;
        static int rear=-1;
        static int front=-1;
        static int arr[];
        Queue(int n){
            arr =new int[n];
            this.size=n;
        }
        
        //empty checking
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("full Queue");
                return;
            }
            if(front==-1){
                front++;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int ele=arr[front];
            if(front == rear){
                front=rear=-1;
            }else{
                front = (front+1)%size;
            }
            
            return ele;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            return arr[front];
        }
    }
    
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.remove();

    }

}
