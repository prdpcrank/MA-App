Android Application: User Details Display
This Android application is designed to display user details using a native approach Kotlin. It consists of two screens: Users Listing Page and User Detail Page. The application fetches user data from an API
endpoint and saves it to an Room database to allow offline usage. Additionally, it includes a countdown timer that runs in the background using a service and closes the User Detail Page after a timeout.


Screens:
Screen 1: Users Listing Page
This screen displays a list of users with their User ID, first name, and last name. The data is retrieved from the following API endpoint: https://reqres.in/api/users?per_page=20.
When the user selects an item from the list, it opens a new screen (Screen 2) to show the details of the selected user.

Screen 2: User Detail Page
This screen presents detailed information about a particular user, including their User ID, first name, last name, email.
The data is fetched from the following API endpoint: https://reqres.in/api/users/{id}. The User ID is passed as a parameter to the API to retrieve the specific user's details.

Additionally, a countdown timer is displayed in the corner of the screen, which counts down for 5 seconds. After the timeout, the User Detail Page is closed, and the application returns to Screen 1.
The countdown timer runs in the background using a Bind service, and the updated time from the service is passed to the activity for displaying purposes.

Requirements
To run this application, you need the following:

Android Studio
Kotlin programming language support
Internet connectivity to fetch data from API endpoints
Room database support
Setup and Usage
Clone or download the project from the GitHub repository: link to the repository

Open Android Studio and import the project.

Build the project to resolve dependencies and ensure a successful compilation.

Run the application on an Android emulator or a physical device with debugging enabled.

Screen 1 (Users Listing Page) will be displayed, showing a list of users retrieved from the API endpoint. Selecting a user will open Screen 2 (User Detail Page), displaying the user's details.

On Screen 2, the countdown timer will start running in the background for 5 seconds. After the timeout, the screen will be closed, and the application will return to Screen 1.

User data is saved to the SQLite database, allowing offline access to previously fetched user information.

Implementation Details
The application is developed using Android Studio and follows the MVVM (Model-View-ViewModel) architectural pattern for better separation of concerns and maintainability. The key components and technologies used in this application are:

Kotlin: Programming languages for Android application development.
Retrofit: HTTP client library to handle API requests and responses.
Room Database: Local storage for saving and retrieving user data.
ViewModel: Holds the UI-related data and provides communication between the View and Model.
LiveData: Observable data holder that notifies the View about changes in the ViewModel.
RecyclerView: Used to display the list of users in Screen 1.
Services: Utilized for running the countdown timer in the background.
Hilt: Dependency injection library
Folder Structure
The project follows a standard Android folder structure, including:

app/: Contains the main application code.
app/src/main/java/com/example/userdetails/: Contains the Kotlin source files.
app/src/main/res/: Contains the XML resource files.
app/src/main/AndroidManifest.xml: Declares the application's components and permissions.
app/src/main/assets/: Contains any additional assets required by the application.
app/build.gradle: Configuration file for the app module.
gradle/: Contains the Gradle wrapper files.
Troubleshooting
If the application fails to build or run, ensure that all required dependencies are installed correctly.
Check the internet connectivity to ensure data can be fetched from the API endpoints.If any issues or errors occur during the countdown timer implementation, review the service and binding code.

Acknowledgments
ReqRes for providing the user data API.
Open-source libraries used in this project (Retrofit, LiveData, etc.) and their contributors.
For any further assistance or inquiries, please contact the project maintainer at prdpcrank@gmail.com.



