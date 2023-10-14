package myCampusTour.ActivityParameters;

/**
 * This class is used to implement carbonFootprint interface which will be shared across other activities
 */
public class TonnesOfCO2Impl implements  CarbonFootprintI {

    private double carbonFootPrints;

    /**
     * This is used to set carbonFootprints
     * @param carbonFootPrints
     * This parameter is used to store the carbonFootPrint for activities.
     */
    public void setCarbonFootPrints(double carbonFootPrints) {
        this.carbonFootPrints = carbonFootPrints;
    }

    /**
     * This is used to get carbonFootprints
     * @return carbonFootPrints
     */
    @Override
    public double getCarbonFootPrints() {
        return carbonFootPrints;
    }
}
