class Solution(object):
    def dfs(self, rimage, sr, sc, color, visit, startColor):
        rows, cols = len(rimage), len(rimage[0])
        if (0 <= sr < rows and 0 <= sc < cols and
            (sr, sc) not in visit and rimage[sr][sc] == startColor):
            visit.add((sr, sc))
            rimage[sr][sc] = color  
            self.dfs(rimage, sr-1, sc, color, visit, startColor) 
            self.dfs(rimage, sr+1, sc, color, visit, startColor) 
            self.dfs(rimage, sr, sc-1, color, visit, startColor)
            self.dfs(rimage, sr, sc+1, color, visit, startColor) 

    def floodFill(self, image, sr, sc, color):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type color: int
        :rtype: List[List[int]]
        """
        startColor = image[sr][sc]  
        if startColor == color:
            return image            
        visit = set()
        self.dfs(image, sr, sc, color, visit, startColor)
        return image
