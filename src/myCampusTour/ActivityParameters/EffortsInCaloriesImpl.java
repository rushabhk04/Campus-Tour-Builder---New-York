package myCampusTour.ActivityParameters;

/**
 * This class is used to implement effort interface methods which will provide future scalability
 */
public class EffortsInCaloriesImpl implements EffortI{

    private int effort;

    /**
     * This is used to get efforts
     * @return effort
     */
    @Override
    public int getEffort() {
        return effort;
    }

    /**
     * This is used to set effort
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    public void setEffort(int effort) {
        this.effort = effort;
    }
}
