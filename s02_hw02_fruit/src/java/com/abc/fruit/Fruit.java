package com.abc.fruit;

import handling.*;

/**
 * Class Fruit
 * Self running class
 * Prints what it is N times
 */
public class Fruit extends Produce{

    /**
     * Starts the internalThread
     */
    public Fruit(String name, Handling visitor) {
        super(name, visitor);
        super.startThread();
    }

}
