package com.dvorobjov.interkassa.logic;

import com.dvorobjov.interkassa.domain.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeBalancerTest {
    TreeBalancer treeBalancer = new TreeBalancer();

    @Test
    public void testIsLastNodeWithChildNodes() throws Exception {
        Node node = new Node();
        List<Node> childNodeList = new ArrayList<Node>();
        childNodeList.add(new Node());
        node.setChildNodes(childNodeList);

        assertTrue(treeBalancer.isLastNode(node));
    }

    @Test
    public void testIsLastNodeWithoutChildNodes() throws Exception {
        assertFalse(treeBalancer.isLastNode(new Node()));
    }

}