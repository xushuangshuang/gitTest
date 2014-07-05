#!/bin/sh

javac -d target/classes  src/main/java/com/baldur/*.java

javac -classpath target/classes -d target/test-classes src/test/java/com/baldur/*.java
