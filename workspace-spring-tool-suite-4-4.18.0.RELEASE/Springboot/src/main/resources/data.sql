INSERT INTO users (username,password,enabled)
values('user','Pass',true);
INSERT INTO users (username,password,enabled)
values('admin','Pass',true);
INSERT INTO authorities (username,authority)
values('user','ROLE_USER');
INSERT INTO authorities (username,authority)
values('admin','ROLE_ADMIN');