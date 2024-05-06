create table if not exists users (
                       birth_date date,
                       id bigint not null,
                       address varchar(255),
                       email varchar(255),
                       first_name varchar(255),
                       last_name varchar(255),
                       phone_number varchar(255),
                       primary key (id)
);

create sequence if not exists users_seq start with 1 increment by 50