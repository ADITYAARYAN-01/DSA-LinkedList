package Linked_list;
class NoDe{
    NoDe next;
    int val;
    NoDe(int val){
        this.val = val;
    }
}
class ssl2 {
    NoDe head;
    public static NoDe reverse(NoDe head) {
        NoDe current = head;
        NoDe next1 = current.next;
        NoDe prev = null;
        if (head == null || head.next == null)
            return head;
        else {
            while (next1 != null) {
                next1 = current.next;
                current.next = prev;
                prev = current;
                current = next1;
            }

        }
        return prev;
    }
    void printlist(){
        NoDe temp = head;
        while(temp!= null){
            System.out.println(temp.val);
            temp =temp.next;
        }
    }
}

public class reverseLL {
    public static void main(String[] args) {
        NoDe head = new NoDe(1);
        head.next = new NoDe(2);
        head.next.next = new NoDe(3);
        head.next.next.next = new NoDe(4);
        head.next.next.next.next = new NoDe(5);
        head.next.next.next.next.next = new NoDe(6);
    }

    
    
}
