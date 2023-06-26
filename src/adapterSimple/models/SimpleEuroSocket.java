package adapterSimple.models;

import adapterSimple.impl.EuroSocket;

public class SimpleEuroSocket implements EuroSocket {
    @Override
    public void getPower() {
        System.out.println("220 - 240W");
    }
}
