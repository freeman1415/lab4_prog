import Characters.*;
import Enums.TimeOfDay;
import Exception.*;
import Place.Park;

public class Main {
    public static void main(String[] args) {
        try{
            Malyish malyish = new Malyish("Малыш");
            Human Krister = new Human("Кристер");
            Human Gunilla = new Human("Гунилла");


            Bimbo bimbo = new Bimbo("Бимбо");
            Dogs dog = new Dogs("собака");
            Dogs beatyDog = new Dogs("красивая собака");
            beatyDog.setBeaty(true);

            Human karlson = new Human("Карлсон");

            Park park = new Park("парк",10);
            Park.Bench bench = new Park.Bench();
            park.addEssence(bimbo);
            park.addEssence(malyish);
            park.addEssence(beatyDog);

            System.out.println(TimeOfDay.MORNING);
            malyish.walk(park);
            bimbo.walk(park);
            bimbo.searchInPlace(park);


            dog.property("какая-то большая");
            Krister.setNearMalyish(false);
            Gunilla.setNearMalyish(false);
            bimbo.setNearMalyish(true);
            karlson.setNearMalyish(true);

            malyish.search(Krister);
            malyish.search(Gunilla);

            malyish.think("Может быть, они уже уехали на каникулы");

            malyish.care(bimbo, karlson);

            dog.runTo(bimbo, " напасть на него ");

            bimbo.react(dog, "чтобы показать этой глупой псине, что он о ней думает");

            System.out.print("но ");
            malyish.stop(bimbo);

            malyish.command(bimbo,"Назад!");
            malyish.say("Ты еще мал чтобы мериться с таким теленком");
            malyish.searchBench();
            bench.sit(malyish);
            bench.sit(bimbo);
        }catch (PlaceOverflowException e){
            System.out.println("Ошибка -"+e.getMessage());
        }
    }
}