package observer.example;

public class ReadAction implements Action, Listener{
    private Button button;
    public ReadAction(Button button){
        this.button = button;
        button.addListener(this);
    }
    @Override
    public void action() {
        System.out.println("Click read button!");
        button.data.setClickedRead(false);
    }

    @Override
    public void update() {
        if (button.data.isClickedRead())
            action();
    }
}
