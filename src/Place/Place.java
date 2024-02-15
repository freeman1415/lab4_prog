package Place;

import Characters.Essence;
import Exception.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Place {
    private ArrayList<Essence> VisitorsArray;
    private int numberOfPlaces;
    private String name;

    public Place(String name, int numberOfPlaces) {
        this.VisitorsArray = new ArrayList<Essence>();
        this.numberOfPlaces = numberOfPlaces;
        this.name = name;
    }

    public void addEssence(Essence ess) throws PlaceOverflowException {
        if (this.VisitorsArray.size() + 1 > this.numberOfPlaces) {
            throw new PlaceOverflowException(this.name + ": место переполнено нельзя больше добавлять");
        } else {
            this.VisitorsArray.add(ess);
        }
    }

    public void removeEssence(Essence ess){
        this.VisitorsArray.remove(ess);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Essence> getInfEssences() {
        return this.VisitorsArray;
    }
    public boolean EssIsHere(Essence ess){
        return this.VisitorsArray.contains(ess);
    }

}
