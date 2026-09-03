package com.snpsu.DSA.Graphs.Representation.AdjacencyMatrix;

public class Graph {
    int v;
    int[][] adjMatrix;
    Graph(int vertices){
        v=vertices;
        adjMatrix=new int[v][v];
    }
    void addEdge(int u,int v){//adding and connecting edges  here v is and vertice
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;//this is for unweighted undirected graphg
        /*adjMatrix[u][v]=weight;
        if(direction==1){
            adjMatrix[v][u]=direction;
        }*/
    }
    void printAdjMat(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
class Driver{
    static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,5);
        g.printAdjMat();
    }
}
