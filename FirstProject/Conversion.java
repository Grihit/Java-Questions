public class Conversion {
	static void convert(StringBuffer str)
    {
        int l = str.length();
        for (int i = 0; i < l; i++) 
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1, Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1, Character.toLowerCase(c) + "");
        }
    }
 
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("ABCdef");
        convert(str);
        System.out.println(str);
    }
}

