package com.tasyrkin.train;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

public class CarriageBuilder {

    private Coupling frontCoupling;
    private Coupling backCoupling;
    private List<WheelPair> wheelPairs = Lists.newArrayList();
    private CarriageShape shape;
    private CarriageTopping topping;
    private List<CarriageMarking> markings = Lists.newArrayList();
    private CarriageLoading loading = CarriageLoading.EMPTY;
    private boolean hasInternalEnclosure = false;


    public CarriageBuilder() {
    }

    public CarriageBuilder(Coupling frontCoupling, Coupling backCoupling, List<WheelPair> wheelPairs, CarriageShape shape) {
        this.frontCoupling = frontCoupling;
        this.backCoupling = backCoupling;
        this.wheelPairs = wheelPairs;
        this.shape = shape;
    }

    public CarriageBuilder couplings(Coupling couplings){
        frontCoupling = couplings;
        backCoupling = couplings;
        return this;
    }

    public CarriageBuilder frontCoupling(Coupling coupling){
        frontCoupling = coupling;
        return this;
    }

    public CarriageBuilder backCoupling(Coupling coupling){
        backCoupling = coupling;
        return this;
    }

    public CarriageBuilder wheelPair(WheelPair wheelPair){
        wheelPairs.add(wheelPair);
        return this;
    }

    public CarriageBuilder shape(CarriageShape shape){
        this.shape = shape;
        return this;
    }

    public CarriageBuilder topping(CarriageTopping topping){
        this.topping = topping;
        return this;
    }

    public CarriageBuilder marking(CarriageMarking marking){
        this.markings.add(marking);
        return this;
    }

    public CarriageBuilder loading(CarriageLoading loading){
        this.loading = loading;
        return this;
    }

    public CarriageBuilder hasInternalEnclosure(){
        this.hasInternalEnclosure = true;
        return this;
    }

    public Carriage build(){

        Preconditions.checkNotNull(frontCoupling, "Missing front coupling");
        Preconditions.checkNotNull(backCoupling, "Missing back coupling");
        Preconditions.checkNotNull(wheelPairs, "Missing wheel pairs");
        Preconditions.checkNotNull(wheelPairs.size()>=2, "Expecting at least 2 wheel pairs");
        Preconditions.checkNotNull(shape, "Missing shape");

        return new Carriage(
                frontCoupling,
                backCoupling,
                wheelPairs,
                shape,
                markings,
                loading,
                Optional.fromNullable(topping),
                hasInternalEnclosure
        );
    }
}
