package com.sde.sheet.graph.implementation.directed;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        int[][] adjMatrix = new int[n+1][m+1];

        adjMatrix[1][2]=1;
        adjMatrix[2][1]=1;

        adjMatrix[2][4]=1;
        adjMatrix[4][2]=1;

        adjMatrix[1][3]=1;
        adjMatrix[3][1]=1;

        adjMatrix[3][4]=1;
        adjMatrix[4][3]=1;

        adjMatrix[2][5]=1;
        adjMatrix[5][2]=1;

        adjMatrix[4][5]=1;
        adjMatrix[5][4]=1;

        for (int i =0 ;i< adjMatrix.length;i++) System.out.print(i + " ");

        System.out.println("\nnodes of graph ^");

        for (int[] a:adjMatrix) {

            for (int b:a) {
                System.out.print(b + " ");
            }

            System.out.println();
        }
//        1----------------2 \
//        |                |   \
//        |                |    \
//        |                |     5
//        |                |    /
//        |                |   /
//        3----------------4 /
    }
}
