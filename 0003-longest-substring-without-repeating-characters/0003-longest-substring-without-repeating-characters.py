class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        l = max_len = 0
        s_set = set()
        for i in range(len(s)):
            while s[i] in s_set:
                s_set.remove(s[l])
                l+=1
            s_set.add(s[i])
            max_len = max(max_len, len(s_set))
        return max_len


        