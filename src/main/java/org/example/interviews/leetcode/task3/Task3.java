package org.example.interviews.leetcode.task3;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String seq = "ABBBCDDDBB";
        System.out.println(compress(seq));//A3BC3D2B
        LinkNode links = new LinkNode(new LinkNode(new LinkNode(new LinkNode(new LinkNode(new LinkNode(null))))));
        System.out.println(links.size());
    }

    public static String compress(String seq) {
        String result = "";
        char charSeq = seq.charAt(0);
        int counterChar = 1;
        for (int i = 1; i < seq.length(); i++) {
            if (charSeq == seq.charAt(i)) {
                counterChar++;
            } else {
                if (counterChar != 1) {
                    result = result + counterChar + charSeq;
                } else {
                    result = result + charSeq;
                }
                counterChar = 1;
                charSeq = seq.charAt(i);
            }
        }

        if (counterChar != 1) {
            result = result + counterChar + charSeq;
        } else {
            result = result + charSeq;
        }

        return result;
    }
}

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