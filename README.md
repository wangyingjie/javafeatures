# Java 9 & 10 & 11

[![Build Status](https://travis-ci.org/JonasHavers/javafeatures.svg?branch=master)](https://travis-ci.org/JonasHavers/javafeatures)

The tests in this project demonstrate some features that were introduced in Java 9 and Java 10.

As usual, the tests are in `src/test/java`.

The project is based on:

* Gradle 4.10.2 (wrapper)
* JDK 11
* JUnit 5.1

Run the tests with:

`./gradlew test`

## 本地测试
1、本次测试如果报错：Could not initialize class org.codehaus.groovy.vmplugin.v7.Java7
   gradle版本太低需要6.X以上版本，参考：https://www.jianshu.com/p/9b58d2fd9423

2、jdk迭代新版本特性更新增加新module需要修改：build.gradle/settings.gradle 两个文件配置