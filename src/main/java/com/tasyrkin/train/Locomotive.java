package com.tasyrkin.train;

import com.google.common.collect.ImmutableList;

import java.util.LinkedList;
import java.util.List;

public class Locomotive {

    private final Coupling backCoupling;
    private final List<WheelPair> wheelPairs;

    public Locomotive(Coupling backCoupling, List<WheelPair> wheelPairs) {
        this.backCoupling = backCoupling;
        this.wheelPairs = ImmutableList.copyOf(wheelPairs);
    }

    public Coupling getBackCoupling() {
        return backCoupling;
    }

    public List<WheelPair> getWheelPairs() {
        return wheelPairs;
    }
}
