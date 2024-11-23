// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer , Integer> map = new HashMap();

//         for(int i =0; i<nums.length; i++){
//             map.put(nums[i],i);
//         }

//         for(int i = 0; i<nums.length; i++){
//             int num = nums[i];
//             int rem = target - num;
//             if(map.containsKey(rem)){
//                 int index = map.get(rem);
//                 return new int[]{i,index};

//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
