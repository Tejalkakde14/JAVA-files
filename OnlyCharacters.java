//Java Program to Remove all Characters in a String Except Alphabets.

class OnlyCharacters
{
   
   static void removeSpecialCharacter(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
          
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z')
            {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.print(str);
    }
   
    public static void main(String[] args)
    {
        String str = "asd@$%^&fghjkl@";
        removeSpecialCharacter(str);
    }
}