package com.waqas.patterns.facadepattern;

/**
 * @author Waqas Shahid
 */
public class RunFacadeExample {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();
    }
}
