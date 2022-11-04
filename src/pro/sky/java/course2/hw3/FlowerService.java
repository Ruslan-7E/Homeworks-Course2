package pro.sky.java.course2.hw3;

public class FlowerService {

//    private static Flower[] flowers = new Flower[10];

    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];

        Flower rose = new Flower("Роза обыкновенная", null, "The Netherlands", 35.59, 0);
        Flower chrisanteme = new Flower("Chrisanteme", null, null, 15, 5);
        Flower pion = new Flower("Pion", null, "England", 69.9, 1);
        Flower gipsofila = new Flower("Gipsofila", null, "Turkey", 19.5, 10);

        flowers[0] = rose;
        flowers[1] = chrisanteme;

        printFlowerInfo(rose);
        printFlowerInfo(chrisanteme);
        printFlowerInfo(pion);
        printFlowerInfo(gipsofila);

        System.out.println();

        calculateBouquetCost(flowers);
    }

    private static void printFlowerInfo(Flower flower) {
        System.out.println(flower.getName() + ", "
                + flower.getFlowerColor() + ", "
                + flower.getCountry() + ", "
                + flower.getCost() + ", "
                + flower.getLifeSpan());
    }

    private static void calculateBouquetCost(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть:";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += " " + flowers[i].getName() + " " + "из " + flowers[i].getCountry() + "\n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10;
        text += "\n";
        text += "Сумма букета = " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок годности: " + lifeSpan;
        System.out.println(text);
    }
}
