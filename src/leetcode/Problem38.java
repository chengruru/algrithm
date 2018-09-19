package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem38 {
    /**
     * 理解下规则。终于理解，题意是:
     * n=1时输出字符串1；
     * n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，所以输出11；
     * n=3时，由于上次字符是11，有2个1，所以输出21；
     * n=4时，由于上次字符串是21，有1个2和1个1，所以输出1211。
     * 依次类推，写个countAndSay(n)函数返回字符串。
     *
     * 思路解析：是典型的递归问题
     * @param args
     */
    public static void main(String[] args) {
        Problem38 demo = new Problem38();
        System.out.println(demo.countAndSay(4));
    }
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        //递归调用，然后对字符串处理
        String str = countAndSay(n -1) + "*";   //为了str末尾的标记，方便循环读数
        char[] chs = str.toCharArray();
//        System.out.println(str);

        int count = 1;
        String result = "";
        for (int i = 0; i < chs.length - 1; i++){   // 处理到倒数第二个字符，不处理*，*只是便于我们循环
            if(chs[i] == chs[i+1]){
                //计数增加
                count ++;
            }else {
                //上面的*标记这里方便统一处理
                result = result.concat(count +"" + chs[i]);
                count = 1;
            }
        }

        return result;
    }

}
