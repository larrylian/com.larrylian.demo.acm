/**
 * Created by Larry 11/09/2017
 */
public class Generic<T> {
    private int id;
    private T data;
    Generic() {
    }

    public Generic(int id, T data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void show() {
        System.out.println(id + data.toString());
    }
}
