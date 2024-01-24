package com.abc.fruit;

import handling.*;

public class Vegetable extends Produce{

    public Vegetable(String name, Handling visitor) {
        super(name, visitor);
        super.startThread();
    }
}
