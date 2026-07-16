class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character , Integer> set = new HashMap<>();
        if(s.length() != t.length()){
            return false ;
        }
        for(int i = 0 ; i < s.length(); i++){
            if(set.containsKey(s.charAt(i))){
                set.put(s.charAt(i) , set.get(s.charAt(i))+1);
                if(set.get(s.charAt(i))<0){
                    return false;
                }
            }
            else{
                set.put(s.charAt(i) , 1);
            }
        }
        for(int j = 0; j<t.length(); j++){
            if(set.containsKey(t.charAt(j))){
                set.put(t.charAt(j) , set.get(t.charAt(j))-1);
            }
            else{
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