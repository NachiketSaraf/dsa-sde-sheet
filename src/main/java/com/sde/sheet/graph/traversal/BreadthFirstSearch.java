package com.sde.sheet.graph.traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        int v = 9;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }
        addElements(graph.get(1), 2, 6);
        addElements(graph.get(2), 1, 3, 4);
        addElements(graph.get(3), 2);
        addElements(graph.get(4), 2, 5);
        addElements(graph.get(5), 4, 8);
        addElements(graph.get(6), 1, 7, 9);
        addElements(graph.get(7), 6, 8);
        addElements(graph.get(8), 7, 5);
        addElements(graph.get(9), 6);


        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " -> " + graph.get(i));
        }

        ArrayList<Integer> ans =bfs(v,graph);
        System.out.println(ans);
    }

    private static void addElements(ArrayList<Integer> arrayList, Integer... values) {
        arrayList.addAll(Arrays.asList(values));
    }

    private static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> graph){
        ArrayList<Integer> bfsAns = new ArrayList<>();
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1]=true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfsAns.add(node);

            for(Integer i : graph.get(node)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }

        }
        return bfsAns;
    }
}
