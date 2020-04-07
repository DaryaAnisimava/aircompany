package planes;	//planes

import models.ClassificationLevel;
import models.ExperimentalType;

public class experimentalPlane extends Plane{	//classes should be named in one style: ExperimentalPlane

    private ExperimentalTypes expeperimentalType;	//type
    private ClassificationLevel classificationLevel;

    public experimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }
	
	public ExperimentalType getExperimentalType() {
        return experimentalType;

    }
	
	
    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

     @Override

    public String toString() {
        return super.toString().replace("}",
			", type=" + experimentalType +
				", classification=" + classificationLevel +
				'}');
    }

      @Override

    public boolean equals(Object object) {
		if (this == object) return true;
		if (!(object instanceof ExperimentalPlane)) return false;
		if (!super.equals(object)) return false;
		ExperimentalPlane plane = (ExperimentalPlane) object;
		return experimentalType == plane.experimentalType &&
			classificationLevel == plane.classificationLevel;
	}



    @Override

    public int hashCode() {
		return Objects.hash(super.hashCode(), experimentalType, classificationLevel); }

}

