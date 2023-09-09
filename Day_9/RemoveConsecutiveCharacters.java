class Solution
{
    public String removeConsecutiveCharacter(String S)
    {
        StringBuilder ans = new StringBuilder();
        
        ans.append(S.charAt(0));
        
        for (int i = 1; i < S.length(); i++)
        {
            if (S.charAt(i) != S.charAt(i - 1))
            {
                ans.append(S.charAt(i));
            }
        }
        
        return ans.toString();
    }
}
