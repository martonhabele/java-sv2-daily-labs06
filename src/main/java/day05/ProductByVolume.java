package day05;

public class ProductByVolume {
    private Types type;
    private int count;

    public ProductByVolume(Types type) {
        this.type = type;
        this.count = 1;
    }

    public void incrementCount() {
        count++;
    }

    public Types getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}