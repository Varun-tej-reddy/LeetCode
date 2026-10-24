class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        l = len(s)//2
        c = 0
        while c < l :
            temp = s[c]
            s[c] = s[len(s)-1-c]
            s[len(s)-1-c] = temp
            c+=1

        