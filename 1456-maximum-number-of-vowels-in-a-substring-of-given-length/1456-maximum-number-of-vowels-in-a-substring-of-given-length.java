class Solution {
    public int maxVowels(String s, int k) {
        int vowelcount = 0 ;
        int currentvowelcount = 0 ;
        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                currentvowelcount += 1;
            }
        }
        vowelcount = currentvowelcount ;

        for(int i = k; i < s.length(); i++){
            char Outgoing = s.charAt(i-k);
            if (Outgoing == 'a' || Outgoing == 'e' || Outgoing == 'i' || Outgoing == 'o' || Outgoing == 'u'){
                currentvowelcount--;
            }
            char Incoming = s.charAt(i);
            if(Incoming == 'a' || Incoming == 'e' || Incoming == 'i' || Incoming == 'o' || Incoming == 'u' ){
                currentvowelcount++;
            }
            if(currentvowelcount > vowelcount){
                vowelcount = currentvowelcount;
            }
        }
        return vowelcount;
    }
}