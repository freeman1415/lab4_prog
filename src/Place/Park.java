package Place;

import Characters.Essence;
import Exception.PlaceOverflowException;

public class Park extends Place{
    public Park(String name, int numberOfPlaces) {
        super(name, numberOfPlaces);
    }
    public static class Bench{
        private int countOfPlaces = 2;
        private int countEssence = 0;
        public Bench() {
            System.out.println("Появилась скамейка в парке");
        }
        public void sit(Essence ess) throws PlaceOverflowException{
            countEssence++;
            if(countEssence>countOfPlaces){
                countEssence--;
                throw new PlaceOverflowException("Нету больше мест на скамейке");
            }
        }
    }
}
