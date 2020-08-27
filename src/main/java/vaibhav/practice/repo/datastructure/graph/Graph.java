package vaibhav.practice.repo.datastructure.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {

	private int v;
	private LinkedList<Integer> adj[];

	@SuppressWarnings("unchecked")
	public Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int a, int b) {
		adj[a].add(b);
	}

	private void bfs(int s) {
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<>();

		visited[s] = true;
		queue.offer(s);
		System.out.print("head");

		while (queue.size() != 0) {
			Integer ver1 = queue.poll();
			System.out.print(" ->");
			System.out.print(ver1);

			ListIterator<Integer> iterator = adj[ver1].listIterator();
			while (iterator.hasNext()) {
				Integer ver = iterator.next();

				if (!visited[ver]) {
					visited[ver] = true;
					queue.offer(ver);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(2, 2);

		graph.bfs(0);
	}

}
