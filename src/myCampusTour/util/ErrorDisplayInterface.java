package myCampusTour.util;

import java.util.List;

/**
 * This interface is used to display error for activities.
 */
public interface ErrorDisplayInterface {
    void writeToFile(List<String> errors);
    void write(List<String> errors);
}
