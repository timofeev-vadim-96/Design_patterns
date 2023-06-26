package builder;

import builder.item.Characteristic;
import builder.item.impl.Bike;

public class Main {
    public static void main(String[] args) {
        Characteristic characteristic = Characteristic.
                builder().
                brand("Nokia").
                color("Black").
                build();
        Bike bike = new Bike(characteristic);
        bike.getInfo();
    }
}
