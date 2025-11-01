create sequence id_train;
create table driver (
                        id bigint primary key,
                        name text not null
);

create table train(
                      id bigint primary key,
                      id_driver bigint not null,
                      name text not null,
                      number_train bigint not null,
                      number_road bigint not null,
                      constraint fk_id_driver foreign key (id_driver) references driver(id) on delete cascade

)