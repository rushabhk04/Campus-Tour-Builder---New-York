package myCampusTour.ActivityParameters;

/**
 * This interface is used to get and set effort shared across all activities
 */
public interface EffortI {

    /**
     * This is used to get efforts
     * @return effort
     */
    public int getEffort();

    /**
     * This is used to set effort
     * @param effort
     * This parameter is used to store the effort for activities.
     */
    public void setEffort(int effort);
}
