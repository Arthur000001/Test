package org.example.patterns.adapter;

import lombok.Data;

@Data
public class LegacyRectangle {
    public void display(int x1, int y1, int x2, int y2) {
        System.out.println("LegacyRectangle: (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}