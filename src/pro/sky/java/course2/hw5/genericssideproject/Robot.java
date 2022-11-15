package pro.sky.java.course2.hw5.genericssideproject;

public class Robot <T extends Head>{

    private Body body;
    private T head;

    public <P1, P2> double headSize(double a, double b) {
        return a * b;
    }

    public void foo(Robot<?> obj) {
        System.out.println(obj);
    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return getHead() + ", " + getBody() + ", " + getClass();
    }
}
