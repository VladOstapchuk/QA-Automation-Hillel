package org.HomeWorksQAAutomationJava.HomeWork10_Enum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choise;
        int zone;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ticket Machine welcomes you!");
        System.out.println("Please indicate the type of transport for traveling:");

        choise = scan.nextLine();

        //Checking that the correct type of transport has been entered
        while (!choise.equalsIgnoreCase("BUS") && !choise.equalsIgnoreCase("TRAIN") && !choise.equalsIgnoreCase("SUBWAY") )
        {
            System.out.println("Wrong choise! Please specify the correct type of transport! (BUS or TRAIN or SUBWAY)");
            choise = scan.nextLine();
        }

        System.out.println("Please indicate the area you are traveling to:");
        zone = scan.nextInt();

        //Checking that the correct type of transport has been entered
        while (zone != 1 && zone != 2 && zone != 3 )
        {
            System.out.println("Wrong choise! Please specify the correct area( 1 or 2 or 3):");
            zone = scan.nextInt();
        }

        //calling TicketMachine
        TicketMachine ticketMachine = new TicketMachine(choise, zone);
        System.out.println("The price of your ticket for the trip is: " + ticketMachine.calculateFare());



    }






}
