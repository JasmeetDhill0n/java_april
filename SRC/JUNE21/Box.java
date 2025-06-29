package JUNE21;

public class Box<T,R> {
    private T name;
    private R price;

    public Box(T name, R price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public R getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setPrice(R price) {
        this.price = price;
    }

}

