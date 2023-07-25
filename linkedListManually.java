public class linkedListManually{
    Node head;
    private int size;
    linkedListManually(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first node to linked list
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // add last node to linked list
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode=head;
        while(curNode.next != null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node curNode=head;
        while(curNode!= null){
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");

    }

    // delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        if(head==null ||head.next==null){
            return;
        }
        Node prev=null;
        Node curNode=head;
        while(curNode!=null){
            Node nxt=curNode.next;
            curNode.next=prev;
            prev=curNode;
            curNode=nxt;
        }
        
        head=prev;
    }
    public Node reverseRecusive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverseRecusive(head.next);
        head.next.next=head;
        head.next=null;

        return newNode;
    }

    public static void main(String[] args) {
        linkedListManually list = new linkedListManually();
        // list.addFirst("list");
        // list.addFirst("a");
        // list.addFirst("is");
        
        // list.addFirst("this");
        
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // int x=list.getSize();
        // System.out.println(x);


        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        // list.reverseIterate();
        list.head=list.reverseRecusive(list.head);
        list.printList();

    }
}