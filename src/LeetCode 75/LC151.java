class LC151 {
    public String reverseWords(String s) {
        int i,j,start=0, end=0;
        s=" "+s+" ";
        String newstr="";
        int len=s.length();

        for(i=0, j=1;i<len && j<len; i++, j++) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                start = i;
            }
            if (s.charAt(j) == ' ' && s.charAt(j - 1) != ' ') {
                end = j;
                newstr = s.substring(start, end) + " " + newstr;
            }
        }
        int l=newstr.length();
        newstr=newstr.substring(0,l-1);
        return newstr;
    }

    public static void main(String[] args) {
        LC151 obj = new LC151();
        String s = "  hello world  ";
        System.out.println(obj.reverseWords(s)); // Output: "world hello"
    }
}