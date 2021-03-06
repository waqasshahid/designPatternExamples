package com.waqas.patterns.facadepattern;

/**
 * @author Waqas Shahid
 */
public class RunServer {

	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		
		System.out.println("Start working......");
		System.out.println("After work done.........");
		
		scheduleServer.releaseProcesses();
		scheduleServer.destroy();
		scheduleServer.destroySystemObjects();
		scheduleServer.destroyListeners();
		scheduleServer.destroyContext();
		scheduleServer.shutdown();
	}

}
