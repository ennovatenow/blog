FROM frolvlad/alpine-oraclejdk8:slim

VOLUME ["/tmp"]

COPY @project.build.finalName@.jar /@project.build.finalName@.jar
COPY start.sh /start.sh

RUN sh -c 'touch /@project.build.finalName@.jar'
RUN sh -c 'touch /start.sh'

CMD ["/start.sh"]