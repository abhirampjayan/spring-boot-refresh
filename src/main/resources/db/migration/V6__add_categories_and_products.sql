create table categories
(
    id   int AUTO_INCREMENT primary key,
    name varchar(255)
);

create table products
(
    id          bigint AUTO_INCREMENT primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) not null,
    category_id int,
    constraint fk_category
        foreign key (category_id) references categories (id) on delete restrict
)