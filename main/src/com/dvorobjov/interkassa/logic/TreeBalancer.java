package com.dvorobjov.interkassa.logic;

import com.dvorobjov.interkassa.domain.Leaf;
import com.dvorobjov.interkassa.domain.Node;

import java.util.List;

public class TreeBalancer {

    public Node balanceTree(Node rootNode) {
        return null;
    }

    boolean isLastNode(Node node) {
        return node.getChildNodes() != null && node.getChildNodes().size() > 0;
    }

    List<Leaf> sort(List<Leaf> leafList) {
        
    }
}
