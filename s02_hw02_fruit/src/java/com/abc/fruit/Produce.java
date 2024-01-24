package com.abc.fruit;

import java.util.*;

import handling.*;

public class Produce extends Item implements Runnable {

    private Thread internalThread;
    private final int MAX = 20;
    private String name;
    private Handling visitor;
    private String pre;
    private boolean is_vowel;
    private Random rand;

    public Produce(String name, Handling visitor){
        System.out.println("Inside " + name + "'s constructor");
        this.name = name;
        this.visitor = visitor;
        rand = new Random();
        is_vowel = isVowel(name);
        internalThread = new Thread(this);
    }

    @Override
    public void run() {
        for(int index = 0; index < MAX; index++) {
            try {
                setPre(index);
                accepts(visitor);
                Thread.sleep((index + 1) * (rand.nextInt(100) + 1));
            }
            catch (Exception e) {
                System.out.println("Exception inside " + name + " thread!");
                e.printStackTrace();
            }
        }
    }
    @SuppressWarnings("hiding")
    @Override
    public void accepts(Handling visitor) {
        visitor.visit(this);
    }

    /**
     * Check to see if a string starts with a vowel.
     * Used for print statement decision.
     * @param String name
     * @return boolean
     */
    private boolean isVowel(String nme) {
        char ch = nme.toUpperCase().charAt(0);

        switch(ch) {
            case 'A':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            case 'Y':
                return true;
            default:
                return false;
        }
    }

    /**
     * set pre
     */
    private void setPre(int i) {

        if(is_vowel) {
            pre = (i + 1) + ": I am an ";
        }
        else {
            pre = (i + 1) + ": I am a ";
        }
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getName() {
        return name;
    }

    /**
     * getInternalThread()
     */
    public void startThread() {
        internalThread.start();
    }
}
