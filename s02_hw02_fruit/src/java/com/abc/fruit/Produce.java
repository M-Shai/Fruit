package com.abc.fruit;

import java.util.*;

import work.*;

public class Produce extends Item {

    private Thread internalThread;
    private final int MAX = 25;
    private String name;
    private Identify visitor;
    private String pre;
    private boolean is_vowel;
    private Random rand;

    public Produce(String name, Identify visitor){
        System.out.println("Inside " + name + "'s constructor");
        this.name = name;
        this.visitor = visitor;
        rand = new Random();
        is_vowel = isVowel(name);
        internalThread = new Thread(this::runWork);
        internalThread.start();
    }

    @Override
    protected void runWork() {
        for(int index = 0; index < MAX; index++) {
            try {
                setPre(index);
                accepts(visitor);
                Thread.sleep((index + 1) * (rand.nextInt(10) + 1));
            }
            catch (Exception e) {
               // ignore and let thread die
            }
        }
    }
    @SuppressWarnings("hiding")
    @Override
    public void accepts(Identify visitor) {
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
}
