class Solution {
    public boolean hasDuplicate(int[] nums) {

        int[] filteredArray = Arrays.stream(nums).distinct().toArray();

        int comparedLength = filteredArray.length - nums.length;
        
        if(comparedLength == 0) return false;
        else return true;
    }
}