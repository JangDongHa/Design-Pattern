package singleton;

// 멀티 쓰레드 환경 내 인스턴스 동기화 방법 2
public class SyncChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static SyncChocolateBoiler chocolateBoiler;

    private SyncChocolateBoiler(){
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

    public static synchronized SyncChocolateBoiler getInstance(){
        if (chocolateBoiler == null){
            chocolateBoiler = new SyncChocolateBoiler();
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
