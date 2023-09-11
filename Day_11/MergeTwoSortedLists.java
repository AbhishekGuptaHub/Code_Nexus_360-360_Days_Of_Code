class Solution
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if (list1 == null && list2 == null)
        {
            return null;
        }
        else if (list1 == null)
        {
            return list2;
        }
        else if (list2 == null)
        {
            return list1;
        }

        ListNode head, tail;
        head = tail = null;

        while (list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                if (head == null)
                {
                    head = tail = list1;
                }
                else
                {
                    tail.next = list1;
                    tail = list1;
                }

                list1 = list1.next;
            }
            else
            {
                if (head == null)
                {
                    head = tail = list2;
                }
                else
                {
                    tail.next = list2;
                    tail = list2;
                }

                list2 = list2.next;
            }
        }

        if (list1 == null)
        {
            tail.next = list2;
        }
        else
        {
            tail.next = list1;
        }

        return head;
    }
}
