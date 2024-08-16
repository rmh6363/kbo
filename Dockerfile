# Ubuntu 기반 OpenJDK 이미지 사용
FROM openjdk:21-jdk

# 작업 디렉터리 설정
WORKDIR /app

# 필수 패키지 설치 (필요한 경우)
RUN apt-get update && \
    apt-get install -y \
    curl \
    wget \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Gradle 설치
RUN wget https://services.gradle.org/distributions/gradle-7.5-bin.zip && \
    unzip gradle-7.5-bin.zip -d /opt/ && \
    rm gradle-7.5-bin.zip && \
    ln -s /opt/gradle-7.5/bin/gradle /usr/bin/gradle

# 소스 코드 복사
COPY . .

# gradlew에 실행 권한 부여 (필요한 경우)
RUN chmod +x gradlew

# Gradle 빌드 실행
RUN ./gradlew build

# 애플리케이션 실행 (여기에 추가적인 명령어를 넣을 수 있습니다)
# CMD ["java", "-jar", "build/libs/your-app.jar"]
