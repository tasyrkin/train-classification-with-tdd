package com.tasyrkin.train;

import org.junit.Test;

import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CarriageToppingTest {

    @Test
    public void carriageHasTopping(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .topping(CarriageTopping.NORMAL)
                .build();

        assertThat(carriage.getTopping().isPresent(), is(true));
    }

    @Test
    public void carriageHasNoTopping(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .build();

        assertThat(carriage.getTopping().isPresent(), is(false));
    }

    @Test
    public void carriageHasSawTopping(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .topping(CarriageTopping.SAW)
                .build();

        assertThat(carriage.getTopping().get(), is(CarriageTopping.SAW));
    }

    @Test
    public void carriageHasHomeTopping(){

        final Carriage carriage = new CarriageBuilder()
                .couplings(Coupling.HARD)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .wheelPair(WHITE_SMALL_WHEEL_PAIR)
                .shape(CarriageShape.RECTANGLE_SMALL)
                .topping(CarriageTopping.HOME)
                .build();

        assertThat(carriage.getTopping().get(), is(CarriageTopping.HOME));
    }
}
