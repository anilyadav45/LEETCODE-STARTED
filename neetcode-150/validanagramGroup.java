import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap<>();//key is sorted str like for cat -> act and value --> is List which contains same anagrams for act like act,tac,cat

        //for each s in strs
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);//we got cat to act here

           //if not exist make new key if exist put value as list to existed key 
            if(!map.containsKey(sorted)){
              map.put(sorted,new LinkedList<String>());//maked key i.e basically a group to hold orinal strs
            }
            //this execute if sorted existing so add it to same group which exist 
            map.get(sorted).add(s);//get existed key and added original str as value in that list


        }
        return new LinkedList<>(map.values()); // will return linkedlist 
    }
}