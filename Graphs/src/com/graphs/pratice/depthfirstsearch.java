package com.graphs.pratice;

import java.util.*;

class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addRoom(String room) {
        adjList.putIfAbsent(room, new ArrayList<>());
    }

    public void addCorridor(String room1, String room2) {
        adjList.get(room1).add(room2);
        adjList.get(room2).add(room1);
    }

    public void dfs(String currentRoom, Set<String> visited) {
        if (visited.contains(currentRoom)) return;

        System.out.println("Visited Room: " + currentRoom);
        visited.add(currentRoom);

        for (String neighbor : adjList.get(currentRoom)) {
            dfs(neighbor, visited);
        }
    }
}

public class depthfirstsearch {
    public static void main(String[] args) {
        Graph exhibition = new Graph();

        exhibition.addRoom("RoomA");
        exhibition.addRoom("RoomB");
        exhibition.addRoom("RoomC");
        exhibition.addRoom("RoomD");

        exhibition.addCorridor("RoomA", "RoomB");
        exhibition.addCorridor("RoomA", "RoomC");
        exhibition.addCorridor("RoomB", "RoomD");

        Set<String> visited = new HashSet<>();
        System.out.println("Starting DFS from RoomA:");
        exhibition.dfs("RoomA", visited);
    }
}
