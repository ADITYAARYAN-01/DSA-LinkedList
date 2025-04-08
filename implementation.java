package Linked_list;

class SSL 
{
    Node head ;
    Node tail;
    int size;
    public void insertAtLast(int val)
    {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else
        {
            tail.next =  temp;
            tail = temp;
        }
        size++;
    }
    void display()
    {
        Node temp =head;
        while(temp != null )
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    int size()
    {
        return size;
    }

}

public class implementation {

    public static void main(String[] args) {
        SSL list = new SSL();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);
      //  list.display();
      //  System.out.println("Size of the list is "+list.size);
      //  list.insertAtLast(60);
       // list.display();
       // System.out.println("Size of the list is "+list.size);
       System.out.println(list.size());

        
    }
}
