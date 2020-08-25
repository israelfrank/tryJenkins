FROM  markhobson/maven-chrome:latest

WORKDIR '/app'

COPY . .

RUN  mvn compile test-compile

CMD mvn test 


