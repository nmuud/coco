package _07_dfs_bfs_basic;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}
public class _07_이진트리레벨탐색 {
    Node1 root;

    public void BFS(Node1 root) {
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0; // 레벨을 기록하는 변수
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : "); // 현재 레벨 출력
            for (int i = 0; i < len; i++) {
                Node1 cur = queue.poll(); // 큐에서 현재 노드를 꺼냄
                System.out.print(cur.data + " "); // 현재 노드의 데이터 출력
                if (cur.lt != null) {
                    queue.offer(cur.lt); // 왼쪽 자식이 있으면 큐에 추가
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt); // 오른쪽 자식이 있으면 큐에 추가
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        _07_이진트리레벨탐색 tree = new _07_이진트리레벨탐색();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.BFS(tree.root);
    }
}
