package leetcode;

public class Problem24 {

    public static void main(String[] args) {
        Problem24 demo = new Problem24();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
        one = demo.swapPairs(one);
        while (one != null){
            System.out.println(one.val);
            one = one.next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        //如果链表为空或者只有一个节点，那么就直接返回head节点即可
        if(head == null ||head.next == null)
            return head;
        ListNode preNode, currentNode, afterNode;
        currentNode = head;
        //添加辅助头节点，这是链表中比较常用的小技巧，因为这样可以避免处理head的边界情况
        head = new ListNode(0);
        head.next = currentNode;
        preNode = head;
        while (currentNode!=null && currentNode.next!=null){
            afterNode = currentNode.next;
            currentNode.next = afterNode.next;
            afterNode.next = currentNode;
            preNode.next = afterNode;
            preNode = currentNode;
            currentNode = currentNode.next;

        }
        return head.next;
    }
}
