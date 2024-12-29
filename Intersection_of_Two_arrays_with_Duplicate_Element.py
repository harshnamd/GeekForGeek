class Solution:
    def intersectionWithDuplicates(self, a, b):
        # code here
        lst=[]
        x=set(a)
        y=set(b)
        for i in x:
            if i in y:
                lst.append(i)
        return lst
