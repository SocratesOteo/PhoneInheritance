
package phones;

import java.util.concurrent.ThreadLocalRandom;

public class TestClient {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone(
                "Model 500",
                new Dimension(143, 208, 119),
                Voltage.V110
        );

        PushButtonPhone pushButtonPhone = new PushButtonPhone(
                "Cortelco 2500",
                new Dimension(178, 228, 127),
                Voltage.DUAL
        );

        smartPhone pixel3 = new smartPhone(
                "Pixel3",
                new Dimension(145.6, 68.2, 7.9),
                128
        );

        smartPhone iPhone8 = new smartPhone(
                "iPhone8",
                new Dimension(138.4, 67.3, 7.3),
                64
        );

        System.out.println("Various Phones:");
        System.out.println(rotaryPhone);
        System.out.println(pushButtonPhone);
        System.out.println(pixel3);
        System.out.println(iPhone8);
        System.out.println();

        rotaryPhone.plugIn();
        pushButtonPhone.plugIn();

        // Randomly unplug one of the two desk phones.
        if (ThreadLocalRandom.current().nextBoolean()) {
            rotaryPhone.unplug();
        } else {
            pushButtonPhone.unplug();
        }

        Phone[] phones = {
                rotaryPhone,
                pushButtonPhone,
                pixel3,
                iPhone8
        };

        System.out.println("Array Elements:");
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println(phone.call(8019574111L));

            if (phone instanceof smartPhone) {
                smartPhone smartPhone = (smartPhone) phone;
                System.out.println(smartPhone.browse());
                System.out.println(smartPhone.takePicture());
            }

            System.out.println();
        }
    }
}
