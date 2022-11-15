package pro.sky.java.course2.hw5.genericssideproject;

public class RobotService {
    public static void main(String[] args) {

        Body body = new Body();

        SmallHead sh = new SmallHead();
        MediumHead mh = new MediumHead();
        BigHead bh = new BigHead();
        Leg leg = new Leg();

        Robot<SmallHead> smally = new Robot<SmallHead>(body, sh);
        smally.getHead().burn();

        Robot<BigHead> biggy = new Robot<BigHead>(body, bh);
        biggy.getHead().turn();

        System.out.println(smally.headSize(4, 5));
        Robot<SmallHead> jay = new Robot<>(body, sh);

        biggy.foo(jay);

    }
}
