FROM openjdk:7
COPY ./src /user/src
WORKDIR /user/src
RUN cd /user/src
RUN ls
RUN javac Main.java
CMD ["java", "Main"]
