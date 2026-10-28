class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>>ans=new HashMap<>();
     for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String key=String.valueOf(ch);
        ans.computeIfAbsent(key,k->new ArrayList<>()).add(s);
     }
     return new ArrayList<>(ans.values());
   }

    }