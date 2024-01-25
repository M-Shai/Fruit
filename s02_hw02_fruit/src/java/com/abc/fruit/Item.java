package com.abc.fruit;

import work.*;

public abstract class Item {

    protected abstract void accepts(Identify visitor);

    protected abstract void runWork();
}
