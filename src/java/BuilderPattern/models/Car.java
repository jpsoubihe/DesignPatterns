package BuilderPattern.models;

public class Car {

    private Motor motor;
    private Parts parts;
    private Tires tires;

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                ", parts=" + parts +
                ", tires=" + tires +
                '}';
    }

    public Car(Motor motor, Parts parts, Tires tires) {
        this.motor = motor;
        this.parts = parts;
        this.tires = tires;
    }

    public Motor getMotor() {
        return motor;
    }

    public Parts getParts() {
        return parts;
    }

    public Tires getTires() {
        return tires;
    }
}
