package etc.strategy2;

import etc.strategy2.names.Names;

public abstract class Animal {
    String name;
    Names names;
    public void move(){
        System.out.println(name + names.move());
    }
}
