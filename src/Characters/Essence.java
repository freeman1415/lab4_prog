package Characters;
import Interfaces.*;
import Enums.*;
public abstract class Essence implements IProperty {
    private String name;
    private boolean IsNearMalyish;

    public boolean isNearMalyish() {
        return IsNearMalyish;
    }

    public void setNearMalyish(boolean nearMalyish) {
        IsNearMalyish = nearMalyish;
    }

    public Essence(String name) {
        this.name = name;
    }

    public abstract void breath();

    public String getName() {
        return name;
    }
    @Override
    public void property(String str) {
        this.name=str+" "+this.getName();
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
