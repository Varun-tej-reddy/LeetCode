class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = r = 0
        while r <= len(nums)-1:
            if nums[l] == 0 and nums[r] == 0:
                r+=1
            elif nums[l] == 0 and nums[r] != 0:
                temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                r+=1
                l+=1
            else:
                r+=1
                l+=1
        
            