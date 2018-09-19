package leetcode;

public class Problem83 {
    /**
     * 解答：
     * 因为是有序链表，所以去重只需要比较新来的节点和前面一个节点是否相同，如果相同直接删除就可以了。
     * 思考一个问题，因为在链表不为空的情况下，第一个节点是不可能会被删除的，
     * 所以我们不需要向前面那样，在第一个节点之前创建一个节点，我们直接从第二个节点开始比较。
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_copy(ListNode head) {
        // 直接从第二个节点开始比较。
        if(head == null || head.next == null)
            return head;

        ListNode preNode = head;
        ListNode currentNode = head.next;

        while (currentNode != null){
            if(preNode.val == currentNode.val){
                preNode.next = currentNode.next;
            }else {
                preNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode double_one = new ListNode(1);
        ListNode third_one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = double_one;
        double_one.next = third_one;
        third_one.next = two;
        two.next = three;
        three.next = null;
        Problem83 demo = new Problem83();
        one = demo.deleteDuplicates_copy(one);

        while (one!= null){
            System.out.println(one.val);
            one = one.next;
        }


    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
