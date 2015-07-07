package com.tasyrkin.train;

public class WheelPair {
    private final WheelColor color;
    private final WheelSize size;

    public static final WheelPair BLACK_BIG_WHEEL_PAIR = new WheelPair(WheelColor.BLACK, WheelSize.BIG);
    public static final WheelPair WHITE_BIG_WHEEL_PAIR = new WheelPair(WheelColor.WHITE, WheelSize.BIG);
    public static final WheelPair BLACK_SMALL_WHEEL_PAIR = new WheelPair(WheelColor.BLACK, WheelSize.SMALL);
    public static final WheelPair WHITE_SMALL_WHEEL_PAIR = new WheelPair(WheelColor.WHITE, WheelSize.SMALL);

    public WheelPair(WheelColor wheelColor, WheelSize wheelSize) {
        this.color = wheelColor;
        this.size = wheelSize;
    }

    public WheelColor getColor() {
        return color;
    }

    public WheelSize getSize() {
        return size;
    }
}
