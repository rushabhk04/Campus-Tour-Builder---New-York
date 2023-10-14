package myCampusTour.util;


import java.util.List;

public class Results implements StdoutDisplayInterface {

    /**
     *
     * Default constructor of Result class
     */
    public Results(){

    }

    /**
     * This method is print total measure of tour
     * @param totalDisplay
     * This parameter is used to store the total display for activities.
     */
    public void printTotalMeasureOfTour(List<String> totalDisplay){
        for(String s: totalDisplay){
            System.out.println(s);
        }

    }
}
