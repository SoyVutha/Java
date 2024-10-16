package Leetcode;
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next=null;
    }
}
public class RemoveFromList {
    public static void main(String[] args) {
 
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
