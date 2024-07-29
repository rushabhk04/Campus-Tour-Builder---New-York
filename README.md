## Campus Tour Builder - New York

The University Campus Tour application simulates a campus orientation experience, allowing users to plan and track activities such as building visits, cafeteria trips, lectures, and gift pickups. It provides estimates for each activity's carbon footprint, cost, effort, and duration.

### Key Features

- **Activity Tracking:**
  - **Building Visits:** Options include SOM and Watson, with modes: On Foot and Bus Ride.
  - **Cafeteria Visits:** Choices are MOUNTAIN_VIEW and CIW.
  - **Lecture Attendance:** Includes CS542 and CS540.
  - **Gift Pickup:** Options are EVENT_CENTRE and UNIVERSITY_UNION.
  - **Metrics:** Carbon footprint, cost, effort, and duration for each activity.

- **Builder Pattern:**
  - Utilizes the Builder Pattern to manage complex object construction, providing flexibility in configuring and modularizing the tour experience.

- **Programming to an Interface:**
  - Promotes extensibility and modifications without altering existing code.

- **Error Handling:**
  - Prevents duplicate building visits by logging errors and terminating if an activity is repeated.
  - Uses various debug levels for tracking issues.

- **Data Structures:**
  - Uses ArrayList for storing results, with O(1) complexity for adding elements and O(n) for removing elements.

- **Commands:**
  - **Clean:** `ant -buildfile myCampusTour/src/build.xml clean` - Cleans up .class files.
  - **Compile:** `ant -buildfile myCampusTour/src/build.xml all` - Compiles code and generates .class files.
  - **Run:** `ant -buildfile myCampusTour/src/build.xml run -Darg0="campusTourError.txt" -Darg1="1"` - Runs the application and logs errors. `-Darg1` should be numeric.
  - **Generate Javadoc:** `ant -buildfile myCampusTour/src/build.xml generate_javadoc` - Generates Javadoc for the project.

- **Driver Code Examples:**
  - **User1 Choice:** SOM_BUS, WATSON_FOOT, CIW_IN_QUEUE, EVENT_CENTRE, CS540_ONLINE
  - **User2 Choice:** UNIVERSITY_UNION, CS542_IN_CLASS, WATSON_BUS, SOM_FOOT, MOUNTAIN_VIEW_ONLINE_ORDER

  Duplicate choices result in an error and application termination.

- **Debug Levels:**
  - Includes levels for various components: FILE_PROCESSOR, CONSTRUCTOR, BUILDING_BY_BUS, CAFETERIA, GIFT, LECTURE, and more.

### Learnings

- **Builder Pattern:** Applied to provide flexible and modular configuration of activities.
- **Modular Design:** Enhanced code maintainability and extensibility.
- **Error Handling:** Developed effective logging and error management techniques.
- **Data Structures:** Gained experience with ArrayLists for efficient data handling.
- **Build Practices:** Improved skills in build automation using ANT for compiling, running, and documenting the project.
