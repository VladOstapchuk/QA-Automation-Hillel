package org.HomeWorksQAAutomationJava.HomeWork10_Enum;

public class TicketMachine {

    //final field because each ticket purchase request is unique
    final String transportType;
    final int transportZone;


    //constructor as a method for selecting the type of transport and the zone
    public TicketMachine(String transportType, int transportZone) {
        this.transportType = transportType;
        this.transportZone = transportZone;
    }


    //take the data of the object and call by it to Enum
    public int calculateFare() {

        TransportType select = TransportType.valueOf(this.transportType.toUpperCase());
        return select.getZone(this.transportZone);

    }


}
