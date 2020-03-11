package FactoryMethodPattern.factory;

import FactoryMethodPattern.models.Bycicle;

public class BycicleFactory {

    public static Bycicle buildBycicle() {
        return new Bycicle();
    }
}
