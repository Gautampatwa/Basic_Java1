package StringExample;

public class StringOnlyNumberSum {
    public static void main(String[] args) {
        String s="Ab1kkkd332";

        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int digit=Character.getNumericValue(ch);
                sum=sum+digit;
            }
        }
        System.out.println(sum);


    }
}
