class Intersect
{
    int intersectPoint(Node head1, Node head2)
	{
	    Node ptr1, ptr2;
	    ptr1 = head1;
	    ptr2 = head2;
	    
	    int count1, count2;
	    count1 = count2 = 0;
	    
	    while (ptr1 != null)
	    {
	        count1++;
	        ptr1 = ptr1.next;
	    }
	    
	    while (ptr2 != null)
	    {
	        count2++;
	        ptr2 = ptr2.next;
	    }
	    
	    int diff = Math.abs(count1 - count2);
	    
	    ptr1 = head1;
	    ptr2 = head2;
	    
	    if (count1 > count2)
	    {
	        for (int i = 0; i < diff; i++)
	        {
	            ptr1 = ptr1.next;
	        }
	    }
	    else if (count2 > count1)
	    {
	        for (int i = 0; i < diff; i++)
	        {
	            ptr2 = ptr2.next;
	        }
	    }
	    
	    while (ptr1 != null && ptr2 != null)
	    {
	        if (ptr1 == ptr2)
	        {
	            return ptr1.data;
	        }
	        
	        ptr1 = ptr1.next;
	        ptr2 = ptr2.next;
	    }
	    
	    return -1;
	}
}
