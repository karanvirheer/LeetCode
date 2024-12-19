/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        for (String string : strs) {
            HashMap<Character, Integer> strMap = new HashMap<>();
            for (char c : string.toCharArray()) {
                strMap.put(c, strMap.getOrDefault(c, 0) + 1);
            }

            if (map.containsKey(strMap)) {
                map.get(strMap).add(string);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(string);
                map.put(strMap, list);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (ArrayList<String> v : map.values()){
            list.add(v);
        }

        return list;
    }
}
// @lc code=end
