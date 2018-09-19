package leetcode;

import java.util.HashMap;

public class Problem13 {

    public static void main(String[] args) {
        Problem13 demo = new Problem13();
        System.out.println(demo.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {

        s = s+"*";  //为了方便处理最后一个字符
        char[] chars = s.toCharArray();
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('*', Integer.MIN_VALUE);
        int current = 0;
        int after = 0;
        int tmp = 0;
        for (int i = 0; i < chars.length - 1; i++){
            current = map.get(chars[i]);
            after = map.get(chars[i+1]);
            if (current < after){
                current = -current;
            }
            result += current;
        }
        return result;
    }

}
