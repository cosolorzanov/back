create table documenttype
(
    id   int auto_increment
        primary key,
    name varchar(50) not null
);

INSERT INTO documenttype (name)
VALUES ('Cédula de ciudadanía'),
       ('Cédula de extranjería'),
       ('Pasaporte'),
       ('Otro');

create table person
(
    id               int auto_increment
        primary key,
    document_type_id int                                 not null,
    document_number  varchar(20)                         not null,
    first_name       varchar(50)                         not null,
    last_name        varchar(50)                         not null,
    address          varchar(100)                        not null,
    birth_date       date                                not null,
    phone            varchar(20)                         not null,
    creation_date    timestamp default CURRENT_TIMESTAMP not null,
    constraint person_ibfk_1
        foreign key (document_type_id) references documenttype (id)
);

create index document_type_id
    on person (document_type_id);

create table title
(
    id            int auto_increment
        primary key,
    title_name    varchar(50)  not null,
    level         varchar(50)  not null,
    institution   varchar(100) not null,
    date_obtained date         not null,
    person_id     int          not null,
    constraint title_ibfk_1
        foreign key (person_id) references person (id)
);

create index person_id
    on title (person_id);

