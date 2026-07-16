class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character , Integer> set = new HashMap<>();
        if(s.length() != t.length()){
            return false ;
        }
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(set.containsKey(ch)){
                set.put(ch , set.get(ch)+1);
            }
            else{
                set.put(ch , 1);
            }
        }
        for(int j = 0; j<t.length(); j++){
            char ch =  t.charAt(j);
            if(!set.containsKey(ch)){
                return false ;
            }
            set.put(ch , set.get(ch)-1);
                if(set.get(ch)<0){
                    return false;
                }
        }
        for(int freq : set.values()){
            if(freq!=0){
                return false;
            }
        }
        return true;
    }
}