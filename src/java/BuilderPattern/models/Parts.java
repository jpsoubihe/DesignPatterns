package BuilderPattern.models;

public class Parts {

    int weight;

    String name;


    public Parts(String name,int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
