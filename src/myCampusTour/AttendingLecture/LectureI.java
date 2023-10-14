package myCampusTour.AttendingLecture;

import myCampusTour.ActivityParameters.ActivityI;

/**
 * This interface is used to create lecture plan and calculate total measure of the activity based on choice.
 */
public interface LectureI extends ActivityI {

    public void createLecturePlan();
}
