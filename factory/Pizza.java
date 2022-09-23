package factory;

public abstract class Pizza {
    String name;

    void prepare(){
        System.out.println(name + " 피자");
    }

    void bake(){
        System.out.println("피자 만들기");
    }

    void cook(){
        System.out.println("피자 요리하기");
    }

    void cut(){
        System.out.println("피자 자르기");
    }

    void box(){
        System.out.println("피자 박싱");
    }
}
