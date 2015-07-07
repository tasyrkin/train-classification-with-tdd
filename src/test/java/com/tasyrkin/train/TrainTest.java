package com.tasyrkin.train;

import com.google.common.collect.Lists;
import org.junit.Test;

import static com.tasyrkin.train.Coupling.HARD;
import static com.tasyrkin.train.Coupling.SOFT;
import static com.tasyrkin.train.WheelPair.BLACK_BIG_WHEEL_PAIR;
import static com.tasyrkin.train.WheelPair.BLACK_SMALL_WHEEL_PAIR;
import static com.tasyrkin.train.WheelPair.WHITE_SMALL_WHEEL_PAIR;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class TrainTest {

    @Test
    public void trainHasALocomotive(){
        final Train train = new Train(
                new Locomotive(
                        HARD,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                )
        );

        assertThat(train.getLocomotive(), is(notNullValue()));
    }

    @Test
    public void trainHasCarriages(){
        final Train train = new Train(
                new Locomotive(
                        HARD,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                ),
                new Carriage(
                        HARD,
                        SOFT,
                        Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)
                )
        );

        assertThat(train.getCarriages(), is(notNullValue()));
    }

    @Test
    public void trainHasTreeCarriages(){
        final Train train = new Train(
                new Locomotive(
                        SOFT,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                ),
                new Carriage(SOFT, HARD, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)),
                new Carriage(HARD, SOFT, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)),
                new Carriage(SOFT, SOFT, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)));

        assertThat(train.getCarriages().size(), is(3));
    }

    @Test
    public void locomotiveAndFirstCarriageHaveHardCoupling(){
        final Train train = new Train(
                new Locomotive(
                        HARD,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                ),
                new Carriage(HARD, SOFT, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR))
        );

        assertThat(train.getLocomotive().getBackCoupling(), is(HARD));
        assertThat(train.getCarriages().get(0).getFrontCoupling(), is(HARD));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongCouplingBetweenLocomotiveAndCarriage(){
        new Train(
                new Locomotive(
                        SOFT,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                ),
                new Carriage(HARD, HARD, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongCouplingBetweenCarriages(){
        new Train(
                new Locomotive(
                        HARD,
                        Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
                ),
                new Carriage(SOFT, HARD, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR)),
                new Carriage(SOFT, HARD, Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, WHITE_SMALL_WHEEL_PAIR))
        );
    }

}
