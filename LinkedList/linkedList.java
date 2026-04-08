public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
        public static Node head;
        public static Node tail;
               static int size;

        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if (head == null) { 
                head = tail = newNode;
                return;
            }
            newNode.next = head;

            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
        tail.next = newNode;
        tail = newNode;
        }
        public void print(){
            if (head == null) {
                System.out.println("null");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }System.out.println();
        }

        public void add(int idx,int data){
            if (idx ==0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;
            while (i<idx-1) {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next = newNode;
        }

        public int removeFirst(){
            if (size ==0) {
                return Integer.MAX_VALUE;
            }
            else if(size == 1){
                int n = head.data;
                head = tail = null;
                size=0;
                return n;
            }
            int n = head.data;
            head = head.next;
            size--;
            return n;
        }

        public int removeLast(){
            if (size == 0) {
                System.out.println("Ll is empty");
                return Integer.MIN_VALUE;
            }
            else if (size == 1) {
                int n = tail.data;
                head = tail = null;
                size = 0;
                return n;
            }
            Node prev = head;
            for (int i = 0; i < size-2; i++) {
                prev = prev.next;
            }
            int n = tail.data; //or prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return n;
        }
        public int searchElement(int elem){
            int i =0;
            Node temp = head;
            while (temp!=null) {
                if (temp.data == elem) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }

        public static int helper(Node head,int key){
            if (head == null) {
                return -1;
            }
            if (head.data == key){
                return 0;
            } 
            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx+1; // as after each recursive call the index will be for its prev call then prev call refernce
        }

        public static int recSearch(int key){
            return helper(head,key); 
        }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3); 
        ll.addLast(4); 
        ll.add(2,99);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
     int x =    ll.searchElement(3);
     System.out.println(x);
        System.out.println(size);
        System.out.println(recSearch(99 ));
    }
}
