package com.tasyrkin.train;

public class CarriageLoading {
    public static final CarriageLoading FULL = new CarriageLoading(100);
    public static final CarriageLoading HALF = new CarriageLoading(50);
    public static final CarriageLoading EMPTY = new CarriageLoading(0);

    private final int filledPercentage;

    public CarriageLoading(int filledPercentage) {
        this.filledPercentage = filledPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarriageLoading that = (CarriageLoading) o;

        return filledPercentage == that.filledPercentage;

    }

    @Override
    public int hashCode() {
        return filledPercentage;
    }

    @Override
    public String toString() {
        return "CarriageLoading{" +
                "filledPercentage=" + filledPercentage +
                '}';
    }
}
