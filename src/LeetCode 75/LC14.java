class LC14 {
    public String longestCommonPrefix(String[] strs) {
        String str1= strs[0];
        for (int i= 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str1)) {
                int len= str1.length();
                str1 = str1.substring(0, len-1);
                if (len == 0)
                    return "";
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        LC14 obj = new LC14();
        String strs[] = {"flower","flow","flight"};
        String res = obj.longestCommonPrefix(strs);
        System.out.println(res);//fl
    }
}