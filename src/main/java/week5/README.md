# 5주차 스터디 코드

- Breadth First Traversal은 큐에 인접한 노드를 넣어가며 큐의 순서대로 방문하며 탐색하는 방법이다. 코드에서는 ArrayList를 이용해 구현하였다.
구현중 알게 된 사실은 ArrayList는 추가 및 삭제 과정에서 사이즈와 인덱스가 다시 구성된다. 즉 중간에 빠지게 되는 경우 index가 기존에 알고 있던 정보와 다를 수 있다는 것이다.
ArrayList를 큐처럼 활용하기 위해 `arrayList.get(0)`를 이용했다.
- Depth First Traversal은 root에서 leaf까지를 우선적으로 탐색한다. DFS의 경우는 BFS와 다르게 재귀적으로 문제를 해결할 수 있었다.
문제를 해결하며 알게 된 사실은 재귀 함수라면 base case를 명시적으로 return 해주어야 한다고 생각했으나, 그렇지 않은 경우도 더러 있다는 것이다.
명확하게 이런 경우에는 괜찮다고 얘기하긴 어렵지만, DFS를 구현하면서 생각한 것은 `return 재귀함수 + 재귀함수 + 상수;`와 같이 상수가 함께 반환되는 경우는
괜찮지 않나 생각해보게 되었다.

[5주차 백기선님 Github Issue](https://github.com/whiteship/live-study/issues/4)