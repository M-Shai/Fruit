package visitor;

import com.abc.fruit.*;

public interface Visitor {
    public void visit(Produce item);
    public void visit(Fruit fruit);
    public void visit(Vegetable veg);
}
