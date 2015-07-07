package com.tasyrkin.train;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CarriageInternalEnclosure {

    @Test
    public void carriageHasInternalEnclosure(){
        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE)
                .hasInternalEnclosure()
                .build();

        assertThat(carriage.hasInternalEnclosure(), is(true));
    }

    @Test
    public void carriageHasNoInternalEnclosure(){
        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE)
                .build();

        assertThat(carriage.hasInternalEnclosure(), is(false));
    }

}
