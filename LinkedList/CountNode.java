package LinkedList;

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class CountNode {
      public int getCount(ListNode head) {
        // code here
        ListNode temp = head ;
        int count=1 ;
        while(temp.next!= null){
            count++;
            temp =temp.next ;
        }
        return count;
    }
}
