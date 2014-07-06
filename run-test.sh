#!/bin/sh

set -e

java -classpath "lib/reflections-0.9.9-RC2.jar;target/classes;target/test-classes;lib/guava-15.0.jar;lib/javassist-3.18.2-GA.jar" com.unit.XuShuangShuangJunit com.baldur

echo "run-test  OVER"
