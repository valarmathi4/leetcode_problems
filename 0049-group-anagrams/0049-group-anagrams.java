class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String word:strs){
        char words[]=word.toCharArray();
        Arrays.sort(words);
        String key=new String(words);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(word);
    }
    return new ArrayList<>(map.values());
}
}