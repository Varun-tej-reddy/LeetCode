class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        f = float ('-inf')
        s = float ('-inf')
        t = float ('-inf')


        for e in nums:
            if e > f:
                t = s
                s = f
                f = e
            elif e == f or e == s or e == t: continue
            elif e > s:
                t = s 
                s = e
            elif e > t:
                t = e
        
        if t != float('-inf'): return t
        return f



        