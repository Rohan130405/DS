class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
     Node head;
     LinkedList(){
        this.head=null;
     }
    void addback(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(data);
        }
    }
    void addfront(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }
    }
    void rmfront(){
        if(head==null){
            System.out.println("no elemnts in the list");
        }
        else{
            if(head.next==null){
                head=null;
            }
            else{
                head=head.next;
            }
        }
    }
    void rmback(){
        if(head==null){
            System.out.println("no elemnts in the lsit");
        }
        else{
            Node current=head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }
    void posadd(int data,int pos){
        if(pos<0){
            System.out.println("not possible");
        }
        else if(pos==1){
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }
        else{
            int count=1;
            Node current=head;
            while (count!=pos-1) {
                current=current.next;
                count+=1;
            }
            Node newnnode=new Node(data);
            newnnode.next=current.next;
            current.next=newnnode;
        }
    }
    void rempos(int pos){
        if(pos<0){
            System.out.println("not possible");
        }
        else if(pos==1){
            this.rmfront();
        }
        else{
            int count=1;
            Node current=head;
            while(count!=pos-1){
                current=current.next;
                count+=1;
            }
            current.next=current.next.next;
        }
    }
    void reverse(){
        Node prev=null;
        Node next=null;
        Node current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class singlelinkedlist {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addback(10);
        list.addback(20);
        list.addfront(30);
        list.printList();
        list.rmfront();//removing from front
        list.printList();
        list.rmback();//removing from back
        list.printList();
        list.addback(20);//adding elements backside
        list.addback(30);
        list.addback(40);
        list.addback(50);
        list.printList();
        list.posadd(25, 3);//adding elements by positioning
        list.posadd(35, 5);
        list.posadd(5, 1);
        list.printList();
        list.reverse();
        list.printList();//reversing the list
        list.reverse();
        list.rempos(2);
        list.printList();
    }
}
