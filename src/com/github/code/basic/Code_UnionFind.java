package com.github.code.basic;

import java.util.HashMap;
import java.util.List;

/**
 * @Title: Code_UnionFind
 * @Description: 并查集
 * (1)isSameSet(A,B)
 * (2)union(A,B)
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/14 13:33
 */
public class Code_UnionFind {

    public static class Node {
        // whatever you like
    }

    public static class UnionFindSet {
        public HashMap<Node, Node> fatherMap; // key: child, value: father
        public HashMap<Node, Integer> sizeMap;

        public UnionFindSet() {
            fatherMap = new HashMap<Node, Node>();
            sizeMap = new HashMap<Node, Integer>();
        }

        public void makeSets(List<Node> nodes) {
            fatherMap.clear();
            sizeMap.clear();
            for (Node node : nodes) {
                fatherMap.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        private Node findHead(Node node) {
            // 递归找到代表节点，且进行扁平化操作
            Node father = fatherMap.get(node);
            if (father != node) {
                father = findHead(father);
            }
            fatherMap.put(node, father);
            return father;
        }

        public boolean isSameSet(Node a, Node b) {
            return findHead(a) == findHead(b);
        }

        public void union(Node a, Node b) {
            if (a == null || b == null) {
                return;
            }
            Node aHead = findHead(a);
            Node bHead = findHead(b);
            if (aHead != bHead) {
                int aSetSize= sizeMap.get(aHead);
                int bSetSize = sizeMap.get(bHead);
                if (aSetSize <= bSetSize) {
                    fatherMap.put(aHead, bHead);
                    sizeMap.put(bHead, aSetSize + bSetSize);
                } else {
                    fatherMap.put(bHead, aHead);
                    sizeMap.put(aHead, aSetSize + bSetSize);
                }
            }
        }

    }
}
