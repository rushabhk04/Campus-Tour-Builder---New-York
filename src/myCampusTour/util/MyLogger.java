
package myCampusTour.util;

public class MyLogger{

    public static enum DebugLevel {NONE, CONSTRUCTOR, FILE_PROCESSOR,BUILDING_BY_BUS,BUILDING_BY_FOOT,CAFETERIA,GIFT,
                                  LECTURE,MAIN,FILE_DISPLAY_IMPLEMENTATION,MY_CAMPUS_TOUR,RESULTS
                                   }

    private static DebugLevel debugLevel;


    // FIXME: Add switch cases for all the levels
    public static void setDebugValue (int levelIn) {
        switch (levelIn) {
		case 2 : debugLevel = DebugLevel.CONSTRUCTOR;break;
		case 3 : debugLevel = DebugLevel.BUILDING_BY_BUS; break;
		case 4 : debugLevel = DebugLevel.BUILDING_BY_FOOT; break;
		case 5 : debugLevel = DebugLevel.CAFETERIA; break;
		case 6 : debugLevel = DebugLevel.GIFT;break;
		case 7 : debugLevel = DebugLevel.LECTURE;break;
		case 8 : debugLevel = DebugLevel.MAIN;break;
		case 9 : debugLevel = DebugLevel.FILE_DISPLAY_IMPLEMENTATION; break;
		case 10 :debugLevel = DebugLevel.MY_CAMPUS_TOUR;break;
		case 11: debugLevel = DebugLevel.RESULTS;break;
		case 1 : debugLevel = DebugLevel.FILE_PROCESSOR;break;
            default : debugLevel = DebugLevel.NONE;break;
        }
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    /**
     * This method write message for logging
     * @param message
     * This takes parameter message as String.
     * @param levelIn
     * This argument provided level for logging
     */
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "The debug level has been set to the following " + debugLevel;
    }
}
