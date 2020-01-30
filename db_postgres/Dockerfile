FROM library/postgres
ENV POSTGRES_USER superadmin
ENV POSTGRES_PASSWORD temp
#POSTGRES_PASSWORD_FILE: /run/secrets/postgres-passwd
ENV POSTGRES_DB myszojelen
#flyway does the job - not needed anymore
#COPY V0.1__Grant_rights.sql /docker-entrypoint-initdb.d/
#COPY V0.2__Create_init_schema.sql /docker-entrypoint-initdb.d/
#COPY V1.0__Insert_data_into_Animals.sql /docker-entrypoint-initdb.d/
