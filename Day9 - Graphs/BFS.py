v = 5
adj = [[] for _ in range(v)]
edges = [[0, 1], [0, 2], [1, 3], [1, 4], [2, 4]]

for i in edges:
    adj[i[0]].append(i[1])
    adj[i[1]].append(i[0])

visited = [False] * len(adj)
s = 1

def bfs(vis, s, adj):
    from collections import deque
    q = deque()
    vis[s] = True
    q.append(s)
    while q:
        curr = q.popleft()
        print(curr, end=" ")
        for i in adj[curr]:
            if not vis[i]:
                vis[i] = True
                q.append(i)

bfs(visited, s, adj)
