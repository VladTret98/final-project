create table days (id bigint not null, date timestamp, user_id bigint, primary key (id));
create table days_dishes (day_id bigint not null, dishes_id bigint not null);
create table dishes (id bigint not null, dish_name varchar(255), primary key (id));
create table dishes_ingredients (dish_id bigint not null, ingredients_id bigint not null);
create table features (id bigint not null, calories double, carbohydrates double, fat double, proteins double, primary key (id));
create table ingredients (id bigint not null, weight double, product_id bigint, primary key (id));
create table products (id bigint not null, calories_content double not null, carbohydrates_content double not null, fat_content double not null, name varchar(255), proteins_content double not null, primary key (id));
create table users (id bigint generated by default as identity, name varchar(255), weight double not null, username varchar(255), password varchar(255), goal_id bigint, role varchar(255), primary key (id));
create sequence hibernate_sequence start with 1 increment by 1;
alter table days add constraint FKabs3l4rw11qk2t7fj61rhliy foreign key (user_id) references users;
alter table days_dishes add constraint FKruib086yuect7fh36ucoo5o3d foreign key (dishes_id) references dishes;
alter table days_dishes add constraint FK2cmh01w8cbrj54t67ewn3wr31 foreign key (day_id) references days;
alter table dishes_ingredients add constraint FK8vwn8ia4upc5wyt7ilhquiua2 foreign key (ingredients_id) references ingredients;
alter table dishes_ingredients add constraint FKfksm3q035x7fdxog1fuwl15pt foreign key (dish_id) references dishes;
alter table ingredients add constraint FK34jbb91wprx6ys2443vf43cxj foreign key (product_id) references products;
alter table users add constraint FKok2018gptdoy10clf2myp172q foreign key (goal_id) references features;