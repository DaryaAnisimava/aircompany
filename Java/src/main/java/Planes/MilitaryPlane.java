package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType militaryType;	//the same name

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;	//type
    }

    public MilitaryType getType() {
        return militaryType;	//type
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object object) {	//o
        if (this == object) return true;		//o
        if (!(object instanceof MilitaryPlane)) return false;
        if (!super.equals(object)) return false;	//o
        MilitaryPlane plane = (MilitaryPlane) object;		//o; bad name that
        return militaryType == plane.militaryType;	//militaryType
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);	//militaryType
    }
}
