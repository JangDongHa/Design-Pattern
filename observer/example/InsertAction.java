package observer.example;

public class InsertAction implements Action, Listener{
    private Button button;
    public InsertAction(Button button){
        this.button = button;
        button.addListener(this);
    }
    @Override
    public void action() {
        System.out.println("Click insert button!");
        button.data.setClickedInsert(false);
    }

    @Override
    public void update() {
        if (button.data.isClickedInsert())
            action();
    }
}
