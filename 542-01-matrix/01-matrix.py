import collections

class Solution(object):
    def updateMatrix(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[List[int]]
        """
        n, m = len(mat), len(mat[0])
        result = [[0]*m for _ in range(n)]
        visit = set()
        q = collections.deque()
        directions = [(1,0), (-1,0), (0,1), (0,-1)]

        for i in range(n):
            for j in range(m):
                if mat[i][j] == 0:
                    q.append((i, j, 0))  
                    visit.add((i, j))
        while q:
            r, c, d = q.popleft()
            result[r][c] = d
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if 0 <= nr < n and 0 <= nc < m and (nr, nc) not in visit and mat[nr][nc]==1:
                    q.append((nr, nc, d + 1))
                    visit.add((nr, nc))

        return result
