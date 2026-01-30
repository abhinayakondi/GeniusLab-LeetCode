class LC345 {
    public String reverseVowels(String s) {

        boolean[] isVowel = new boolean[128];

        for(char c : "aeiouAEIOU".toCharArray()){
            isVowel[c] = true;
        }

        char[] charecters = s.toCharArray();

        int i = 0, j = charecters.length-1;

        while(i < j){
            while(i < j && !isVowel[charecters[i]]){
                ++i;
            }
            while(i < j && !isVowel[charecters[j]]){
                --j;
            }
            if(i < j){
                char ch = charecters[i];
                charecters[i] = charecters[j];
                charecters[j] = ch;

                ++i;
                --j;
            }
        }
        return String.valueOf(charecters);
    }

    public static void main(String[] args) {
        LC345 obj = new LC345();
        String s = "IceCreAm";
        System.out.println(obj.reverseVowels(s)); // Output: "AmCrIcee"
    }
}