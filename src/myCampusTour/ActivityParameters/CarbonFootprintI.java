package myCampusTour.ActivityParameters;

/**
 * This interface has get and set carbonFootprint which will be shared across activities
 */

public interface CarbonFootprintI {
    /**
     * This method is used to get the cost
     * @return carbonFootPrints
     */
    public double getCarbonFootPrints();
    /**
     * This method is used to set the carbonFootPrints
     * @param carbonFootPrints
     * The parameter of carbonFoot Print is taken for this method and handled accordingly.
     */
    public void setCarbonFootPrints(double carbonFootPrints);
}
