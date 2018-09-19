package leetcode;

public class Problem06 {

    public static void main(String[] args) {
        Problem06 demo = new Problem06();
        String str = "PAYPALISHIRING";
        String convert = demo.convert(str, 4);
        System.out.println("convert : " + convert);
        System.out.println("resultc : PINALSIGYAHRPI");
        System.out.println(convert.equals("PINALSIGYAHRPI"));
    }
    public String convert(String s, int numRows) {
        if (s.trim().equals(""))
            return "";
        char[] chars = s.toCharArray();
        int index = numRows * 2 - 2;
        int delta = index;
        StringBuilder reslut = new StringBuilder();
        int j = 0;
        for (int i = 0; i < numRows; i++){
            reslut.append(chars[i]);
            System.out.println("delta : " + delta);
            for (j = i + delta; j < chars.length; j += delta){
                reslut.append(chars[j]);
            }
            delta -= 2;
            if(i == numRows - 2){
                delta = index;
            }
        }
        return reslut.toString();
    }
}
