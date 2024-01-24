package handling;

import com.abc.fruit.*;

import visitor.*;

public class Handling implements Visitor{

    @Override
    public void visit(Fruit fruit) {
        System.out.println(fruit.getPre() + fruit.getName());
    }

    @Override
    public void visit(Vegetable veg) {
        System.out.println(veg.getPre() + veg.getName());
    }

    @Override
    public void visit(Produce item) {
        System.out.println(item.getPre() + item.getName());
    }

}
