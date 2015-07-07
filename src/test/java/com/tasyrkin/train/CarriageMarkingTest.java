package com.tasyrkin.train;

import org.junit.Test;

import static com.tasyrkin.train.CarriageMarking.*;
import static com.tasyrkin.train.CarriageShape.RECTANGLE;
import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
        assertThat(carriage.getMarkings(), containsInAnyOrder(CIRCLE));
    }

    @Test
    public void carriageHasMultipleMarkingCircles(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CIRCLE)
                .marking(CIRCLE)
                .marking(CIRCLE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(CIRCLE, CIRCLE, CIRCLE));
    }

    @Test
    public void carriageHasASquareAsMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(SQUARE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(SQUARE));
    }

    @Test
    public void carriageHasMultipleMarkingSquares(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(SQUARE)
                .marking(SQUARE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(SQUARE, SQUARE));
    }

    @Test
    public void carriageHasARectangleAsMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CarriageMarking.RECTANGLE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(CarriageMarking.RECTANGLE));
    }

    @Test
    public void carriageHasAHexagonAsMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CarriageMarking.HEXAGON)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(CarriageMarking.HEXAGON));
    }

    @Test
    public void carriageHasADiamondAsMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CarriageMarking.DIAMOND)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings(), contains(CarriageMarking.DIAMOND));
    }

    @Test
    public void carriageHasNoMarking(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .build();

        assertThat(carriage.getMarkings(), is(notNullValue()));
        assertThat(carriage.getMarkings().size(), is(0));
    }

    @Test
    public void carriageHasMarkingAsTriangleSideUp(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CarriageMarking.TRIANGLE_SIDE_UP)
                .build();

        assertThat(carriage.getMarkings().get(0), is(TRIANGLE_SIDE_UP));
    }

    @Test
    public void carriageHasMarkingAsTriangleSideDown(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(RECTANGLE)
                .marking(CarriageMarking.TRIANGLE_SIDE_DOWN)
                .build();

        assertThat(carriage.getMarkings().get(0), is(TRIANGLE_SIDE_DOWN));
    }
}
