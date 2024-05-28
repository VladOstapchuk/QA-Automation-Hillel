package org.HomeWorksQAAutomationJava.HomeWork10_Enum;

public enum TransportType {


    BUS(10, 20, 30),
    SUBWAY(15, 25, 40),
    TRAIN(50, 100, 150);

    private int zone1;
    private int zone2;
    private int zone3;

    private TransportType(int zone1, int zone2, int zone3) {
        this.zone1 = zone1;
        this.zone2 = zone2;
        this.zone3 = zone3;
    }

//one method that returns a value by all Area number
    public int getZone(int zoneNumber){
        switch (zoneNumber){
            case 1 : return zone1;
            case 2 : return zone2;
            case 3 : return zone3;
            //recheck, by default return the most expensive ticket (if the zone is not specified, for example)
            default: return zone3;
                    }

    }

    public int getZone1(){
        return zone1;
    }
    public int getZone2(){
        return zone2;
    }
    public int getZone3(){
        return zone3;
    }
}




