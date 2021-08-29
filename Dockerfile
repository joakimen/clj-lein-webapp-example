FROM clojure:lein-2.9.1
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY project.clj /usr/src/app/
RUN lein deps
COPY . /usr/src/app
RUN mv "$(lein uberjar | sed -n 's/^Created \(.*app\.jar\)/\1/p')" app.jar
CMD ["java", "-jar", "app.jar"]