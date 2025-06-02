class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        #day two: python mirror refresher by translating written java code
        for i in range (len(nums)):
            if nums[i] == target:
                return i
            
            if target < nums[i]:
                return i
        return len(nums)
        
