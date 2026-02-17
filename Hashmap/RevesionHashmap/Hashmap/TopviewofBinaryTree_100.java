package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left= null;
        right =null;
    }
}

public class TopviewofBinaryTree_100 {

    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {
            HashMap<Integer,Integer>map = new HashMap<>();
            Queue<Pair>q = new LinkedList<>();
            q.add(new Pair(root, 0));
            int minLevel = Integer.MAX_VALUE;
            int maxLevel = Integer.MIN_VALUE;
            while (q.size()>0) {
                Pair temp = q.remove();
                Node n =temp.node;
                int lvl = temp.level;
                minLevel = Math.min(minLevel, lvl);
                maxLevel = Math.max(maxLevel, lvl);
                if(!map.containsKey(lvl))map.put(lvl,n.data);
                if(n.left!=null)q.add(new Pair(n.left,lvl-1));
                   if(n.right!=null)q.add(new Pair(n.left,lvl+1));
            }
            for(int i =minLevel;i<=maxLevel;i++){
                System.out.println(map.get(i)+ " ");
            }



    }
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
               \   /
                4 5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);

        topView(root);
    }
}
