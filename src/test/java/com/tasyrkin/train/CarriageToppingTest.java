package com.tasyrkin.train;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CarriageToppingTest {

    @Test
    public void carriageHasTopping(){

        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR,WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE,
                Optional.of(CarriageTopping.NORMAL)
        );

        assertThat(carriage.getTopping().isPresent(), is(true));
    }

    @Test
    public void carriageHasNoTopping(){

        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR,WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE
        );

        assertThat(carriage.getTopping().isPresent(), is(false));
    }

    @Test
    public void carriageHasSawTopping(){

        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR,WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE,
                Optional.of(CarriageTopping.SAW)
        );

        assertThat(carriage.getTopping().get(), is(CarriageTopping.SAW));
    }

    @Test
    public void carriageHasHomeTopping(){

        final Carriage carriage = new Carriage(
                Coupling.HARD,
                Coupling.HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR,WHITE_SMALL_WHEEL_PAIR),
                CarriageShape.RECTANGLE,
                Optional.of(CarriageTopping.HOME)
        );

        assertThat(carriage.getTopping().get(), is(CarriageTopping.HOME));
    }
}
