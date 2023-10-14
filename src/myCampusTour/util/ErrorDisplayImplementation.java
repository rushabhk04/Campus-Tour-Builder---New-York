package myCampusTour.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorDisplayImplementation implements ErrorDisplayInterface {
    private BufferedWriter bufferedWriter;
    private String fileName;

    static ErrorDisplayImplementation errorDisplayImplementation;

    private ErrorDisplayImplementation() {
    }

    //Singleton implementation
    public static ErrorDisplayImplementation getErrorDisplayImplementation() {
        return errorDisplayImplementation;
    }

    public static void initializeErrorDisplayImplementation(String fileName) {
        if(errorDisplayImplementation == null) {
            errorDisplayImplementation = new ErrorDisplayImplementation(fileName);
        }
    }

    /**
     *
     * @param writeResultFileName
     * This parameter is used to store the file name
     */
    public ErrorDisplayImplementation(String writeResultFileName) {
        fileName = writeResultFileName;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName, false));
        } catch (IOException e) {
            ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton("An error encountered while opening the file")));
            ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton("An error encountered while opening the file for writing in it")));
            MyLogger.writeMessage("An error encountered while opening file:" + fileName + " for writing", MyLogger.DebugLevel.CONSTRUCTOR);
            System.exit(1);
        } finally {

        }
    }

    /**
     * Writing errors in file
     * @param errors
     * This parameter is used to store the errors
     */
    @Override
    public void writeToFile(List<String> errors) {
        for (int i = 0; i <  errors.size(); i++) {
            String err = errors.get(i);
            try {
                bufferedWriter.write(err);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                ErrorDisplayImplementation.getErrorDisplayImplementation().writeToFile(new ArrayList<>(Collections.singleton("An error encountered while opening the file")));
                ErrorDisplayImplementation.getErrorDisplayImplementation().write(new ArrayList<>(Collections.singleton("An error encountered while writing")));
                MyLogger.writeMessage("An error encountered while writing file:" + fileName, MyLogger.DebugLevel.CONSTRUCTOR);
                System.exit(1);
            } finally {

            }
        }
    }

    /**
     * Display errors on terminal
     * @param errors
     * This parameter is used to store the errors for activities.
     */
    @Override
    public void write(List<String> errors) {
        for(String e: errors) {
            System.out.println(e);
        }
    }


}
