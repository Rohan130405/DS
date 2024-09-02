import java.util.LinkedList;

class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class linkedlist{
    Node head;
    linkedlist(){
        this.head=null;
    }
    void addback(int data){
       if(head==null){
        head=new Node(data);
       }
       else{
        Node counter=head;
        while(counter.next!=null){
            counter=counter.next;
        }
        counter.next=new Node(data);
        counter.next.prev=counter;
       }
    }
    void addfront(int data){
        if(head==null){
            head=new Node(data);
           }
        else{
            Node newnode=new Node(data);
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    void remfront(){
        if(head==null){
            System.out.println("no elements to delete");
        }
        else{
            if(head.next==null){
                head=null;
            }
            else{
                head=head.next;
            head.prev=null;
            }
        }
    }
    void remback(){
        if(head==null){
            System.out.println("no elements to delete");
        }
        else{
                if (head.next == null) {
                    head = null; // Fix: If there's only one element, set head to null
                } 
                else {
                    Node counter = head;
                    while (counter.next != null) {
                        counter = counter.next;
                    }
                    counter.prev.next = null; // Remove the last element
                }
        }
    }
    void reverse(){
        if(head==null){
            System.out.println("no elements to display");
        }
        else{
            Node counter=head;
            Node temp=null;
            while(counter!=null){
                temp=counter.prev;
                counter.prev=counter.next;
                counter.next=temp;
                counter=counter.prev;
            }
            if(temp!=null){
                head=temp.prev;
            }
        }
    }
    void display(){
        if(head==null){
          System.out.print("no data");
        }
        else{
            Node counter=head;
        while(counter!=null){
            System.out.print(counter.data+" ");
            counter=counter.next;
        }
        System.out.println();
        }
    }
}
public class doublelinked {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addback(20);
        list.addback(30);
        list.addfront(10);
        list.addfront(5);
        list.addback(40);
        list.remback();
        list.remfront();
        list.display();
        list.reverse();
        list.display();
        
    }
}
