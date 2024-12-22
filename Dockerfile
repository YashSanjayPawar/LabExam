FROM openjdk:17-jdk
WORKDIR /app
COPY . /app
RUN javac SumOf100EvenNo.java
CMD [ "java" ,  "SumOf100EvenNo" ]