#!/bin/sh

set -e

java -classpath "lib/reflections-0.9.9-RC2.jar;target/classes;target/test-classes" com.unit.XuShuangShuangJunit

echo "run-test  OVER"
