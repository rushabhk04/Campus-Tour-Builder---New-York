package myCampusTour.CafeteriaVisit;


import myCampusTour.util.MyLogger;

/**
 * This is cafeteria class which implements Cafeteria interface
 */
public class Cafeteria implements CafeteriaI {

    CafeteriaEnums cEnums;
    private double carbonFootPrintForCafeteria;
    private double costForVisitingCafeteria;
    private double timeSpentInCafe;

    private int effortsSpentOnCafeteria;

    /**
     * Default constructor of the cafeteria
     * @param cafeteriaEnums
     * This parameter is used to store the cafeteria enums
     */
    public Cafeteria(CafeteriaEnums cafeteriaEnums){
        cEnums = cafeteriaEnums;
    }

    /**
     * This method is used to create the cafeteria plan based on cafeteria enums
     */
    @Override
    public void createCafeteriaPlan() {
        try {
            if (cEnums == CafeteriaEnums.MOUNTAIN_VIEW_ONLINE_ORDER) {
                setCarbonFootPrints(10.50);
                setCost(20 + 0.5*20);
                setDuration(20.00);
                setEffort(50);
            }
            if (cEnums == CafeteriaEnums.CIW_IN_QUEUE) {
                setCarbonFootPrints(15.05);
                setCost(20.00);
                setDuration(30.00);
                setEffort(100);
            }
        } catch (Exception e) {
            MyLogger.writeMessage("Invalid Cafeteria Entry", MyLogger.DebugLevel.CAFETERIA);
        } finally {

        }
    }

    /**
     * This method is used to get the carbonFootPrints
     * @return carbonFootPrints
     */
    @Override
    public double getCarbonFootPrints() {
        return carbonFootPrintForCafeteria;
    }
    /**
     * This method is used to set the carbonFootPrints
     * @param carbonFootPrints
     * This parameter is used to store the carbonFootPrints
     */
    @Override
    public void setCarbonFootPrints(double carbonFootPrints) {
        carbonFootPrintForCafeteria = carbonFootPrints;
    }
    /**
     * This method is used to get the cost
     * @return cost
     */
    @Override
    public double getCost() {
        return costForVisitingCafeteria;
    }
    /**
     * This method is used to set the carbonFootPrints
     * @param cost
     * This parameter is used to store the cost
     */
    @Override
    public void setCost(double cost) {
        costForVisitingCafeteria = cost;
    }

    /**
     * This method is used to get the duration
     * @return duration
     */
    @Override
    public double getDuration() {
        return timeSpentInCafe;
    }
    /**
     * This method is used to set the carbonFootPrints
     * @param  duration
     * This parameter is used to store the duration
     */
    @Override
    public void setDuration(double duration) {
        timeSpentInCafe = duration;
    }
    /**
     * This method is used to get the effort
     * @return effort
     */
    @Override
    public int getEffort() {
        return effortsSpentOnCafeteria;
    }
    /**
     * This method is used to set the effort
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    @Override
    public void setEffort(int effort) {
        effortsSpentOnCafeteria = effort;
    }

    /**
     * This method is used to convert details to String
     * @return String
     */
    @Override
    public String toString() {
        return "\nThe activity for visiting a cafeteria " +
                cEnums +
                " is successfully completed."+"\n"+ "Below is the summary of activity."+"\n\n"+
                "Carbon Foot print for ordering food =" + " " +  carbonFootPrintForCafeteria + " " + "tonnes of CO2\n"+
                "Bill generated based on food order=" + " " + costForVisitingCafeteria + " " + "$\n"+
                "Time spent on ordering food in a cafe=" + " " + timeSpentInCafe + " " + "minutes\n"+
                "Calories burnt on ordering food in a cafe=" + " " + effortsSpentOnCafeteria + " " + "calories";
    }
}
