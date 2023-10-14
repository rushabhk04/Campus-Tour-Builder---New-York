# UniversityCourseRegistration

Description:
My campus Tour is developed keeping in mind the activities of the orientation such as visiting building, cafeteria, attending lecture and picking gift from various places during Fall 2022 Orientation.

Every activity displayed have carbon Footprints in tonnes of CO2, cost in dollars , efforts in calories and duration in minutes to give the user an estimate of his/her activity during campus Tour.This uses builder pattern , two workshops are developed. Here, both the workshops have different order of activities so that a user can do activity based on his/her choice. This flexibility is provided in the code. Design principle of programming to an interface is also executed. Here, class explosion is visible due to Builder Pattern which makes code more modularised and open for implementation.

Output is displayed in such a way that every activity i.e. building visit, cafeteria visit, lecture attendance and gift picking have carbon FootPrints, cost, efforts and duration. Once all activities are completed, total carbon FootPrints, cost, efforts and duration are also displayed.

Enum choices provided for building are: SOM, Watson using two modes: On foot and Bus ride.(Check enums for more details). Enum choices provided for cafeteria are: MOUNTAIN_VIEW and CIW. Enum choices provided for lecture are: CS542 and CS540. Enum choices provided for picking gifts: EVENT_CENTRE and UNIVERSITY_UNION.

In driver code: User1 choice: SOM_BUS,WATSON_FOOT,CIW_IN_QUEUE,EVENT_CENTRE,CS540_ONLINE. user2 choice: UNIVERSITY_UNION,CS542_IN_CLASS,WATSON_BUS,SOM_FOOT,MOUNTAIN_VIEW_ONLINE_ORDER.

If the user provides two choices same, i.e. SOM_BUS, SOM_BUS,CIW_IN_QUEUE,EVENT_CENTRE,CS540_ONLINE, then the error will be displayed as same building cannot be visited twice, in this scenario, code write error in log file and exit since the tour is completed if all the five activities are completed, visiting two buildings, attending lecture, going to cafeteria, picking gift.

Debug level for Logger: 1 :FILE_PROCESSOR 2 :CONSTRUCTOR 3 :BUILDING_BY_BUS 4 :BUILDING_BY_FOOT 5 :CAFETERIA 6 :GIFT 7 :LECTURE 8 :MAIN 9 :FILE_DISPLAY_IMPLEMENTATION 10 :MY_CAMPUS_TOUR 11 :RESULTS

Data Structure used: Array List to store results. Worst case time complexity - O(1) for adding elements in a list, O(n) to remove data from array list since one has to traverse through an array of n element to remove an elements. Getting an element from Array List takes O(1).


Following are the commands and the instructions to run ANT on your project.

Note: build.xml is present in myCampusTour/src folder.
Instruction to clean:
####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you compiled your code.

Instruction to compile:
####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

Instruction to run:
you can run it in the following manner:
ant -buildfile myCampusTour/src/build.xml run -Darg0="campusTourError.txt" -Darg1="1"

If for -Darg1, a string is given say for example, "abc", this will log error in campusTourError.txt and exit the system. Also,it will display error in stdout.So -Darg1 should be a "number" format.

Note: Arguments accept the absolute path of the files.

Use command to generate javadoc.

ant -buildfile myCampusTour/src/build.xml generate_javadoc


