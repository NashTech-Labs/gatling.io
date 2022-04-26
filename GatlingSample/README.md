In this template, we will cover the basics gatling script.

# Introduction:-
Gatling is one of the performance testing tools that we can use in the load generation 
if development is focus on http support. Gatling is an open-source load and performance-testing 
framework based on Scala, Akka and Netty.

# Technologies used:-

## Programming language - Scala

## Build tool - Maven

## Automation tool - Gatling

## IDE - Intellij

## Dependencies Used:-

<dependencies>

    <dependency>
      <groupId>io.gatling.highcharts</groupId>
      <artifactId>gatling-charts-highcharts</artifactId>
      <version>${gatling.version}</version>
    </dependency>

    <dependency>
      <groupId>io.gatling</groupId>
      <artifactId>gatling-app</artifactId>
      <version>${gatling.version}</version>
    </dependency>

    <dependency>
      <groupId>io.gatling</groupId>
      <artifactId>gatling-recorder</artifactId>
      <version>${gatling.version}</version>
    </dependency>

  </dependencies>

## Steps for execution:-
 1.Clone the repository:-
   

 2.You can run the script from terminal using:- $ mvn gatling:test
                                 Or
 In order to run the script from intellij, we just have to right-click on engine and then select run option.

For better understanding, please refer to the blog:- 