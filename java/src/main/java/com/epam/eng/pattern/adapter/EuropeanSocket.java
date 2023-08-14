package com.epam.eng.pattern.adapter;

public class EuropeanSocket {

    public void plugIn(IEuroPlug euroPlug) {
        euroPlug.supplyPower(230, 50);
    }

    public static void main(String[] args) {
        EuropeanSocket socket = new EuropeanSocket();
        socket.plugIn(new EuroPlug());
        // TODO: Use the AmericanPlug in a European socket
        // TODO: Use the ChinesePlug in a European socket
    }
}
