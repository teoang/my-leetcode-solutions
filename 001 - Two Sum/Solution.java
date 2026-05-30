/*
LeetCode 1 - Two Sum

Consegna:
Dato un array di interi nums e un intero target, restituisci gli indici dei due numeri
tali che la loro somma sia uguale a target.

Puoi assumere che esista esattamente una soluzione e non puoi usare due volte
lo stesso elemento.

Esempi:
nums = [2, 7, 11, 15], target = 9
output = [0, 1]

nums = [3, 2, 4], target = 6
output = [1, 2]
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


