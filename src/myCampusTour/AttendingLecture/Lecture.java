package myCampusTour.AttendingLecture;

import myCampusTour.util.ErrorDisplayImplementation;
import myCampusTour.util.MyLogger;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class implements lecture interface
 */

public class Lecture implements LectureI {

    LectureEnums lectureEnums;

    private double carbonFootPrintForLectureVisit;
    private double costForALecture;
    private double durationOfTheClass;
    private int effortsSpentOnLearning;

    /**
     * Constructor of lecture
     * @param lEnums
     * This parameter is used to store the enums.
     */
    public Lecture(LectureEnums lEnums){
        MyLogger.writeMessage("In lecture constructor", MyLogger.DebugLevel.CONSTRUCTOR);
        lectureEnums = lEnums;
    }

    /**
     * This method will check lectureEnum and call the respective class
     *
     */
    @Override
    public void createLecturePlan() {
        MyLogger.writeMessage("In class lecture under create lecture method", MyLogger.DebugLevel.LECTURE);
        try {
                if (lectureEnums == LectureEnums.CS542_IN_CLASS) {
                    setCarbonFootPrints(15.50);
                    setCost(1000 + (1000 * 0.1));
                    setDuration(60.00);
                    setEffort(200);
                }
                if (lectureEnums == LectureEnums.CS540_ONLINE) {
                    setCarbonFootPrints(19.50);
                    setCost(800.00);
                    setDuration(60.00);
                    setEffort(30);
                }
        } catch (Exception e) {
            ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton("Invalid choice for Lecture")));
            ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton("Invalid choice for Enums")));
            MyLogger.writeMessage("Invalid Enum entry for Lecture", MyLogger.DebugLevel.LECTURE);
        } finally {
        }
    }

    /**
     * This method return the carbonFootPrint
     * @return carbonFootPrintForLectureVisit
     */
    @Override
    public double getCarbonFootPrints() {
        return carbonFootPrintForLectureVisit;
    }

    /**
     * This method set the carbonFootPrint
     * @param carbonFootPrints
     * This parameter is used to store the carbonFootPrints.
     */
    @Override
    public void setCarbonFootPrints(double carbonFootPrints) {
        carbonFootPrintForLectureVisit = carbonFootPrints;
    }

    /**
     * This method return the cost
     * @return costForALecture
     */
    @Override
    public double getCost() {
        return costForALecture;
    }
    /**
     * This method set the cost
     * @param cost
     * This parameter is used to store the cost.
     */
    @Override
    public void setCost(double cost) {
        costForALecture = cost;
    }

    /**
     * This method return the duration
     * @return duration
     */
    @Override
    public double getDuration() {
        return durationOfTheClass;
    }

    /**
     * This method set the duration
     * @param duration
     * This parameter is used to store the duration.
     */
    @Override
    public void setDuration(double duration) {
        durationOfTheClass = duration;
    }
    /**
     * This method return the efforts
     * @return efforts
     */
    @Override
    public int getEffort() {
        return effortsSpentOnLearning;
    }

    /**
     * This method set the efforts
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    @Override
    public void setEffort(int effort) {
    effortsSpentOnLearning = effort;
    }

    /**
     * To string method
     * @return String
     */
    @Override
    public String toString() {
        return "\nThe activity for attending a lecture " +
                lectureEnums +
                " is successfully completed."+"\n"+ "Below is the summary of activity."+"\n\n"+
                "Carbon Foot print for attending a lecture =" + " " + carbonFootPrintForLectureVisit + " " + "tonnes of CO2\n"+
                "Cost to attend one lecture=" + " " + costForALecture + " " + "$\n"+
                "Time spent on attending a lecture=" + " " + durationOfTheClass + " " + "minutes\n"+
                "Calories burnt on attending a lecture=" + " " + effortsSpentOnLearning + " " + "calories";
    }
}
