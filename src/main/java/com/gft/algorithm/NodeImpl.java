package com.gft.algorithm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by azws on 2016-09-22.
 */
public final class NodeImpl implements Node {

    private final List<Node> childrenList;

    public NodeImpl(Node... childrenList) {
        this.childrenList = Arrays.asList(childrenList);
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<Node>() {
            @Override
            public boolean hasNext() {
                return childrenList.iterator().hasNext();
            }

            @Override
            public Node next() {
                return childrenList.iterator().next();
            }
        };
    }
}
