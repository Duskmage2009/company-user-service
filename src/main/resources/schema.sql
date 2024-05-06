create table users (
                       birth_date date,
                       id bigint not null,
                       address varchar(255),
                       email varchar(255) unique,
                       first_name varchar(255),
                       last_name varchar(255),
                       phone_number varchar(255),
                       primary key (id)
);