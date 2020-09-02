FROM adoptopenjdk:8-jdk-hotspot
MAINTAINER dktechin platformdev

USER root

ADD . /
RUN ./gradlew build
RUN mv build/libs/visitorpass_user-0.0.1-SNAPSHOT.jar /home/app.jar
RUN chown nobody:nogroup /home/app.jar

EXPOSE 8080

# TimeZone 설정
ENV TZ Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

USER nobody

ENTRYPOINT ["java", "-Dsun.net.inetaddr.ttl=0", "-jar", "/home/app.jar"]
