package com.prashansha.codingPractise;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummy=new ListNode();
	        dummy.val=0;
	        dummy.next=null;
	        ListNode merge=dummy;
	        while(true){
	          if(l1==null){
	            merge.next=l2;
	              break;
	           
	              }
	        if(l2==null)
	        {
	            merge.next=l1;
	            break;
	        }
	              if(l1.val<=l2.val)
	              {
	                  merge.next=l1;
	                  l1=l1.next;
	                  
	              }
	        if(l2.val<l1.val)
	        {
	            merge.next=l2;
	            l2=l2.next;
	        }
	        merge=merge.next;
	        }
	        return dummy.next;
	    }
}
