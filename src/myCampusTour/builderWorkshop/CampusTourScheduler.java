package myCampusTour.builderWorkshop;

import myCampusTour.ActivityParameters.ActivityI;
import myCampusTour.util.Results;
import java.util.List;

/**
 * This class is used to create activity i.e. building visit, cafeteria select, lecture selection, gift selection
 * Future activities can also be added here.
 * This class is also used to calculate the total cost and will add all the activities in the list as per choice.
 */
public abstract class CampusTourScheduler {
    abstract public void selectBuilding();
    abstract public void selectCafeteria();
    abstract public void selectLecture();
    abstract public void selectGift();
    abstract  public void addingAllActivityToList(ActivityI activityI);

    abstract public double calculateTotalCost();

    abstract public double calculateTotalDuration();

    abstract public int calculateTotalEfforts();

    abstract public double calculateTotalCarbonFootPrints();
    abstract public List<String> printTotal(Results results);
}
