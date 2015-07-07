package com.tasyrkin.train;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Carriage {

    private final Coupling frontCoupling;
    private final Coupling backCoupling;
    private final List<WheelPair> wheelPairs;

    public Carriage(Coupling frontCoupling, Coupling backCoupling, List<WheelPair> wheelPairs) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
        this.wheelPairs = ImmutableList.copyOf(wheelPairs);
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
}
