# Chanllenge 🦾
This project is the automation for the SwagLabs mobile application, based on the Screenplay Pattern.

## Built with 🛠️
* JDK 16.0.2
* Gradle
* Serenity
* Appium
* JSON Schema Validator
* Cucumber

## Configurations ⚙️
It is necessary to have installed the Java JDK and Gradle, as well as the environment variables configured in the operating system: `JAVA_HOME` and `GRADLE_HOME`.
<br>Then run the command `gradle clean install` to download all the necessary dependencies.
<br>Emulators and appium must be configured.

## Test execution 🚀
* Create a gradle run with the runner located in `com/swaglabsmobileapp/qualityassurance/runners`
* Change the values of variables in the `serenity.properties` file

## Contributing ✒️
1. Clone the repository
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Run the tests or make changes
4. Commit your changes (`git add .` , `Git commit -m "Add some feature"`)
5. Push the branch (`git push origin my-new-feature`)
6. Create a new pull request
