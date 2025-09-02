class Solution(object):
    def dfs(self, board, visit, i, j):
        n = len(board)
        m = len(board[0])
        if i < 0 or j < 0 or i >= n or j >= m:
            return
        if board[i][j] != "O" or (i, j) in visit:
            return
        visit.add((i, j))
        self.dfs(board, visit, i + 1, j)
        self.dfs(board, visit, i - 1, j)
        self.dfs(board, visit, i, j + 1)
        self.dfs(board, visit, i, j - 1)

    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """ 
        if not board or not board[0]:
            return

        n = len(board)
        m = len(board[0])
        visit = set()

    
        for i in range(n):
            if board[i][0] == "O" and (i, 0) not in visit:
                self.dfs(board, visit, i, 0)
            if board[i][m - 1] == "O" and (i, m - 1) not in visit:
                self.dfs(board, visit, i, m - 1)

        for j in range(m):
            if board[0][j] == "O" and (0, j) not in visit:
                self.dfs(board, visit, 0, j)
            if board[n - 1][j] == "O" and (n - 1, j) not in visit:
                self.dfs(board, visit, n - 1, j)

        for r in range(n):
            for c in range(m):
                if (r, c) not in visit and board[r][c] == "O":
                    board[r][c] = "X"
