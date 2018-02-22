#!/bin/sh -x

JAVA_OPTS="-Xmx512m -Xss256k"

java $JAVA_OPTS -Dfile.target=/destination \
                -Dfile.source=/source \
                -Djava.security.egd=file:/dev/./urandom \
                -jar ./@project.build.finalName@.jar
