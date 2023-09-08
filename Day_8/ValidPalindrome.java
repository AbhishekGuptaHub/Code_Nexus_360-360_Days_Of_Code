class Solution
{
    public boolean isPalindrome(String s)
    {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
            {
                temp.append(s.charAt(i));
            }
            else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                temp.append((char)(s.charAt(i) + 32));
            }
            else if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
            {
                temp.append(s.charAt(i));
            }
        }

        for (int i = 0; i < temp.length() / 2; i++)
        {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1))
            {
                return false;
            }
        }

        return true;
    }
}
