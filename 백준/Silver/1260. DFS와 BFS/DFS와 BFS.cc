#include <iostream>
#include <queue>
#include <algorithm>
#include <cstring>  // memset 함수를 사용

using namespace std;

const int MAX = 1001;
bool visit[MAX];
vector<int> adj[MAX];
queue<int> Q;

void BFS(int start){
  memset(visit, false, sizeof(visit));
  visit[start] = true;
  Q.push(start);

  while(!Q.empty()){
    int x = Q.front();
    Q.pop();
    cout << x << " ";  // 탐색된 정점 출력
    for(int i = 0; i<adj[x].size(); i++){
      int next = adj[x][i];
      if(!visit[next]){
        visit[next] = true;
        Q.push(next);
      }
    }
  }
}

void DFS(int cur){
  visit[cur] = true;
  cout << cur << " ";  // 탐색된 정점 출력
  for(int i = 0; i<adj[cur].size(); i++){
    int next = adj[cur][i];
    if(visit[next]) continue;
    DFS(next);
  }
}

int main() {
  int n, m, v;
  cin  >> n >> m >> v;

  for(int i = 0; i<m; i++){
    int s, e;
    cin >> s >> e;
    adj[s].push_back(e);
    adj[e].push_back(s);
  }

  for(int i = 1; i<=n; i++){
    sort(adj[i].begin(), adj[i].end());
  }

  DFS(v);
  cout << endl;
  BFS(v);
  
  return 0;
}
