class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            int freq[]=new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            StringBuilder s=new StringBuilder();
            for(int i=0;i<26;i++){
                s.append(freq[i]).append("#");
            }
            map.putIfAbsent(s.toString(),new ArrayList<>());
            map.get(s.toString()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
