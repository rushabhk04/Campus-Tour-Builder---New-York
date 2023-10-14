package myCampusTour.driver;

import myCampusTour.AttendingLecture.LectureEnums;
import myCampusTour.BuildingVisit.BuildingEnums;
import myCampusTour.CafeteriaVisit.CafeteriaEnums;
import myCampusTour.GiftCollection.GiftEnums;
import myCampusTour.builderWorkshop.*;
import myCampusTour.util.ErrorDisplayImplementation;
import myCampusTour.util.MyLogger;
import myCampusTour.util.Results;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Rushabh Nilesh Kothari
 *
 */
public class Driver {
	public static void main(String[] args) {

		/**
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used.
		 */

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			MyLogger.writeMessage("Invalid number of arguments provided", MyLogger.DebugLevel.MAIN);
			System.exit(1);
		}


		ErrorDisplayImplementation.initializeErrorDisplayImplementation(args[0]);

		int debugLevel = 0;
		try {
			debugLevel = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton("The debug value specified is not correct")));
			ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton("Invalid value specified for debug level")));
			MyLogger.writeMessage("Invalid value of debugLevel" , MyLogger.DebugLevel.MAIN);
			System.exit(1);
		}

		MyLogger.setDebugValue(debugLevel);


		System.out.println("\n************************************** Fall 2022 Orientation for User 1 *********************************");


		CampusTourScheduler campusTourScheduler = new MyCampusTour(BuildingEnums.SOM_BUS,BuildingEnums.WATSON_FOOT,
				CafeteriaEnums.CIW_IN_QUEUE, LectureEnums.CS540_ONLINE, GiftEnums.EVENT_CENTRE);
		BuilderWorkshopI builderWorkshop1 = new CampusTourWorkshop();
		builderWorkshop1.construct(campusTourScheduler);
		Results r = new Results();
		campusTourScheduler.printTotal(r);

		System.out.println("\n************************************** Fall 2022 Orientation for User 2 *********************************");

		CampusTourScheduler campusTourScheduler2 = new MyCampusTour(BuildingEnums.WATSON_BUS,BuildingEnums.SOM_FOOT,
				CafeteriaEnums.MOUNTAIN_VIEW_ONLINE_ORDER, LectureEnums.CS542_IN_CLASS, GiftEnums.UNIVERSITY_UNION);
		BuilderWorkshopI builderWorkshop2 = new CampusTourWorkshop2();
		builderWorkshop2.construct(campusTourScheduler2);
		Results r1 = new Results();
		campusTourScheduler2.printTotal(r1);
	}
}
