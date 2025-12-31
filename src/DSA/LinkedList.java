package DSA;

public class LinkedList
{
    // Inner Node class
    class Node
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display linked list
    public void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  // 10 -> 20 -> 30 -> null
    }
}
