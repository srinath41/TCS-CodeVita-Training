v=5
adj=[[] for _ in range(v)]
edges=[[1, 2], [1, 0], [2, 0], [2, 3], [2, 4]]
for i in edges:
    adj[i[0]].append(i[1])
    adj[i[1]].append(i[0])
visited=[False]*len(adj)
s=0
def dfs(vis,s,adj):
    vis[s]=True
    print(s,end=" ")
    for i in adj[s]:
        if vis[i]==False:
            dfs(vis,i,adj)
dfs(visited,s,adj)