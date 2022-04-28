# Introduction to Gatling & Gatling Script
This template consist of Introduction to gatling & basic gatling script with scala. Gatling is one of the performance 
testing tools that we can use in the load generation if development is focus on http support. Gatling is an open-source 
load and performance-testing framework based on Scala, Akka and Netty.

## Steps for execution:-
1.Clone the repository:-  
`https://github.com/knoldus/gatling.io/tree/GatlingScript`

2.To run the tests:- 
`mvn gatling:test`
                                            
# Technologies used:-
**Programming Language** - Scala

**Build tool** - Maven

**Automation tool** - Gatling

**IDE** - Intellij

## Dependencies Used:-

**Gatling-Highcharts**
```
        <dependency>
          <groupId>io.gatling.highcharts</groupId>
          <artifactId>gatling-charts-highcharts</artifactId>
          <version>${gatling.version}</version>
        </dependency>
```

**Gatling-App**
```
        <dependency>
          <groupId>io.gatling</groupId>
          <artifactId>gatling-app</artifactId>
          <version>${gatling.version}</version>
        </dependency>
```

**Gatling-Recorder**
```
        <dependency>
          <groupId>io.gatling</groupId>
          <artifactId>gatling-recorder</artifactId>
          <version>${gatling.version}</version>
        </dependency>
```

For better understanding, please refer to the blog:- 
https://blog.knoldus.com/a-quick-overview-of-gatling-basic-gatling-script/