package LinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RotateList {
      public ListNode rotateRight(ListNode head, int k) {
        if(head == null|| head.next == null || k== 0){
            return head ;
        }

        ListNode temp= head ;
        int length = 1 ;
        while(temp.next != null){
            length++;
            temp= temp.next ;
        }
         
        temp.next = head ;
        k = k%length ;
        int end = length - k ;
        while(end!=0){
            temp = temp.next;
            end--;
        }
        //  temp.next = head ;
        head = temp.next ;
         temp.next = null ;

         return head ;

    }
}
