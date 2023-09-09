# Используйте официальный образ PostgreSQL
FROM postgres:latest

# Задайте переменные окружения для конфигурации PostgreSQL
ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=mypassword
ENV POSTGRES_DB=mydatabase

# По умолчанию, PostgreSQL слушает порт 5432
# Вы можете изменить порт, если это необходимо
# ENV POSTGRES_PORT=5432

# Опционально: если вам нужно выполнить дополнительные действия при создании контейнера
# COPY init.sql /docker-entrypoint-initdb.d/

# Опционально: установите кодировку, если это необходимо
# ENV POSTGRES_DB_ENCODING=UTF8

# Опционально: установите локаль, если это необходимо
# ENV POSTGRES_DB_LOCAL=en_US.utf8

# Опционально: настройте другие параметры PostgreSQL, если это необходимо
# ENV POSTGRES_OTHER_CONFIGURATION=...

# Опционально: задайте пароль администратора PostgreSQL (postgres)
# ENV POSTGRES_ADMIN_PASSWORD=adminpassword