class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        solutionArray = []
        firstIndex = 0
        secondIndex = 1

        for i in range(len(nums)):
            complement = target - nums[i]
            if(complement in nums[i+1:]):
                firstIndex = i
                secondIndex = nums[i+1:].index(complement) + i + 1
                solutionArray = [firstIndex, secondIndex]
                break

        return solutionArray