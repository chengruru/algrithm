package leetcode;

public class Problem58 {

    public static void main(String[] args) {
        String str = "  ";
        String str_test = " hellow ";
        Problem58 demo = new Problem58();
        System.out.println(str_test.trim().split(" ").length);

        System.out.println(demo.lengthOfLastWord(str));
    }
    public int lengthOfLastWord(String s) {

        if(s.trim().equals(""))
            return 0;

        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();

    }
}
