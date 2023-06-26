package adapterSimple;

import adapterSimple.adapter.SocketAdapter;
import adapterSimple.impl.AmericanSocket;
import adapterSimple.models.Radio;
import adapterSimple.models.SimpleAmericanSocket;

public class Main {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        SocketAdapter socketAdapter = new SocketAdapter(americanSocket);
        Radio radio = new Radio(socketAdapter);
        radio.switchOn();
    }
}

