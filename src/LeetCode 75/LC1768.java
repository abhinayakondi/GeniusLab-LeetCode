class LC1768{
    public String mergeAlternately(String word1, String word2) {
        String merged="";
        int len1=word1.length();
        int len2=word2.length();
        int len= (len1>=len2)? len1 : len2;
        int i;
        char c1='\u0000';
        char c2='\u0000';
        for(i=0;i<len;i++){
            if (i<len1){
                c1=word1.charAt(i);
                merged=merged+c1;
            }
            if (i<len2){
                c2=word2.charAt(i);
                merged=merged+c2;
            }
        }
        return merged;
    }

    public static void main(String[] args){
        LC1768 obj=new LC1768();
        String word1="abc";
        String word2="pqr";
        String merged=obj.mergeAlternately(word1,word2);
        System.out.println(merged);
    }
}