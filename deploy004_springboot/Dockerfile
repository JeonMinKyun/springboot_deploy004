# 1. 실행 환경 (java21) : 개발하지 않고 실행하니깐 JER만 있으면 된다
FROM eclipse-temurin:21-jre-jammy

# 2. 작업 디렉터로 (FROM이미지 내부에 폴더)
WORKDIR /app

# 3. JAR파일 복사(ADD-압축 복사하고 해제 : tomcat, nginx , COPY-복사 : jar, 라이브러리)
#    ARG 는 Dockerfile에서 사용할 변수 선언 
ARG JAR_FILE=deploy004_springboot/target/*.jar
COPY ${JAR_FILE} app.jar

# 4. 애플리케이션 실행
ENTRYPOINT [ "java","-jar","app.jar" ]