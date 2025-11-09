
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class PartitionList {
     public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode temp1 = new ListNode(0) ;
        ListNode temp2 = new ListNode(0);
        ListNode before = temp1;
        ListNode after = temp2 ;
        ListNode temp = head ;
        while(temp!= null){
         if(temp.val < x){
            before.next= temp;
            before = before.next ;
         }
         else {
            after.next = temp;
            after = after.next ; 
         }
         temp = temp.next;
        }
        after.next = null;
        before.next = temp2.next ;
        return temp1.next ;
    }
}
