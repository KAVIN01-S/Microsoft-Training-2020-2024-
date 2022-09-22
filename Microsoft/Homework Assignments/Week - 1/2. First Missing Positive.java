class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        {
            set.add(i);
        }
        
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}
