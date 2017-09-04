package com.dvorobjov.interkassa.domain;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<Node> childNodes;
    //TODO migrate to one-directional list
    private LinkedList<Leaf> leafs;

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public LinkedList<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(LinkedList<Leaf> leafs) {
        this.leafs = leafs;
    }
}
