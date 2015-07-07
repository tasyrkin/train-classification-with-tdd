import com.tasyrkin.train.*;

import static com.google.common.collect.Lists.newArrayList;
import static com.tasyrkin.train.WheelPair.BLACK_BIG_WHEEL_PAIR;
import static com.tasyrkin.train.WheelPair.BLACK_SMALL_WHEEL_PAIR;

public class Main {
    public static void main(String[] args) {
        final Train a = new Train(
                new Locomotive(Coupling.SOFT, newArrayList(BLACK_SMALL_WHEEL_PAIR, BLACK_BIG_WHEEL_PAIR)),
                new CarriageBuilder()
                        .couplings(Coupling.SOFT)
                        .shape(CarriageShape.RECTANGLE_LARGE)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .marking(CarriageMarking.SQUARE)
                        .marking(CarriageMarking.SQUARE)
                        .marking(CarriageMarking.SQUARE)
                        .loading(CarriageLoading.FULL)
                        .build(),
                new CarriageBuilder()
                        .couplings(Coupling.SOFT)
                        .shape(CarriageShape.RECTANGLE_SMALL)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .marking(CarriageMarking.TRIANGLE_SIDE_DOWN)
                        .loading(CarriageLoading.FULL)
                        .topping(CarriageTopping.HOME)
                        .build(),
                new CarriageBuilder()
                        .couplings(Coupling.SOFT)
                        .shape(CarriageShape.RECTANGLE_LARGE)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .marking(CarriageMarking.HEXAGON)
                        .loading(CarriageLoading.FULL)
                        .build(),
                new CarriageBuilder()
                        .couplings(Coupling.SOFT)
                        .shape(CarriageShape.RECTANGLE_SMALL)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .wheelPair(BLACK_SMALL_WHEEL_PAIR)
                        .marking(CarriageMarking.CIRCLE)
                        .loading(CarriageLoading.FULL)
                        .build()
        );
        System.out.println(String.format("The train a has [%s] carriages", a.getCarriages().size()));
    }
}
