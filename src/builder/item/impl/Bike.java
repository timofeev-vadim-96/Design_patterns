package builder.item.impl;

import builder.item.Characteristic;
import builder.item.Item;

public class Bike implements Item {
    private final Characteristic characteristic;

    public Bike(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void getInfo() {
        System.out.printf("%s. Characteristics: \n", this.getClass().getSimpleName());
        this.characteristic.getInfo();
    }
}
