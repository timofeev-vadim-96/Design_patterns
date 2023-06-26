package adapterSimple.models;

import adapterSimple.impl.AmericanSocket;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("100-120W");
    }
}
