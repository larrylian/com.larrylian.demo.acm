/**
 * Created by Larry 11/09/2017
 */
public class Apple extends Fruit {
    private String shape;
    private int id;

    Apple(int id, String name, String shape) {
        super(id, name);
        this.id = 44;
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println(String.format("id: %d name: %s shape: %s",this.id, this.name, this.shape));
        System.out.println(String.format("id: %d name: %s shape: %s",this.getId(), this.name, this.shape));


    }
}
