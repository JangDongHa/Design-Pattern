package observer.example;

public class UpdateAction implements Action, Listener{
    private Button button;
    public UpdateAction(Button button){
        this.button = button;
        button.addListener(this);
    }
    @Override
    public void action() {
        System.out.println("Click update button!");
        button.data.setClickedUpdate(false);
    }

    @Override
    public void update() {
        if (button.data.isClickedUpdate())
            action();
    }
}
