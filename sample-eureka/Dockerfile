FROM	insideo/jre8
MAINTAINER	wangzj 'wangzj91@sina.cn'

VOLUME	/tmp
COPY	./target/sample-eureka-1.0.0.jar /app.jar
ENTRYPOINT ["java","-jar","-Djava.security.egd=file:/dev/./urandom","app.jar"]

EXPOSE	8070