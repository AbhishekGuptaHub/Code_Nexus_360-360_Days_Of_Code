import java.util.Scanner;

public class ReverseLinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node createLinkedList(int n)
    {
        Scanner sc = new Scanner(System.in);

        Node head, prev, curr;
        head = prev = null;

        System.out.println("Enter data of all the nodes of the linked list below:");
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                curr = new Node(sc.nextInt());
                head = prev = curr;
                continue;
            }

            curr = new Node(sc.nextInt());

            prev.next = curr;
            prev = curr;
        }

        return head;
    }

    static void printLinkedList(Node head)
    {
        Node curr = head;

        while (curr != null)
        {
            if (curr.next == null)
            {
                System.out.println(curr.data);
            }
            else
            {
                System.out.print(curr.data + " -> ");
            }

            curr = curr.next;
        }
    }

    static Node reverseLinkedList(Node head)
    {
        Node prev, curr, nex;
        prev = null;
        curr = head;

        while (curr != null)
        {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        return prev;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of nodes in a linked list: ");
        n = sc.nextInt();

        Node head = createLinkedList(n);

        System.out.println("Linked list is created as follows below:");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.println("Linked list after being reversed is as follows below:");
        printLinkedList(head);
    }
}
