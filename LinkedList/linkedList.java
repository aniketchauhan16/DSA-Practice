
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
 

               
        //************************************ Insertion ***************************//
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

    //   ***************************  Deletion   *********************// 

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

        public void removesTail(){
    if (size == 0) return;

    if (size == 1){
        head = tail = null;
        size = 0;
        return;
    }

    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }

    temp.next = null;
    tail = temp;   
    size--;      
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

        public Node deleteK(int k){
           if(head == null || k <= 0) return head;
           if (k == 1) {
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return head;
           }
           int cnt =1;
           Node temp = head;

           while (temp != null && temp.next != null) {
            if(cnt == k-1){
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
            cnt++;
           }
           return head;
        }

        public Node deleteElem(Node head,int el){
            if(head == null ) return null;
            if(head.data == el ) {
                linkedList.head = head.next;
                size--;
                if (linkedList.head == null) {
                    tail = null;
                }
                return linkedList.head;
            }
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == el) {
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    temp.next = temp.next.next;
                    size--;
                    continue;
                }
                temp = temp.next;
            }return linkedList.head;
        }

     //   ***************************  Searching   *********************// 
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
        ll.addFirst(8);
        ll.addFirst(1);
        ll.addLast(3); 
        ll.addLast(4); 
        ll.addLast(8); 
        ll.print();
         head = ll.deleteElem(head, 8);
        ll.print();
        ll.deleteK(2);
        ll.print();
        ll.add(2,99);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.removesTail();
        ll.print();
     int x =    ll.searchElement(3);
     System.out.println(x);
        System.out.println(size);
        System.out.println(recSearch(99 ));
    }
}
