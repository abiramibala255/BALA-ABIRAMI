// Last updated: 8/24/2026, 10:06:07 AM
1import java.util.*;
2
3class Solution {
4    public ListNode mergeKLists(ListNode[] lists) {
5        
6        PriorityQueue<ListNode> pq = new PriorityQueue<>(
7            (a, b) -> a.val - b.val
8        );
9
10        // Add first node of every list
11        for (ListNode list : lists) {
12            if (list != null) {
13                pq.add(list);
14            }
15        }
16
17        ListNode dummy = new ListNode(0);
18        ListNode current = dummy;
19
20        while (!pq.isEmpty()) {
21            ListNode node = pq.poll();
22
23            current.next = node;
24            current = current.next;
25
26            // Add next node from the same list
27            if (node.next != null) {
28                pq.add(node.next);
29            }
30        }
31
32        return dummy.next;
33    }
34}