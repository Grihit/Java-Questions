public class Word 
{

    public static String arrayToString(char[] a) {
        String str = new String(a);
        return str;
    }

    static int wordCount(String str) {
        int count = 0;

        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    static char mostFrequent(String str) {
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "My name is Grihit Budhiraja";
        System.out.println("Number of words in " + str + " are " + wordCount(str));
        char s[] = { '1', '9', 'B', 'C', 'E', '2', '1', '4', '1' };
        System.out.println("Character array after concatenation: " + arrayToString(s));
        String str2 = "aajahsjdkajdkaaaaaadjflsjaaaaaaaaajdkfjaaaiaaa";
        System.out.println("Most occuring character in string " + str2 + " is " + mostFrequent(str2));
    }
}

