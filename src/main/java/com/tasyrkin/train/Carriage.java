package com.tasyrkin.train;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

public class Carriage {

    private final Coupling frontCoupling;
    private final Coupling backCoupling;
    private final List<WheelPair> wheelPairs;
    private final CarriageShape shape;
    private final Optional<CarriageTopping> topping;
    private final List<CarriageMarking> markings;
    private final CarriageLoading loading;
    private final boolean hasInternalEnclosure;

    public Carriage(Coupling frontCoupling,
                    Coupling backCoupling,
                    List<WheelPair> wheelPairs,
                    CarriageShape carriageShape) {
        this(
                frontCoupling,
                backCoupling,
                wheelPairs,
                carriageShape,
                Lists.<CarriageMarking>newArrayList(),
                CarriageLoading.EMPTY,
                Optional.<CarriageTopping>absent(),
                false
        );
    }

    public Carriage(Coupling frontCoupling,
                    Coupling backCoupling,
                    List<WheelPair> wheelPairs,
                    CarriageShape carriageShape,
                    List<CarriageMarking> carriageMarkings,
                    CarriageLoading carriageLoading,
                    Optional<CarriageTopping> carriageTopping,
                    boolean hasInternalEnclosure) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
        this.wheelPairs = ImmutableList.copyOf(wheelPairs);
        this.shape = carriageShape;
        this.markings = ImmutableList.copyOf(carriageMarkings);
        this.loading = carriageLoading;
        this.topping = carriageTopping;
        this.hasInternalEnclosure = hasInternalEnclosure;
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

    public List<CarriageMarking> getMarkings() {
        return markings;
    }

    public CarriageLoading getLoading() {
        return loading;
    }

    public boolean hasInternalEnclosure() {
        return hasInternalEnclosure;
    }
}
