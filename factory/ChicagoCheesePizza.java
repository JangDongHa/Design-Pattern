package factory;

public class ChicagoCheesePizza extends Pizza{

    public ChicagoCheesePizza(){
        name = "시카고 치즈";
    }

    @Override
    public void bake(){
        System.out.println("시카코식 치즈 피자 만들기");
    }

    @Override
    public void cut(){
        System.out.println("시카고식 치즈 피자 자르기");
    }
}
