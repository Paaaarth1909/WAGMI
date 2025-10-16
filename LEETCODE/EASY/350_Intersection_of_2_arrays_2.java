/* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for (int n : nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);
        
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                result.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}
