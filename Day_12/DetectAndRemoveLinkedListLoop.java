class Solution
{
    public static void removeLoop(Node head)
    {
        if (head.next == null)
        {
            return;
        }
        
        Node slow, fast;
        slow = fast = head;
        
        slow = slow.next;
        fast = fast.next.next;
        
        boolean flag = false;
        
        while (fast != null && fast.next != null)
        {
            if (slow == fast)
            {
                flag = true;
                break;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (!flag)
        {
            return;
        }
        
        Node ptr = head;
        
        while (slow != ptr)
        {
            slow = slow.next;
            ptr = ptr.next;
        }
        
        while (ptr.next != slow)
        {
            ptr = ptr.next;
        }
        
        ptr.next = null;
        
        return;
    }
}
