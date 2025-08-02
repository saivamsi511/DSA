package com.learning.trees;

import java.util.*;

public class postorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Treepostorder t = new Treepostorder();
        
        // Input: comma-separated integers
        String s = sc.nextLine();
        String[] a = s.split(",");
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        
        int target = sc.nextInt();
        
        for (int i=0;i<arr.length;i++) {
            t.insert(arr[i]);
        }

        ArrayList<Integer> result = t.postorder();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        
        for(int i=0;i<result.size();i++) {
        	System.out.println(al.get(i));
        	if(result.get(i) < target)
        		al.add(result.get(i));
        	else
        		al1.add(result.get(i));
        }
        System.out.println(al);
        System.out.println(al1);
        
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class Treepostorder {
    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    ArrayList<Integer> postorder() {
        ArrayList<Integer> result = new ArrayList<>();
        postorderRec(root, result);
        return result;
    }

    void postorderRec(Node root, ArrayList<Integer> list) {
        if (root != null) {
            postorderRec(root.left, list);
            postorderRec(root.right, list);
            list.add(root.data);
        }
    }
}
