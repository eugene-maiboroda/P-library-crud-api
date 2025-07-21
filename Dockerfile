# Базовий образ з OpenJDK
FROM openjdk:21

# Копіюємо наш jar-файл у контейнер
COPY target/myapp.jar app.jar

# Вказуємо команду запуску
ENTRYPOINT ["java", "-jar", "app.jar"]