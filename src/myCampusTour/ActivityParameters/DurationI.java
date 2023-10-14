package myCampusTour.ActivityParameters;

/**
 * This interface is used to get and set duration which will be shared across other activities
 */
public interface DurationI {

    /**
     * This method is used to get the duration
     * @return duration
     */
    public double getDuration();

    /**
     * This method is used to set the duration
     * @param duration
     * This parameter is used to store the duration for activities.
     */
    public void setDuration(double duration);
}
