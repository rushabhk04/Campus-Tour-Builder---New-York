package myCampusTour.builderWorkshop;

public class CampusTourWorkshop2 implements BuilderWorkshopI{

    /**
     * This class is a workshop which is used to implement construct activity for the users.
     * @param campusTourScheduler
     * This parameter is used to schedule the campus Tour for activities
     */
    @Override
    public void construct(CampusTourScheduler campusTourScheduler) {
        campusTourScheduler.selectGift();
        campusTourScheduler.selectLecture();
        campusTourScheduler.selectBuilding();
        campusTourScheduler.selectCafeteria();
    }
}
