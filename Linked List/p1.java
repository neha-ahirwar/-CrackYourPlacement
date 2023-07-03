//Using tortoise and hare algorithm or Floyd Warshall Algorithm
//TC= O(n/2)~O(n)
//SC= O(1) as we are not taking any extra space

class Solution{
    public ListNode middleNode(ListNode head){

        ListNode slowPtr= head;
        ListNode fastPtr= head;

        //Travel until the fast pointer reaches the last node or null
        while(fastPtr!=null && fastPtr.next!=null){
           
            //Slow pointer moves 1 node
             slowPtr= slowPtr.next;

             //Fast pointer moves 2 nodes
             fastPtr= fastPtr.next.next;
        }
        return slowPtr;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 
/*class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array= new ArrayList<>();

        int length = 0;
        while(head !=null){
            array.add(head);
            head= head.next;
            length++;
        }


        return array.get(length/2);

        //TC=O(N)
        //SC=O(n) We are copying list to an array that's why O(n) complexity
        
    }
} */



//using pointer
/*class Solution{
    public ListNode middleNode(ListNode head){
        ListNode middle = head;
        ListNode end = head;

        while( end!= null && end.next !=null){
            middle = middle.next;
            end= end.next;
        }
        return middle;
    }

    //TC= O(n)
    //SC = O(1)

  
} */ //giving wrong answer 

//  // hare tortoise problem, tortoise moves 1 step, hare moves 2 steps, H= null or next to hare is null then stop the problem, tortoise will give middle

/*class Solution{
    public:
    Listnode* middleNode(ListNode* head){

        ListNode *hare, *tortoise;
        hare= tortoise = head;

        while(hare && hare->next)
        {
            hare= hare->next->next;
            tortoise= tortoise->next;
        }

        return tortoise;
    }
};
*/

























