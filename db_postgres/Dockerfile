FROM library/postgres
ENV POSTGRES_USER superadmin
ENV POSTGRES_PASSWORD temp
#POSTGRES_PASSWORD_FILE: /run/secrets/postgres-passwd
ENV POSTGRES_DB myszojelen
COPY 00_init.sql /docker-entrypoint-initdb.d/
COPY 01_schema.sql /docker-entrypoint-initdb.d/
COPY 02_data.sql /docker-entrypoint-initdb.d/
