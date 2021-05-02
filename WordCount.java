class WordCount {

    public static void main(String[] args) {
        String str = "Kindly study for the CSE1004 and CSE2004 course";
        int v=0, c=0, d=0, s=0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                v++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                c++;
            }
            else if( ch >= '0' && ch <= '9')
            {
                d++;
            }
            else if (ch ==' ')
            {
                s++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("White spaces: " + s);
    }
}