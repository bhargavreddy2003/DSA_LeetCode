class Solution(object):
    def dfs(self, isConnected, start, visited):
        visited.add(start)
        for neighbour, connected in enumerate(isConnected[start]):
            if connected == 1 and neighbour not in visited:
                self.dfs(isConnected, neighbour, visited)
            
    def findCircleNum(self, isConnected):
        """
        :type isConnected: List[List[int]]
        :rtype: int
        """
        visited = set()
        count = 0
        n = len(isConnected)
        
        for i in range(n):
            if i not in visited:
                count += 1
                self.dfs(isConnected, i, visited)
        
        return count
