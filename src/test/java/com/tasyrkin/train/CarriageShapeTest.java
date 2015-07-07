package com.tasyrkin.train;

import com.google.common.collect.Lists;
import org.junit.Test;

import static com.tasyrkin.train.WheelPair.BLACK_SMALL_WHEEL_PAIR;
import static com.tasyrkin.train.WheelPair.WHITE_BIG_WHEEL_PAIR;
import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class CarriageShapeTest {

    @Test
    public void carriageHasAShapeOfRectangle(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE
        );

        assertThat(carriage.getShape(), is(CarriageShape.RECTANGLE));
    }

    @Test
    public void carriageHasAShapeOfRectangleWithLongEdges(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE_WITH_SOFT_CORNERS
        );

        assertThat(carriage.getShape(), is(CarriageShape.RECTANGLE_WITH_SOFT_CORNERS));
    }

    @Test
    public void carriageHasAShapeOfRectangleWithSoftCorner(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE_WITH_SOFT_CORNERS
        );

        assertThat(carriage.getShape(), is(CarriageShape.RECTANGLE_WITH_SOFT_CORNERS));
    }

    @Test
    public void carriageHasAShapeOfTrapezium(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.TRAPEZIUM
        );

        assertThat(carriage.getShape(), is(CarriageShape.TRAPEZIUM));
    }

    @Test
    public void carriageHasAShapeOfOval(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.OVAL
        );

        assertThat(carriage.getShape(), is(CarriageShape.OVAL));
    }
    @Test
    public void carriageHasAShapeOfHexagon(){
        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.HEXAGON
        );

        assertThat(carriage.getShape(), is(CarriageShape.HEXAGON));
    }
}
