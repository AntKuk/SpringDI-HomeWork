package com.netcracker.lookup;

public abstract class LuxuryCarShop implements IShop {
    public abstract Car getCar();

    @Override
    public void grazia() {
        System.out.println("LuxuryShop: Сделано в Италии, украдено в Англии!");
        getCar().buzz();
    }
}
