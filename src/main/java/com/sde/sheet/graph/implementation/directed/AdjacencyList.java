package com.sde.sheet.graph.implementation.directed;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0 ; i <= n ;i++ ) {
            adjList.add(new ArrayList<Integer>());
        }
        //1---2
        adjList.get(1).add(2);

        //1----3
        adjList.get(1).add(3);

        //2--------3
        adjList.get(2).add(3);


        for(int i = 1; i<= n;i++){
            System.out.print(i +"= ");
            for (int j = 0; j < adjList.get(i).size() ; j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }




//                1----------->2
//                 \           |
//                   \         |
//                    \        |
//                      \      \/
//                         \ > 3
    }
}
