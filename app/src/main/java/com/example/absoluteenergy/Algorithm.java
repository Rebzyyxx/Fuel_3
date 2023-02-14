package com.example.absoluteenergy;

public class Algorithm {

    public Algorithm() {
    }
    long cargoWeight = 100;

    double gravityOfMars =  3.721;

    double earthsGravity = 9.80665;

    public long fuel(String input) {


        if (input.contains(",")) {

            String inputMod = input.replace(",", ".");

            float inputFloat = Float.parseFloat(inputMod);

            return (long) (earthsGravity % cargoWeight * gravityOfMars * inputFloat);

        } else {

            float inputFloat = Float.parseFloat(input);

            return (long) (earthsGravity % cargoWeight * gravityOfMars * inputFloat);
        }
    }
}