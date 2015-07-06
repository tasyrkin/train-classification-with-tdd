package com.tasyrkin.train;

public class Locomotive {

    private final Coupling backCoupling;

    public Locomotive(Coupling backCoupling) {
        this.backCoupling = backCoupling;
    }

    public Coupling getBackCoupling() {
        return backCoupling;
    }
}
