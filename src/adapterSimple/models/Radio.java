package adapterSimple.models;

import adapterSimple.impl.EuroSocket;

public class Radio {
    EuroSocket euroSocket;

    public Radio(EuroSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    public void switchOn(){
        System.out.println("Music");
    }
}
