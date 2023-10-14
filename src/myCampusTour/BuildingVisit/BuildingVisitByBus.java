package myCampusTour.BuildingVisit;

import myCampusTour.util.MyLogger;

/**
 * This class is used to implement building interface based on user choice of building visit by bus
 */
public class BuildingVisitByBus implements BuildingI{

    BuildingEnums buildingEnums;

    private double carbonFootPrintForBusVisit;
    private double costForBusVisit;
    private double durationForBusVisit;
    private int effortsForBusVisit;

    /**
     * Constructor of building visit by bus
     * @param bEnums
     * This parameter is used to store the enums
     */
    public BuildingVisitByBus(BuildingEnums bEnums) {
        buildingEnums = bEnums;
    }

    /**
     * This method is used to create the building plan based on building enums
     */
    public void createBuildingVisitPlan(){
        try {
            if (buildingEnums == BuildingEnums.SOM_BUS) {
                setCarbonFootPrints(27.02);
                setCost(3.00);
                setDuration(15.00);
                setEffort(100);
            }
            if (buildingEnums == BuildingEnums.WATSON_BUS) {
                setCarbonFootPrints(25.50);
                setCost(3.00);
                setDuration(10.00);
                setEffort(150);
            }
        }catch (Exception e){
            MyLogger.writeMessage("Invalid choice of Building", MyLogger.DebugLevel.BUILDING_BY_BUS);
        }
        finally {

        }

    }

    /**
     * This method is used to get the carbon Footprints
     * @return carbonFootPrint
     */
    @Override
    public double getCarbonFootPrints() {
        return carbonFootPrintForBusVisit;
    }

    /**
     * This method is used to set the carbon Footprints
     * @param  carbonFootPrints
     * This parameter is used to store the carbonFootPrints
     */
    @Override
    public void setCarbonFootPrints(double carbonFootPrints) {
        carbonFootPrintForBusVisit = carbonFootPrints;
    }

    /**
     * This method is used to get the cost
     * @return costForBusVisit
     */
    @Override
    public double getCost() {
        return costForBusVisit;
    }

    /**
     * This method is used to set the cost
     * @param cost
     * This parameter is used to store the cost
     */
    @Override
    public void setCost(double cost) {
    costForBusVisit = cost;
    }

    /**
     * This method is used to get the duration
     * @return durationForBusVisit
     */
    @Override
    public double getDuration() {
        return durationForBusVisit;
    }

    /**
     * This method is used to set the duration
     * @param duration
     * This parameter is used to store the duration
     */
    @Override
    public void setDuration(double duration) {
        durationForBusVisit = duration;
    }

    /**
     * This method is used to get the efforts
     * @return effortsForBusVisit
     */
    @Override
    public int getEffort() {
        return effortsForBusVisit;
    }

    /**
     * This method is used to set the effort
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    @Override
    public void setEffort(int effort) {
        effortsForBusVisit = effort;
    }

    /**
     * This method is used to string conversion
     * @return String
     */
    @Override
    public String toString() {
        return "\nThe activity for visiting building " +
                 buildingEnums +
                " is successfully completed."+"\n"+ "Below is the summary of activity."+"\n\n"+
                "Carbon Foot print for visiting a building =" + " " +  carbonFootPrintForBusVisit + " " + "tonnes of CO2\n"+
                "Cost to tour one building=" + " " + costForBusVisit + " " + "$\n"+
                "Time spent on visiting a building=" + " " + durationForBusVisit + " " + "minutes\n"+
                "Calories burnt on visiting a building=" + " " + effortsForBusVisit + " " + "calories";
    }
}
