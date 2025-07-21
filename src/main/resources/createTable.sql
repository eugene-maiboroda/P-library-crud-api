create table books
(
    id         bigint auto_increment
        primary key,
    author     varchar(255) not null,
    genre      varchar(255) null,
    name       varchar(255) not null,
    publishing varchar(255) null,
    year       date         null
);

create table users
(
    id       bigint auto_increment
        primary key,
    login    varchar(255) not null,
    password varchar(255) not null,
    date_birthday date not null,
    role     varchar(255) not null
);
create table summaries
(
    id         bigint auto_increment
        primary key,
    content    varchar(5000) null,
    created_at datetime(6)   null,
    is_public  bit           not null,
    likes      int           not null,
    user_id    bigint        null,
    book_id    bigint        not null,
    foreign key (book_id) references books (id),
    foreign key (user_id) references users (id)
);

create table users_books
(
    id      bigint auto_increment
        primary key,
    book_id bigint null,
    user_id bigint null,
    foreign key (user_id) references users (id),
    foreign key (book_id) references books (id)
);



