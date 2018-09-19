package leetcode;

public class Problem02 {

    public static void main(String[] args) {
        Problem02 demo = new Problem02();
        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(4);
//        ListNode three = new ListNode(3);

        ListNode one_1 = new ListNode(9);
        ListNode two_1 = new ListNode(9);
//        ListNode three_1 = new ListNode(4);
//        one.next = two;
//        two.next = three;
        one_1.next = two_1;
//        two_1.next = three_1;


        ListNode listNode = demo.addTwoNumbers(one, one_1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number1 = 0, number2 = 0;
        int c = 0; // 表示进位信息
        int addNumber = 0;
        ListNode head = new ListNode(0);
        ListNode listNode = head;
        while (l1 != null || l2 != null){
            if (l1 != null){
                number1 = l1.val;
                l1 = l1.next;
            }else
                number1 = 0;
            if (l2 != null){
                number2 = l2.val;
                l2 = l2.next;
            }else
                number2 = 0;
            addNumber = number1 + number2 + c;
            c = addNumber / 10;
            addNumber = addNumber % 10;
            listNode.next = new ListNode(addNumber);
            listNode = listNode.next;
        }
        if(c > 0){
            listNode.next = new ListNode(c);
        }
        return head.next;
    }
}
