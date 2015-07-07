package com.tasyrkin.train;

import com.google.common.collect.Lists;
import org.junit.Test;

import static com.tasyrkin.train.Coupling.HARD;
import static com.tasyrkin.train.WheelPair.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class LocomotiveTest {

    @Test
    public void locomotiveHasWheelPairs(){
        final Locomotive locomotive = new Locomotive(
                HARD,
                Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
        );

        assertThat(locomotive.getWheelPairs(), is(notNullValue()));
        assertThat(locomotive.getWheelPairs().size(), is(2));
    }

    @Test
    public void wheelPairsOfLocomotiveAreOfBlackColor(){
        final Locomotive locomotive = new Locomotive(
                HARD,
                Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
        );
        assertThat(locomotive.getWheelPairs().get(0).getColor(), is(WheelColor.BLACK));
    }

    @Test
    public void wheelPairsOfLocomotiveAreOfBlackAndWhiteColor(){
        final Locomotive locomotive = new Locomotive(
                HARD,
                Lists.newArrayList(WHITE_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
        );
        assertThat(locomotive.getWheelPairs().get(0).getColor(), is(WheelColor.WHITE));
        assertThat(locomotive.getWheelPairs().get(1).getColor(), is(WheelColor.BLACK));
    }

    @Test
    public void wheelPairsOfLocomotiveAreOfBigAndSmallSize(){
        final Locomotive locomotive = new Locomotive(
                HARD,
                Lists.newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)
        );

        assertThat(locomotive.getWheelPairs().get(0).getSize(), is(WheelSize.SMALL));
        assertThat(locomotive.getWheelPairs().get(1).getSize(), is(WheelSize.BIG));
    }
}
