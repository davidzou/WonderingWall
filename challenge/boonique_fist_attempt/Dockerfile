FROM openjdk:8


ARG MAVEN_VERSION=3.6.3
ARG BASE_URL=https://mirror-hk.koddos.net/apache/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz


RUN apt-get update && apt-get install -y git curl unzip && apt-get clean

RUN mkdir -p /usr/local/maven /usr/share/maven && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}

RUN tar -xzf /tmp/apache-maven.tar.gz -C /usr/local/maven --strip-components=1 && rm -f /tmp/apache-maven.tar.gz
RUN ln -s /usr/local/maven/bin/mvn /usr/bin/mvn
ENV MAVEN_HOME /usr/local/maven

RUN git clone git@github.com:bootique-examples/bootique-rest-demo.git bootique-rest-demo
RUN cd bootique-rest-demo
RUN mvn clean package

CMD ["java", "-jar", "target/bootique-rest-demo-0.0.1-SNAPSHOT.jar"]
