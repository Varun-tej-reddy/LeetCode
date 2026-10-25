class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        num_map = {}
        for i in s:
            num_map[i] = num_map.get(i, 0)+1

        for i in range(len(s)):
            if num_map[s[i]] == 1:
                return i
        return -1
        