package org.example.interviews.leetcode.task3;

import java.util.Objects;

class LinkNode {
    LinkNode nextLink;
    Object obj;

    public LinkNode(LinkNode nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public String toString() {
        if (Objects.isNull(nextLink)) {
            return obj + "| nextLink is null!!!";
        } else {
            return obj + "|" + nextLink.toString();
        }
    }

    public int size() {
        if (Objects.isNull(nextLink)) {
            return 1;
        }
        return nextLink.size() + 1;
    }
}
