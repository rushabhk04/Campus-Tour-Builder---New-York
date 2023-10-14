package myCampusTour.builderWorkshop;

public class CampusTourWorkshop implements BuilderWorkshopI {

    /**
     * This class is a workshop which is used to implement construct activity for the users.
     * @param campusTourScheduler
     *This parameter is used to construct the workshop with four methods given below.
     */
    @Override
    public void construct(CampusTourScheduler campusTourScheduler) {
        campusTourScheduler.selectBuilding();
        campusTourScheduler.selectCafeteria();
        campusTourScheduler.selectGift();
        campusTourScheduler.selectLecture();
    }
}
