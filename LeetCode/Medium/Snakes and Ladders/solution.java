class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n * n + 1];

        q.offer(1);
        visited[1] = true;

        int moves = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int s = 0; s < size; s++) {
                int curr = q.poll();

                if (curr == n * n) {
                    return moves;
                }
                for (int next = curr + 1;
                     next <= Math.min(curr + 6, n * n);
                     next++) {

                    int[] pos = getPosition(next, n);

                    int r = pos[0];
                    int c = pos[1];

                    int destination = next;

                    if (board[r][c] != -1) {
                        destination = board[r][c];
                    }

                    if (!visited[destination]) {
                        visited[destination] = true;
                        q.offer(destination);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    private int[] getPosition(int num, int n) {

        int row = n - 1 - (num - 1) / n;
        int col = (num - 1) % n;

        if (((n - 1 - row) & 1) == 1) {
            col = n - 1 - col;
        }

        return new int[]{row, col};
    }
}