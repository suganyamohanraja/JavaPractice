package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeAndSortLinkedLists {
	

	public static void main(String[] args) {
		ListNode list1 = new ListNode(5);
		list1.next = new ListNode(10);
		list1.next.next = new ListNode(15);
		list1.next.next.next = new ListNode(40);
 
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(20);
 
        List<Integer> v = new ArrayList<>();
        while (list1 != null) {
            v.add(list1.val);
            list1 = list1.next;
        }
 
        while (list2 != null) {
            v.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(v);
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        for (int i = 0; i < v.size(); i++) {
            result.next = new ListNode(v.get(i));
            result = result.next;
        }
 
        temp = temp.next;
        System.out.print("Resultant Merge Linked List is : ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

	}

}
