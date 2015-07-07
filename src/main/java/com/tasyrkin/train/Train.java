package com.tasyrkin.train;

import com.google.common.collect.ImmutableList;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

public class Train {

    private final Locomotive locomotive;
    private final Carriage[] carriages;

    public Train(Locomotive locomotive, Carriage... carriages){

        validateCouplingsOrFail(locomotive, carriages);

        this.locomotive = locomotive;
        this.carriages = new Carriage[carriages.length];
        System.arraycopy(carriages, 0, this.carriages, 0, carriages.length);
    }

    private void validateCouplingsOrFail(Locomotive locomotive, Carriage[] carriages) {
        if(carriages == null || carriages.length == 0){
            return;
        }
        checkArgument(locomotive.getBackCoupling() == carriages[0].getFrontCoupling(),
                "Locomotive coupling [%s] is not compatible with first carriage's coupling [%s]",
                locomotive.getBackCoupling(), carriages[0].getFrontCoupling());

        for(int i = 1; i < carriages.length; i++){
            checkArgument(carriages[i-1].getBackCoupling() == carriages[i].getFrontCoupling(),
                    "Carriage [%s] back coupling [%s] is not compatible with carriage front coupling [%s]",
                    i-1, carriages[i-1].getBackCoupling(), carriages[i].getFrontCoupling());

        }
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public List<Carriage> getCarriages() {
        return ImmutableList.copyOf(carriages);
    }
}
