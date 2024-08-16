FROM openjdk:21-jdk

# 작업 디렉터리 설정
WORKDIR /app

# 필요한 패키지 설치 (findutils 포함)
RUN apt-get update && apt-get install -y findutils && rm -rf /var/lib/apt/lists/*

# 소스 코드 복사
COPY . .

# gradlew에 실행 권한 부여
RUN chmod +x gradlew

# Gradle 빌드 실행
RUN ./gradlew build

# 애플리케이션 실행 (여기에 추가적인 명령어를 넣을 수 있습니다)
