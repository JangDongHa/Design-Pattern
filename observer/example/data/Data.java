package observer.example.data;

public class Data {
    boolean isClickedDelete;
    boolean isClickedInsert;
    boolean isClickedUpdate;
    boolean isClickedRead;

    public Data(){
        isClickedDelete = false;
        isClickedInsert = false;
        isClickedRead = false;
        isClickedUpdate = false;
    }

    public boolean isClickedDelete() {
        return isClickedDelete;
    }

    public void setClickedDelete(boolean clickedDelete) {
        isClickedDelete = clickedDelete;
    }

    public boolean isClickedInsert() {
        return isClickedInsert;
    }

    public void setClickedInsert(boolean clickedInsert) {
        isClickedInsert = clickedInsert;
    }

    public boolean isClickedUpdate() {
        return isClickedUpdate;
    }

    public void setClickedUpdate(boolean clickedUpdate) {
        isClickedUpdate = clickedUpdate;
    }

    public boolean isClickedRead() {
        return isClickedRead;
    }

    public void setClickedRead(boolean clickedRead) {
        isClickedRead = clickedRead;
    }
}
