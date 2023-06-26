package adapterSimple.adapter;

import adapterSimple.impl.AmericanSocket;
import adapterSimple.impl.EuroSocket;

public class SocketAdapter implements EuroSocket{
    AmericanSocket as;

    public SocketAdapter(AmericanSocket as) {
        this.as = as;
    }

    @Override
    public void getPower() {
        as.getPower();
    }
}
