package myCampusTour.BuildingVisit;

import myCampusTour.ActivityParameters.ActivityI;

/**
 * This interface extends activity interface so that it can access carbon Footprint, cost, effort and duration parameters
 * for activities.
 */
public interface BuildingI extends ActivityI {
    public void createBuildingVisitPlan();
}
