package Characters;

import Interfaces.ISearchInPlace;
import Place.Place;

public class Bimbo extends Dogs implements ISearchInPlace {
    public Bimbo(String name) {
        super(name);
    }
    private boolean IsHappy;
    @Override
    public void searchInPlace( Place place) {
        for(Essence ess: place.getInfEssences()){
            if (ess instanceof Dogs && ((Dogs) ess).isBeaty()){
                this.IsHappy=true;
                System.out.println("Бимбо счастлив что нащел симпатичную собаку");
                break;
            }
        }
        if (this.IsHappy == false){
            System.out.println("Бимбо не счастлив, что не нашел симпатинчую собаку");
        }
    }
}
