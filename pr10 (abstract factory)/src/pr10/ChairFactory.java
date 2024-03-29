package pr10;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
