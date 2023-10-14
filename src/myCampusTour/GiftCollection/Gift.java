package myCampusTour.GiftCollection;


import myCampusTour.util.MyLogger;

/**
 * This is the gift class
 */
public class Gift implements GiftI {

    private double carbonFootPrintForPickingUPGift;
    private double costOfReceivedGift;
    private double timeSpentToPickupGift;
    private int effortsSpentOnGiftPicking;

    GiftEnums giftEnums;

    /**
     * Default constructor for gift class
     * @param gEnums
     * This parameter is used to store the gift enums
     */
    public Gift(GiftEnums gEnums){
        giftEnums = gEnums;
    }

    /**
     * This is used to receive the gift based on gift enums
     */
    @Override
    public void receiveGift() {
        try {
            if (giftEnums == GiftEnums.UNIVERSITY_UNION) {
                setCarbonFootPrints(30.00);
                setCost(50.00);
                setDuration(20.00);
                setEffort(100);
            }
            if (giftEnums == GiftEnums.EVENT_CENTRE) {
                setCarbonFootPrints(25.00);
                setCost(65.00);
                setDuration(15.00);
                setEffort(150);
            }
        } catch (Exception e) {
            MyLogger.writeMessage("Invalid Gift pickUp entry", MyLogger.DebugLevel.GIFT);
        } finally {

        }
    }

    /**
     * This method is used to get the carbon Footprints
     * @return carbonFootPrints
     */
    @Override
    public double getCarbonFootPrints() {
        return carbonFootPrintForPickingUPGift;
    }

    /**
     * This method is used to set the carbon Footprints
     * @param carbonFootPrints
     * This parameter is used to store the carbonFootPrints
     */
    @Override
    public void setCarbonFootPrints(double carbonFootPrints) {
        carbonFootPrintForPickingUPGift = carbonFootPrints;
    }

    /**
     * This method is used to get the cost
     * @return cost
     */
    @Override
    public double getCost() {
        return costOfReceivedGift;
    }

    /**
     * This method is used to set the cost
     * @param cost
     * This parameter is used to store the cost
     */
    @Override
    public void setCost(double cost) {
        costOfReceivedGift = cost;
    }

    /**
     * This method is used to get the duration
     * @return timeSpentToPickupGift
     */
    @Override
    public double getDuration() {
        return timeSpentToPickupGift;
    }

    /**
     * This method is used to set the duration
     * @param duration
     * This parameter is used to store the duration
     */
    @Override
    public void setDuration(double duration) {
        timeSpentToPickupGift = duration;
    }

    /**
     * This method is used to get the effort
     * @return effortsSpentOnGiftPicking
     */
    @Override
    public int getEffort() {
        return effortsSpentOnGiftPicking;
    }

    /**
     * This method is used to set the effort
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    @Override
    public void setEffort(int effort) {
    effortsSpentOnGiftPicking = effort;
    }

    /**
     * This method is used to get to String of an object
     * @return String
     */
    @Override
    public String toString() {
        return "\nThe activity for picking up a gift from" + " " +
                giftEnums +
                " is successfully completed."+"\n"+ "Below is the summary of activity."+"\n\n"+
                "Carbon Foot print for picking up a gift =" + " " +  carbonFootPrintForPickingUPGift + " " + "tonnes of CO2\n"+
                "Cost of Gift Item=" + " " + costOfReceivedGift + " " + "$\n"+
                "Time spent on picking up a gift=" + " " + timeSpentToPickupGift + " " + "minutes\n"+
                "Calories burnt on picking up a gift=" + " " + effortsSpentOnGiftPicking + " " + "calories";
    }
}
