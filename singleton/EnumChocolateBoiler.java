package singleton;

public enum EnumChocolateBoiler {
    UNIQUE_INSTANCE(true);

    private boolean empty;
    private boolean boiled;

    EnumChocolateBoiler(boolean b){
        this.empty = false;
        this.boiled = false;
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
