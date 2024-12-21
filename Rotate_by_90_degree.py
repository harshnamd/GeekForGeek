class Solution:
    
    def rotateby90(self, mat): 
        
        n = len(mat)
        
        for i in range(n):
            for j in range(i+1,n):
                mat[i][j],mat[j][i] = mat[j][i],mat[i][j]
                
        mat.reverse()
