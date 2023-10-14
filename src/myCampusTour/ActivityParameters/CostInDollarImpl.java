package myCampusTour.ActivityParameters;

/**
 * Below class is the implementation of cost, which provides future scalability
 */
public class CostInDollarImpl implements CostI{

    private double cost;

    /**
     * This method is used to set the cost
     * @param cost
     * This parameter is used to store the cost for other activities.
     */

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * This method is used to get the cost
     * @return cost
     */
    @Override
    public double getCost() {
        return cost;
    }
}
