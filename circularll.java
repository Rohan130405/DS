class Node {
Node next;
int data;
Node(int data){
 this.data=data;
 this.next=null;
}
}
class LinkedList{
    Node head;
    Node tail;
    LinkedList(){
        head=null;
        tail=null;
    }
    void addback(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
            head.next=head;
        }
        else{
            tail.next=new Node(data);
            tail=tail.next;
            tail.next=head;
        }
    }
    void addfront(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
            head.next=head;
        }
        else{
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
            tail.next=head;

        }
    }
    void display(){
        if(head==null){
            System.out.println("No Elements Present");
        }
        else{
            Node counter=head;
            System.out.println(counter.data);
                counter=counter.next;
            while(counter!=head){
                System.out.println(counter.data);
                counter=counter.next;
            }
        }
    }
}
public class circularll {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.addback(10);
        obj.addback(20);
        obj.addback(30);
        obj.addfront(0);
        obj.display();
    }
}
