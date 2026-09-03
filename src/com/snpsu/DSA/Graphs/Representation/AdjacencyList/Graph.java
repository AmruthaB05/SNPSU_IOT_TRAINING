package com.snpsu.DSA.Graphs.Representation.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<Integer, ArrayList<Integer>> adjList;
    Graph(int vertices){//here v is not mentioned becoz it is doing only for loop work....!
        adjList=new HashMap<>();
        for(int i=0;i<vertices;i++){
            adjList.put(i,new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        //add v value to u key
        adjList.get(u).add(v);
        //add u value to v key
        adjList.get(v).add(u);
    }
    void printAdjList(){
        for(int vertex:adjList.keySet()){//iterator only key only of hashmap
            System.out.print(vertex+"->");
            for(int neigbour:adjList.get(vertex)){//iterator that iterates inside key arraylist
                System.out.print(neigbour+" ");
            }
            System.out.println();
        }
    }



}
class code{
    static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,5);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);
        g.printAdjList();

    }
}
