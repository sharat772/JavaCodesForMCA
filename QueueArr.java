public class QueueArr {
    static class Queue{
        static int size;
        static int rear=-1;
        static int arr[];
        Queue(int n){
            arr =new int[n];
            this.size=n;
        }
        
        //empty checking
        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("full Queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int ele=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return ele;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            return arr[0];
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
