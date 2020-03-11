package BuilderPattern.models;

public class Tires {

    int libs;

    String brand;

    TireType type;

    public Tires(int libs,String brand,String tireType) {
        this.libs = libs;
        this.brand = brand;
        this.type = TireType.valueOf(tireType);
    }

    public int getLibs() {
        return libs;
    }

    public void setLibs(int libs) {
        this.libs = libs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public TireType getType() {
        return type;
    }

    public void setType(TireType type) {
        this.type = type;
    }
}

enum TireType {
    DRY,
    MEDIUM,
    RAIN
}

