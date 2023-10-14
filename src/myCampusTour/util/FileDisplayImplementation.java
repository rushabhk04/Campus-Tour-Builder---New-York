package myCampusTour.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is used to display file implementation.
 */
public class FileDisplayImplementation implements FileDisplayInterface{
    private BufferedWriter bufferedWriter;
    private String fileName;

    static FileDisplayImplementation fileDisplayImplementation ;

    private FileDisplayImplementation() {}

    /**
     *  Singleton implementation
     */

    public static FileDisplayImplementation getFileDisplayImplementation(String fileName) {
        if(fileDisplayImplementation == null) {
            fileDisplayImplementation = new FileDisplayImplementation(fileName);
        }
        return fileDisplayImplementation;
    }

    private FileDisplayImplementation(String writeResultFileName) {
        fileName = writeResultFileName;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName, false));
        } catch (IOException e) {
            ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton(e.getMessage())));
            ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton(e.getMessage())));
            MyLogger.writeMessage("An error encountered while opening file:" + fileName + " for writing", MyLogger.DebugLevel.FILE_DISPLAY_IMPLEMENTATION);
            System.exit(1);
        }finally {

        }
    }

    /**
     * Logging the outputs to the file
     * @param data
     * This parameter is used to store the data for activities
     */
    @Override
    public void write(List<String> data) {
        for(String d: data) {
            try {
                bufferedWriter.write(d);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton(e.getMessage())));
                ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton(e.getMessage())));
                MyLogger.writeMessage("An error encountered while writing file:" + fileName, MyLogger.DebugLevel.FILE_DISPLAY_IMPLEMENTATION);
                System.exit(1);
            }
            finally {

            }
        }
    }
}
