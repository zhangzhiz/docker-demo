FROM anapsix/alpine-java:latest
ENV TZ Asia/Shanghai
RUN echo "http://mirrors.aliyun.com/alpine/v3.4/main/" > /etc/apk/repositories \
        && apk --no-cache add tzdata zeromq \
        && ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime \
        && echo "${TZ}" > /etc/timezone
ADD demo-0.0.1-SNAPSHOT.jar /docker-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-demo.jar"]