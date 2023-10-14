package myCampusTour.BuildingVisit;

import myCampusTour.util.MyLogger;

public class BuildingVisitByFoot implements BuildingI {

    BuildingEnums buildingEnumsForFoot;

    private double carbonFootPrintForFootVisit;
    private double costForFootVisit;
    private double durationForFootVisit;
    private int effortsForFootVisit;


    /**
     * This is the constructor of building visit by foot
     * @param buildingEnums
     * This parameter is used to store the building enums
     */
    public BuildingVisitByFoot(BuildingEnums buildingEnums){
        buildingEnumsForFoot = buildingEnums;
    }

    /**
     * This method is used to create the building plan
     */
    public void createBuildingVisitPlan(){
        try {
            if (buildingEnumsForFoot == BuildingEnums.SOM_FOOT) {
                setCarbonFootPrints(17.50);
                setCost(1.00);
                setDuration(40.00);
                setEffort(300);
            }
            if (buildingEnumsForFoot == BuildingEnums.WATSON_FOOT) {
                setCarbonFootPrints(15.50);
                setCost(1.00);
                setDuration(30.00);
                setEffort(400);
            }
        }catch (Exception e){
            MyLogger.writeMessage("Invalid choice of building", MyLogger.DebugLevel.BUILDING_BY_FOOT);
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
        return carbonFootPrintForFootVisit;
    }

    /**
     * This method is used to set the carbon Footprints
     * @param carbonFootPrints
     * This parameter is used to store the carbonFootPrints for activities.
     */
    @Override
    public void setCarbonFootPrints(double carbonFootPrints) {
        carbonFootPrintForFootVisit = carbonFootPrints;
    }

    /**
     * This method is used to get the cost
     * @return cost
     */
    @Override
    public double getCost() {
        return costForFootVisit;
    }

    /**
     * This method is used to set the cost
     * @param cost
     * This parameter is used to store the cost
     */
    @Override
    public void setCost(double cost) {
        costForFootVisit = cost;
    }

    /**
     * This method is used to get the duration
     * @return duration
     */
    @Override
    public double getDuration() {
        return durationForFootVisit;
    }

    /**
     * This method is used to set the duration
     * @param duration
     * This parameter is used to store the duration
     */
    @Override
    public void setDuration(double duration) {
        durationForFootVisit = duration;
    }

    /**
     * This method is used to get the effort
     * @return effort
     */
    @Override
    public int getEffort() {
        return effortsForFootVisit;
    }

    /**
     * This method is used to set the effort
     * @param effort
     * This parameter is used to store the effort
     */
    @Override
    public void setEffort(int effort) {
        effortsForFootVisit = effort;
    }

    /**
     * This method is used to string conversion
     * @return String
     */
    @Override
    public String toString() {
        return "\nThe activity for visiting building " +
                buildingEnumsForFoot +
                " is successfully completed."+"\n"+ "Below is the summary of activity."+"\n\n"+
                "Carbon Foot print for visiting a building =" + " " +  carbonFootPrintForFootVisit + " " + "tonnes of CO2\n"+
                "Cost to tour one building=" + " " + costForFootVisit + " " + "$\n"+
                "Time spent on visiting a building=" + " " + durationForFootVisit + " " + "minutes\n"+
                "Calories burnt on visiting a building=" + " " + effortsForFootVisit + " " + "calories";
    }
}
