package com.solid.lsp;

public class Square extends Shape {

    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
            return this.side * this.side;
    }
}
