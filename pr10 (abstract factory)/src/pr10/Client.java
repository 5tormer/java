package pr10;

public class Client extends ChairFactory {
    public static void main(String[] args) {
        VictorianChair vic = new ChairFactory().createVictorianChair(8);
        vic.sit();
        System.out.println(vic.getAge());
        VictorianChair vic2 = new ChairFactory().createVictorianChair();
        System.out.println(vic2.getAge());

        MagicChair mag = new ChairFactory().createMagicChair();
        mag.sit();
        mag.doMagic();

        FunctionalChair func = new ChairFactory().createFunctionalChair();
        func.sit();
        System.out.println(func.sum(5,8));

    }
}
