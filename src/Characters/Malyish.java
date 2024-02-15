package Characters;

import Interfaces.*;
import Place.Place;

public class Malyish extends Human implements IThink, ISearch, ICare, IStop, ICommand, ISay, ISearchBench,IWalk {
    public Malyish(String name) {
        super(name);
    }
    @Override
    public void think(String idea) {
        System.out.println("'"+idea+"'"+", -- подумал "+this.getName());
    }

    @Override
    public void search(Essence ess) {
        if (ess.isNearMalyish()==false){
            System.out.println(this.getName()+" не смог найти сегодня "+ess.getName());
        }
        else if (ess.isNearMalyish()){
            System.out.println(this.getName()+" нашел "+ess.getName());
        }
    }

    @Override
    public void care(Essence bimbo,Essence karlson) {
        if (bimbo instanceof Dogs && bimbo.getName()=="Бимбо" && karlson instanceof Human && karlson.getName()=="Карлсон" && karlson.isNearMalyish() && bimbo.isNearMalyish()){
            System.out.println("Ему на это наплевать пока есть Карлсон. Ну и Бимбо конечно");
        }
        else{
            System.out.println("Ему не плевать");
        }
    }

    @Override
    public void stop(Essence ess) {
        System.out.println(this.getName()+" удержал "+ess.getName());
    }
    @Override
    public void command(Essence ess,String command) {
        System.out.println(command+" скомандовал Малыш "+ess.getName());
    }

    @Override
    public void say(String string) {
        System.out.println(string);
    }

    @Override
    public void searchBench() {
        System.out.println("Малыш ищет скамейку");
    }
    @Override
    public void walk(Place place) {
        System.out.println(this.getName()+ " гуляет по "+place.getName());
    }
}
