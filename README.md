# Repository Creation

Given that Coursera course JARs are not available in Maven, the easiest way to manage this external JAR in Maven is to install the JAR after downloading it locally in Maven and then copying the install structure to your project directory. This coupled with tuning a few knobs in the Maven POM file allows us to use a project local directory as a repository. The command used was:

    mvn install:install-file -Dfile=/location/of/my.jar -DgroupId=coursera -DartifactId=algs4 -Dversion=1.0.0 -Dpackaging=jar -DcreateChecksum=true
    
# Executing Code

To execute a given class from the root project directory, just fire the command (replace class name and input files as required)

    java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.WhiteFilter "src\main\resources\white4.txt"
    
    java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 5 5 abcdefghijklm
    
# References

* https://stackoverflow.com/questions/5692256/maven-best-way-of-linking-custom-external-jar-to-my-project/11320920#comment110819469_11320920
