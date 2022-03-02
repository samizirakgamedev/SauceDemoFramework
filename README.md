<img src="readmeImages/sparta.jpg" align="right" width="75" />

# Sauce Demo Framework
> Developed By:
>
> • Sami Zirak - Junior Java SDET Consultant | [Portfolio](https://samiz.dev/) | [GitHub](https://github.com/samizirakgamedev) | [LinkedIn](https://www.linkedin.com/in/sami-zirak-dezfouly/) | [Twitter](https://twitter.com/SamiZirakDev) |
>
> • Natasha Reilly - Junior Java SDET Consultant | [GitHub](https://github.com/nreilly112) | [LinkedIn](https://www.linkedin.com/in/natasha-reilly-355450189/) |
>
> • Álvaro González - Junior Java SDET Consultant | [GitHub](https://github.com/Alvaropz) | [LinkedIn](https://www.linkedin.com/in/alvaropzgz/) |
>
> • Dale Bernardo - Junior Java SDET Consultant | [GitHub](https://github.com/DalePBernardo) | [LinkedIn](https://www.linkedin.com/in/dale-bernardo-3a8063215/) |
>
> • Sajad Gulzar - Junior Java SDET Consultant | [GitHub](https://github.com/SajadGulzar) | [LinkedIn](https://www.linkedin.com/in/sajad-gulzar-322788156/) |
>
> • Suyash Srivastava - Junior Java SDET Consultant | [GitHub](https://github.com/SuyashsGit) | [LinkedIn](https://www.linkedin.com/in/suyash-srivastava-0a977a15a/) |
>
> • Ben Wong - Junior Java SDET Consultant | [GitHub](https://github.com/BwongmcST) | 
>
A testing framework for https://www.saucedemo.com/ using Selinium. This project is part of our ongoing training @ [Sparta Global](https://www.spartaglobal.com/).
### Table Of Contents ###
+ [Software & Dependencies](#software-&-dependencies)
+ [How To Use](#how-to-use)
+ [Project Scope](#project-scope)
+ [Project Management](#project-management)
+ [Testing Framework](#testing-framework)
+ [Outcomes and Future Work](#outcomes-and-future-work)
### Software & Dependencies ###
* **IntelliJ Community Edition** [Version 2021.3.2](https://www.jetbrains.com/idea/download/#section=windows)
* **JDK** [Version 17.0.2](https://jdk.java.net/17/)
* **Apache Maven**
    * **Note:** This dependency can be imported using IntelliJ.
    * _Go to **"File" > "New Project"** and then selecting **"Maven"** as the project structure._
* **JUnit Jupiter API** [Version 5.8.2](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.2)
    * _**Note:** This dependency can be imported within Intellij using Apache Maven and IntelliJ's built-in dependency generator._
    * Alternatively you can open the Maven **"pom.xml"** file and paste in the following code within the **"dependencies"** section of the file:
```xml
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.8.2</version>
    </dependency>
```
* **JUnit Vintage Engine** [Version 5.6.1](https://mvnrepository.com/artifact/org.junit.vintage/junit-vintage-engine/5.6.1)
  * _**Note:** This dependency can be imported within Intellij using Apache Maven and IntelliJ's built-in dependency generator._
  * Alternatively you can open the Maven **"pom.xml"** file and paste in the following code within the **"dependencies"** section of the file:
```xml
   <dependency>
        <groupId>org.junit.vintage</groupId>
        <artifactId>junit-vintage-engine</artifactId>
        <version>5.6.1</version>
        <scope>test</scope>
    </dependency>
```

* **Selenium Java** [Version 4.1.2](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.2)
    * _**Note:** This dependency can be imported within Intellij using Apache Maven and IntelliJ's built-in dependency generator._
    * Alternatively you can open the Maven **"pom.xml"** file and paste in the following code within the **"dependencies"** section of the file:
```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.1.2</version>
    </dependency> 
```
* **Cucumber JVM: Java** [Version 7.2.3](https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.2.3)
    * _**Note:** This dependency can be imported within Intellij using Apache Maven and IntelliJ's built-in dependency generator._
    * Alternatively you can open the Maven **"pom.xml"** file and paste in the following code within the **"dependencies"** section of the file:
```xml
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.2.3</version>
    </dependency> 
```
* **Cucumber JVM: JUnit** [Version 7.2.3](https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.2.3)
    * _**Note:** This dependency can be imported within Intellij using Apache Maven and IntelliJ's built-in dependency generator._
    * Alternatively you can open the Maven **"pom.xml"** file and paste in the following code within the **"dependencies"** section of the file:
```xml
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.2.3</version>
    </dependency>
```
<br/>
<div align="right">
    <b><a href="#sauce-demo-framework">↥ back to top</a></b>
</div>
<br/>