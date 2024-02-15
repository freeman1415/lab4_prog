package Characters;
import Interfaces.*;
import Place.Place;

public class Dogs extends Essence implements IRunningTo, IReact, IWalk {
    public Dogs(String name) {
        super(name);
    }
    private boolean isBeaty;

    public boolean isBeaty() {
        return isBeaty;
    }

    public void setBeaty(boolean beaty) {
        isBeaty = beaty;
    }

    @Override
    public void runTo(Essence essTo, String intention) {
        System.out.println("К "+essTo.getName()+" подбежала "+this.getName()+" с намерением "+intention);
    }

    @Override
    public void react(Essence ess, String reason) {
        System.out.println(this.getName()+" хотел было ринуться в бой с "+ess.getName()+" ,"+reason);
    }

    @Override
    public void breath() {
        System.out.println("собака дышит");
    }

    @Override
    public void walk(Place place) {
        System.out.println(this.getName()+ " гуляет по "+place.getName());
    }
}
