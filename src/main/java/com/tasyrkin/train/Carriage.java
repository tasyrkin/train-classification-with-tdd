package com.tasyrkin.train;

public class Carriage {

    private final Coupling frontCoupling;
    private final Coupling backCoupling;

    public Carriage(Coupling frontCoupling, Coupling backCoupling) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
    }

    public Coupling getFrontCoupling() {
        return frontCoupling;
    }

    public Coupling getBackCoupling() {
        return backCoupling;
    }
}
