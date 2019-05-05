# Feedback-directed Random Testing
* Lingxiao Li (ll14)
* Chengyu Qian (cq5)

## Instructions

### Environment Setup
* System: `Mac OSX` Version 10.10 and later
* Java: Version 1.8
* Python: Version 2.7
* IDE: `Intelij` IDEA
* External JAR files:  [jacoco-0.8.3](https://www.eclemma.org/jacoco/)

### Prerequisites
Run commands below:
* `sudo apt-get -qqy install git gradle default-jdk`
* `sudo apt-get -qqy install perl python-pip`
* `sudo pip install html5validator`

### Import project
* Use command `./gradlew idea` to generate config file.
* Please use Intelij's auto import and select `gradle` project.

### To Start Generating test cases
* *Notice!* You must have all your .java compiled in your subject file
* Use the `YourRandoopDir/RandoopPreload/src/getClassesName.java`, specify your subject path in line 9.
* Obtained the generated `classes.txt`.
* Copy your subject to `YourRandoopDir/src/main/java/`. 
* Before you run `YourRandoopDir/src/main/java/randoop/main/Main.java` 
* Prepare VM options command with your jacoco file path: 

        -Xmx8000m
        -Xbootclasspath/a:/Users/xxx/jacoco-0.8.3/lib
        -javaagent:/Users/xxx/jacoco-0.8.3/lib/jacocoagent.jar
* Prepare the Arguments: 
    1. For the CBMS (proposed) approach with time limit by seconds:
       
            gentests
            --classlist=txt_has_all_class_names_path
            --time-limit=40
            --flaky-test-behavior=DISCARD
            --method-selection=CBMS
            --no-error-revealing-tests=false
            --regression-test-basename=output_file_name
    2. For the Unifrom (original) approach:
    
            gentests
            --classlist=txt_has_all_class_names_file
            --time-limit=40
            --flaky-test-behavior=DISCARD
            --method-selection=Uniform
            --no-error-revealing-tests=false
            --regression-test-basename=output_file_name
* By default, you would get the generated unit test cases java file at the `root` of the randoop project.

### To get branch coverage analysis
* You could copy the generated unit test files into `YourRandoopDir/test_collection`
* Or you could use the files under `YourRandoopDir/test_collection`, We've already copied our generated files which are stated in the report.
* To run with Jacoco:
    1. Open the Jacoco plugin in the Intelij Idea
    2. In the `configuration page`, specify your test class name, eg. `randoop.test_collection.jsoupCBMS40_0`
    3. In the `Coverage page`, choose Jacoco and include the source subject in the block under it.
    4. Run the plugin and you could find the branch coverage information.
   
    
