package singleton;

// 멀티 쓰레드 환경 내 인스턴스 동기화 방법 3
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler chocolateBoiler;

    ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public void fill(){
        if (isEmpty()){
            setEmpty(false);
            setBoiled(false);
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            setBoiled(true);
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            setEmpty(true);
        }
    }

    public static ChocolateBoiler getInstance(){
        if (chocolateBoiler == null){
            synchronized (ChocolateBoiler.class){
                if (chocolateBoiler == null){
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void setEmpty(boolean empty){
        this.empty = empty;
    }

    public void setBoiled(boolean boiled){
        this.boiled = boiled;
    }
}
