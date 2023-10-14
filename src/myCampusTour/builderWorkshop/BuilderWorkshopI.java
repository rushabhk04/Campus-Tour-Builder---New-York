package myCampusTour.builderWorkshop;

/**
 * This interface is used to construct campus tour for activities.
 */
public interface BuilderWorkshopI {
    /**
     * The construct method is used to build the campus Tour
     * @param campusTourScheduler
     * This parameter is used to schedule the campusTour.
     */
    public void construct(CampusTourScheduler campusTourScheduler);
	
}
