package observer.example;

import observer.example.data.Data;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        new ReadAction(button);
        new InsertAction(button);
        new UpdateAction(button);
        new DeleteAction(button);

        Data data = new Data();
        data.setClickedDelete(true); // 데이터 변경
        button.clickEvent(data); // 이벤트 발생

        data.setClickedRead(true);
        button.clickEvent(data);
        data.setClickedInsert(true);
        button.clickEvent(data);
        data.setClickedUpdate(true);
        button.clickEvent(data);
    }
}
