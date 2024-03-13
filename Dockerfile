FROM openjdk:17
WORKDIR /app
COPY ./target/springboot-eks-application.jar springboot-eks-application.jar
EXPOSE 8090
CMD [ "java","-jar","springboot-eks-application.jar" ]