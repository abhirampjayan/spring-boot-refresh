create table profiles
(
    id             bigint not null
        primary key,
    bio            varchar(255) null,
    phone_number   varchar(15) null,
    date_of_birth  DATE null,
    loyalty_points int default 0 null,
    constraint profiles_users_id_fk
        foreign key (id) references users (id)
);

create table tags
(
    id   int AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) not null
);

create table user_tags
(
    user_id bigint not null,
    tag_id  int    not null,
    primary key (user_id, tag_id),
    foreign key (user_id) references users (id) on delete cascade,
    foreign key (tag_id) references tags (id) on delete cascade
);
