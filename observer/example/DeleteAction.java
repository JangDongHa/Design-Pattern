package observer.example;

public class DeleteAction implements Listener, Action{
    private Button button;
    public DeleteAction(Button button){
        this.button = button;
        button.addListener(this);
    }
    @Override
    public void update() { // 이벤트 수신
        if (button.data.isClickedDelete()){
            action(); // 그에 따른 처리
        }
    }

    @Override
    public void action() {
        System.out.println("Click delete button!");
        button.data.setClickedDelete(false);
    }
}
