# 기본 이미지 설정
FROM openjdk:21-jdk

# 작업 디렉터리 생성
WORKDIR /app

# 현재 디렉터리의 모든 파일을 컨테이너의 /app으로 복사
COPY . .

# Gradle 빌드 실행 (필요한 경우)
RUN ./gradlew build

# 애플리케이션 실행
CMD ["java", "-jar", "kbo.jar"]  # your-app.jar는 실제 JAR 파일 이름으로 수정
