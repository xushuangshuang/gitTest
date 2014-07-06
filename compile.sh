#!/bin/sh

set -e

mkdir -p target/classes

mkdir -p target/test-classes

javac -d target/classes  src/main/java/com/baldur/*.java

javac -classpath target/classes -d target/test-classes  src/test/java/com/unit/*.java src/test/java/com/baldur/*.java

echo "compile.sh  SUCCESS"
