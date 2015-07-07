package com.tasyrkin.train;

import com.google.common.collect.Lists;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static com.tasyrkin.train.CarriageMarking.CIRCLE;
import static com.tasyrkin.train.CarriageShape.RECTANGLE;
import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class CarriageMarkingTest {

    @Test
    public void carriageHasMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CIRCLE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
    }
}
