package myCampusTour.builderWorkshop;

import myCampusTour.AttendingLecture.Lecture;
import myCampusTour.AttendingLecture.LectureI;
import myCampusTour.BuildingVisit.*;
import myCampusTour.CafeteriaVisit.Cafeteria;
import myCampusTour.CafeteriaVisit.CafeteriaEnums;
import myCampusTour.CafeteriaVisit.CafeteriaI;
import myCampusTour.GiftCollection.Gift;
import myCampusTour.GiftCollection.GiftEnums;
import myCampusTour.AttendingLecture.LectureEnums;
import myCampusTour.GiftCollection.GiftI;
import myCampusTour.ActivityParameters.ActivityI;
import myCampusTour.util.ErrorDisplayImplementation;
import myCampusTour.util.MyLogger;
import myCampusTour.util.Results;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class extends the campus tour scheduler abstract class.
 */

public class MyCampusTour extends CampusTourScheduler {

    List<ActivityI> activitiesList = new ArrayList<>();

    BuildingI building1;
    BuildingI building2;
    BuildingEnums building1enum;
    BuildingEnums building2enum;
    CafeteriaI cafeteria;
    CafeteriaEnums cafeteriaEnums;
    GiftI gift;
    GiftEnums gEnums;
    LectureI lecture;

    LectureEnums lEnums;

    /**
     * This constructor is used to take enum values for every activity.
     *
     */
    public MyCampusTour(BuildingEnums b1enum, BuildingEnums b2enum, CafeteriaEnums cafeEnums,
                        LectureEnums lectureEnums, GiftEnums giftEnums) {
        MyLogger.writeMessage("In campusTour constructor", MyLogger.DebugLevel.CONSTRUCTOR);
        building1enum = b1enum;
        building2enum = b2enum;
        cafeteriaEnums = cafeEnums;
        gEnums = giftEnums;
        lEnums = lectureEnums;

    }


    /**
     * This method is used to add all activity in the list
     * @param activityI
     * This parameter is used to store the activities.
     */
    @Override
    public void addingAllActivityToList(ActivityI activityI) {
        activitiesList.add(activityI);
    }

    /**
     * This method returns total cost of all activities
     * @return cost
     */
    @Override
    public double calculateTotalCost() {
        double cost = 0;
        for(ActivityI activity : activitiesList){
            cost+=activity.getCost();
        }
        return cost;
    }

    /**
     * This method returns total duration of all activities
     * @return duration
     */
    @Override
    public double calculateTotalDuration() {
        double duration = 0;
        for(ActivityI activity : activitiesList){
            duration+=activity.getDuration();
        }
        return duration;
    }

    /**
     * This method returns total efforts of all the activities
     * @return effort
     */
    @Override
    public int calculateTotalEfforts() {
        int efforts = 0;
        for(ActivityI activityI:activitiesList){
            efforts+=activityI.getEffort();
        }
        return efforts;
    }

    /**
     * This method is used to calculate total carbon footPrints of all the activities
     * @return carbonFootPrints
     */
    @Override
    public double calculateTotalCarbonFootPrints() {
    double carbonFootPrints = 0;
    for(ActivityI activityI: activitiesList){
        carbonFootPrints += activityI.getCarbonFootPrints();
    }
    return carbonFootPrints;
    }




    /**
     * This method is used to select the building based on enum values
     */
    @Override
    public void selectBuilding() {
        MyLogger.writeMessage("In campus tour class under select building method", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
        try {
            if(building1enum != building2enum) {
                if (building1enum == BuildingEnums.SOM_BUS || building1enum == BuildingEnums.WATSON_BUS) {
                    building1 = new BuildingVisitByBus(building1enum);
                    building1.createBuildingVisitPlan();
                    addingAllActivityToList(building1);
                    System.out.println(building1.toString());
                }
                if (building1enum == BuildingEnums.SOM_FOOT || building1enum == BuildingEnums.WATSON_FOOT) {
                    building1 = new BuildingVisitByFoot(building1enum);
                    building1.createBuildingVisitPlan();
                    addingAllActivityToList(building1);
                    System.out.println(building1.toString());
                }
                if (building2enum == BuildingEnums.SOM_FOOT || building2enum == BuildingEnums.WATSON_FOOT) {
                    building2 = new BuildingVisitByFoot(building2enum);
                    building2.createBuildingVisitPlan();
                    addingAllActivityToList(building2);
                    System.out.println(building2.toString());
                }
                if (building2enum == BuildingEnums.SOM_BUS || building2enum == BuildingEnums.WATSON_BUS) {
                    building2 = new BuildingVisitByBus(building2enum);
                    building2.createBuildingVisitPlan();
                    addingAllActivityToList(building2);
                    System.out.println(building2.toString());
                }
            }
            else{
                ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton("The choice for building should be different")));
                ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton("The choice for building should be different")));
                MyLogger.writeMessage("Invalid choice for building", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
                System.exit(1);
            }
        }catch (Exception e){
            MyLogger.writeMessage("Invalid Enum choice", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
            System.exit(1);
        }
        finally {

        }

    }

    /**
     * This method is used to select the cafeteria based on enums
     */
    @Override
    public void selectCafeteria() {
        MyLogger.writeMessage("In campusTour class under selectCafeteria method", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
        cafeteria = new Cafeteria(cafeteriaEnums);
        cafeteria.createCafeteriaPlan();
        addingAllActivityToList(cafeteria);
        System.out.println(cafeteria.toString());
    }

    /**
     * This method is used to select the lecture based on the enum values
     */
    @Override
    public void selectLecture() {
        MyLogger.writeMessage("In my campus tour under select lecture", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
        lecture = new Lecture(lEnums);
        lecture.createLecturePlan();
        addingAllActivityToList(lecture);
        System.out.println(lecture.toString());
    }

    /**
     * This method is used to select gift based on enum values
     */
    @Override
    public void selectGift() {
        MyLogger.writeMessage("In my campus tour under select gift method", MyLogger.DebugLevel.MY_CAMPUS_TOUR);
        gift = new Gift(gEnums);
        gift.receiveGift();
        addingAllActivityToList(gift);
        System.out.println(gift.toString());
    }

    /**
     * This method is used to print total activities
     * @param res
     * This parameter is used to store the results for activities.
     * @return listOfStrings
     */
    public List<String> printTotal(Results res) {
        List<String> totalDisplayOfAllActivities = new ArrayList<>();
        totalDisplayOfAllActivities.add("**************************************************************************************************************");
        totalDisplayOfAllActivities.add("Yippee!! You have successfully completed the campus tour activity for Fall 2022 Orientation. Please view below the summary of your tour:");
        totalDisplayOfAllActivities.add("Total carbon footprint for entire activity:\n" + " " + calculateTotalCarbonFootPrints()+ " " +"tonnes of CO2.\n");
        totalDisplayOfAllActivities.add("Total bill for entire activity: \n" +calculateTotalCost() +"$.\n");
        totalDisplayOfAllActivities.add("Total duration for your tour is :\n"+calculateTotalDuration() +  " " +"minutes.\n");
        totalDisplayOfAllActivities.add("Total Efforts for entire activity: \n"+calculateTotalEfforts() + " " + "calories");
        totalDisplayOfAllActivities.add("**************************************************************************************************************\n");
        res.printTotalMeasureOfTour(totalDisplayOfAllActivities);
        return totalDisplayOfAllActivities;
    }
}
