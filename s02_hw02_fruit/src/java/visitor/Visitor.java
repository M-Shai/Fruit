package visitor;

import com.abc.fruit.*;

public interface Visitor {
    public abstract void visit(Produce item);
    public abstract void visit(Fruit fruit);
    public abstract void visit(Vegetable veg);
}
