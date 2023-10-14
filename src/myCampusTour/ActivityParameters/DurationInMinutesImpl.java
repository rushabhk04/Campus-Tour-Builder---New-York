package myCampusTour.ActivityParameters;

/**
 * Below class is the implementation of Duration interface which provides future scalability
 */
public class DurationInMinutesImpl implements  DurationI{

    private double duration;

    /**
     * This method is used to set the duration
     * @param duration
     * This parameter is used to store the duration for activities.
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * This method is used to get the duration
     * @return duration
     */
    @Override
    public double getDuration() {
        return duration;
    }
}
