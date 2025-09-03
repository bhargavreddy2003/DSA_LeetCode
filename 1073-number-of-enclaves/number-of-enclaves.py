import collections
class Solution(object):
     
    def numEnclaves(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        
        count=0
        q= collections.deque()
        visit = set()
        n = len(grid)
        m= len(grid[0])
        directions = [(1,0), (-1,0), (0,1), (0,-1)]
        for i in range (n):
            if(grid[i][0]==1 ):
                q.append((i,0))
                visit.add((i,0))
            if(grid[i][m-1]==1 ):
                q.append((i,m-1))
                visit.add((i,m-1))
        for j in range (m):
            if(grid[0][j]==1 ):
                q.append((0,j))
                visit.add((0,j))
            if(grid[n-1][j]==1 ):
                q.append((n-1,j))
                visit.add((n-1,j))
        while q:
            r , c = q.popleft()
            for dr , dc in directions:
                nr, nc = r+dr, c+dc
                if ( 0<=nr<n and 0<=nc<m and (nr, nc) not in visit and grid[nr][nc]==1):
                    q.append((nr,nc))
                    visit.add((nr,nc))
        
        for i in range(n):
            for j in range(m):
                if grid[i][j]==1 and (i,j) not in visit:
                    count+=1
        
        return count
            


            
            


        

        