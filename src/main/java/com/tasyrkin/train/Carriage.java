package com.tasyrkin.train;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Carriage {

    private final Coupling frontCoupling;
    private final Coupling backCoupling;
    private final List<WheelPair> wheelPairs;
    private final CarriageShape shape;

    public Carriage(Coupling frontCoupling, Coupling backCoupling, List<WheelPair> wheelPairs, CarriageShape shape) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
        this.wheelPairs = ImmutableList.copyOf(wheelPairs);
        this.shape = shape;
    }

    public Coupling getFrontCoupling() {
        return frontCoupling;
    }

    public Coupling getBackCoupling() {
        return backCoupling;
    }

    public List<WheelPair> getWheelPairs() {
        return wheelPairs;
    }

    public CarriageShape getShape() {
        return shape;
    }
}
