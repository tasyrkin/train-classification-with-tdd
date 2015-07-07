package com.tasyrkin.train;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class Carriage {

    private final Coupling frontCoupling;
    private final Coupling backCoupling;
    private final List<WheelPair> wheelPairs;
    private final CarriageShape shape;
    private final Optional<CarriageTopping> topping;

    public Carriage(Coupling frontCoupling, Coupling backCoupling, List<WheelPair> wheelPairs, CarriageShape carriageShape) {
        this(frontCoupling, backCoupling, wheelPairs, carriageShape, Optional.<CarriageTopping>absent());
    }

    public Carriage(Coupling frontCoupling, Coupling backCoupling, List<WheelPair> wheelPairs, CarriageShape carriageShape, Optional<CarriageTopping> carriageTopping) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
        this.wheelPairs = ImmutableList.copyOf(wheelPairs);
        this.shape = carriageShape;
        this.topping = carriageTopping;
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

    public Optional<CarriageTopping> getTopping() {
        return topping;
    }
}
