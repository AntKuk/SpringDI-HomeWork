package com.netcracker.lookup;

public class UsedCarShop implements IShop {
    private Car usedCar;

    public void setUsedCar(Car usedCar) {
        this.usedCar = usedCar;
    }

    @Override
    public Car getCar() {
        return this.usedCar;
    }

    @Override
    public void grazia() {
        System.out.println("UsedCarShop: Товар без изъяна, товар без обмана, надёжный, как пружина от дивана.");
        usedCar.buzz();
    }
}
