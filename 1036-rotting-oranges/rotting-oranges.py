from collections import deque

class Solution(object):
    def bfs(self, grid, q, fresh):
        rows, cols = len(grid), len(grid[0])
        time = 0
        visit=set()

        while q:
            r, c, t = q.popleft()
            time = max(time, t)   
            for dr, dc in [(1,0), (-1,0), (0,1), (0,-1)]:
                nr, nc = r + dr, c + dc
                if ( 0 <= nr < rows and 0 <= nc < cols and
                 grid[nr][nc] == 1 and (nr,nc) not in visit):
                    visit.add((nr,nc))
                    fresh -= 1
                    q.append((nr, nc, t + 1))
        return -1 if fresh > 0 else time

    def orangesRotting(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        rows, cols = len(grid), len(grid[0])
        q = deque()
        fresh = 0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 2:
                    q.append((r, c, 0))  
                elif grid[r][c] == 1:
                    fresh += 1

    
        return self.bfs(grid, q, fresh)
