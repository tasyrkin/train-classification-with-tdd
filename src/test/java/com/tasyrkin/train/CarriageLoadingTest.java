package com.tasyrkin.train;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CarriageLoadingTest {

    @Test
    public void carriageFullyLoaded(){
        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .loading(CarriageLoading.FULL)
                .build();

        MatcherAssert.assertThat(carriage.getLoading(), Matchers.is(CarriageLoading.FULL));
    }

    @Test
    public void carriageNotLoaded(){
        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .build();

        MatcherAssert.assertThat(carriage.getLoading(), Matchers.is(CarriageLoading.EMPTY));
    }

    @Test
    public void carriageHalfLoaded(){
        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WheelPair.WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .loading(CarriageLoading.HALF)
                .build();

        MatcherAssert.assertThat(carriage.getLoading(), Matchers.is(CarriageLoading.HALF));
    }
}
