package Characters;

public class Human extends Essence{
    public Human(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println(this.getName()+" дышит по человечески ");
    }

}
