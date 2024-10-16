package _07_dfs_bfs_basic;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class _05_이진트리순회 {
    Node root;

    public void DFS(Node root) {

        if (root == null) return; // 탈출 조건: 노드가 null 인 경우
        else {

            // 전위 순회 (Pre-order): Root -> Left -> Right
            // System.out.print(root.data + " ");

            DFS(root.lt);

            // 중위 순회 (In-order): Left -> Root -> Right
            System.out.println(root.data + " ");

            DFS(root.rt);

            // 후위 순회 (Post-order): Left -> Right -> Root
            // System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        _05_이진트리순회 tree = new _05_이진트리순회();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
