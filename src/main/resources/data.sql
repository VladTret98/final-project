insert into features (calories, carbohydrates, fat, proteins, id) values (21144.0, 8457.6, 6343.2, 6343.2, 1);
insert into users (id, goal_id, name, weight, username, password, role) values (2, 1, 'admin', 75.0, 'admin', 'admin', 'USER');
insert into days (date, user_id, id) values ('2022-03-31 12:00:50', 2, 3);
insert into days (date, user_id, id) values ('2022-04-01 16:25:50', 2, 4);



insert into features (calories, carbohydrates, fat, proteins, id) values (2150, 2150, 2150, 2150, 2);
insert into users (id, goal_id, name, weight, username, password, role) values (3, 2, 'Vladislav', 80.0, 'tret', 'vladtret', 'USER');
insert into days (date, user_id, id) values ('2022-04-01 18:40:50', 3, 1);
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (113, 0.4, 1.9, 'Куриное филе', 23.6, 5);
insert into ingredients (product_id, weight, id) values (5, 350.0, 4);
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (154.0, 0.7, 11.5, 'Куриное яйцо', 12.7, 7);
insert into ingredients (product_id, weight, id) values (7,	80.0, 6);;
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (334.0, 69.9, 1.3, 'Мука', 10.8, 9);
insert into ingredients (product_id, weight, id) values (9, 80, 8);
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (77.0, 16.3, 0.4, 'Картофель', 2.0, 11);
insert into ingredients (product_id, weight, id) values (11, 350, 10);
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (748.0, 0.8, 82.5, 'Масло сливочное',0.6, 13);
insert into ingredients (product_id, weight, id) values (13, 15, 12);
insert into products (calories_content, carbohydrates_content, fat_content, name, proteins_content, id) values (43.0, 4.92, 1.13, 'Укроп', 3.46, 15);
insert into ingredients (product_id, weight, id) values (15, 10, 14);
insert into dishes (dish_name, id) values ('Вареный картофель',16);
insert into dishes (dish_name, id) values ('Куриная отбивная', 3);
insert into days_dishes (day_id, dishes_id) values (1, 3);
insert into days_dishes (day_id, dishes_id) values (1, 16);
insert into dishes_ingredients (dish_id, ingredients_id) values (3, 4);
insert into dishes_ingredients (dish_id, ingredients_id) values (3, 6);
insert into dishes_ingredients (dish_id, ingredients_id) values (3, 8);
insert into dishes_ingredients (dish_id, ingredients_id) values (16, 10);
insert into dishes_ingredients (dish_id, ingredients_id) values (16, 12);
insert into dishes_ingredients (dish_id, ingredients_id) values (16, 14);
