package org.example.interviews.leetcode.task4;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
class LinkNode implements Cloneable {

    private int id;
    private String name;
    LinkNode nextLink;

    public LinkNode(LinkNode nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public String toString() {
        if (Objects.isNull(nextLink)) {
            return name + "| nextLink is null!!!";
        } else {
            return name + "|" + nextLink;
        }
    }

    public int size() {
        if (Objects.isNull(nextLink)) {
            return 1;
        }
        return nextLink.size() + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkNode other = (LinkNode) obj;
        return id == other.id && Objects.equals(this.name, other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LinkNode clonedObject = (LinkNode) super.clone();

        // Здесь можно выполнить копирование всех полей, которые требуют копирования
        // Например:
        // clonedObject.field1 = this.field1;
        // clonedObject.field2 = this.field2;

        return clonedObject;
    }
}
