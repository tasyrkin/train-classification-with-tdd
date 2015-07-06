package com.tasyrkin.train;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class TrainTest {

    @Test
    public void trainHasALocomotive(){
        final Train train = new Train(new Locomotive(Coupling.HARD));

        assertThat(train.getLocomotive(), is(notNullValue()));
    }

    @Test
    public void trainHasCarriages(){
        final Train train = new Train(new Locomotive(Coupling.HARD), new Carriage(Coupling.HARD, Coupling.SOFT));

        assertThat(train.getCarriages(), is(notNullValue()));
    }

    @Test
    public void trainHasTreeCarriages(){
        final Train train = new Train(
                new Locomotive(Coupling.SOFT),
                new Carriage(Coupling.SOFT, Coupling.HARD),
                new Carriage(Coupling.HARD, Coupling.SOFT),
                new Carriage(Coupling.SOFT,Coupling.SOFT));

        assertThat(train.getCarriages().size(), is(3));
    }

    @Test
    public void locomotiveAndFirstCarriageHaveHardCoupling(){
        final Train train = new Train(new Locomotive(Coupling.HARD), new Carriage(Coupling.HARD, Coupling.SOFT));

        assertThat(train.getLocomotive().getBackCoupling(), is(Coupling.HARD));
        assertThat(train.getCarriages().get(0).getFrontCoupling(), is(Coupling.HARD));
    }

}
