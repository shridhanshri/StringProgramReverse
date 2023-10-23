package srtprogram;

class Solution {
    String reverseWords(String S) 
    {
        String[]a= S.split("\\.");

        
       StringBuilder sb= new StringBuilder();
            int i;
        for (i =a.length-1;i >= 0;i--)
        {
            sb.append(a[i]);
            if (i > 0) 
            {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}
class ReverseString 
{
    public static void main(String[] args)
    {
        String S = "i.like.this.program.very.much";

        Solution s1= new Solution();
        String reversed = s1.reverseWords(S);
        System.out.println(reversed);
    }
}


