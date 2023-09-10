import java.util.Scanner;

public class LinkedListCycle
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

    static void createCycle(Node head, int pos, int n)
    {
        if (pos == -1 || pos >= n)
        {
            return;
        }

        Node end = head;

        while (end.next != null)
        {
            end = end.next;
        }

        Node ptr = head;

        for (int i = 0; i < pos; i++)
        {
            assert ptr != null;
            ptr = ptr.next;
        }

        end.next = ptr;
    }

    static boolean hasCycle(Node head)
    {
        if (head == null || head.next == null)
        {
            return false;
        }

        Node slow = head, fast = head;
        slow = slow.next;
        fast = fast.next.next;

        while (fast != null && fast.next != null)
        {
            if (slow == fast)
            {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
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

        int pos;
        System.out.print("Enter pos: ");
        pos = sc.nextInt();

        createCycle(head, pos, n);

        if (hasCycle(head))
        {
            System.out.println("Given linked list has cycle!");
        }
        else
        {
            System.out.println("Given linked list has no cycle!");
        }
    }
}
