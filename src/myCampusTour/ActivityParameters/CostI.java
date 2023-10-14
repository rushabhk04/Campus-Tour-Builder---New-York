package myCampusTour.ActivityParameters;
/**
 * This interface has get and set cost, shared across other activities
 */
public interface CostI {
    /**
     * This method is used to get the cost
     * @return cost
     */
    public double getCost();

    /**
     * This method is used to set the cost
     * @param cost
     * This parameter is passed to store cost for activities
     */
    public void setCost(double cost);

}
