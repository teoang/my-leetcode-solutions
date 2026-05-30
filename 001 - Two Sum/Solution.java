/*
LeetCode 1 - Two Sum

Given an integer array nums and an integer target, return the indices of two
different elements whose sum is target.

There is exactly one valid answer, and the same element cannot be used twice.
The answer may be returned in any order.

Example 1:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]

Example 2:
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]

Example 3:
Input: nums = [3, 3], target = 6
Output: [0, 1]

Constraints:
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> aux = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            aux.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {

            if (aux.containsKey(target-nums[i]) && aux.get(target-nums[i])!=i){
                return new int[] {i,aux.get(target - nums[i])};
            }
        }

        return null;
    }
}

/* This solution use time = 0(n).

