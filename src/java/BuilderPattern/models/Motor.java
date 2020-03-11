package BuilderPattern.models;

public class Motor {

    int horsepower;

    int valves;

    String brand;

    public Motor(int horsepower,int valves,String brand) {
        this.horsepower = horsepower;
        this.valves = valves;
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "horsepower=" + horsepower +
                ", valves=" + valves +
                ", brand='" + brand + '\'' +
                '}';
    }
}
