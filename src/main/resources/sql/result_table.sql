-- result_table
drop table if exists result_table;
create table result_table
(
	id int primary key auto_increment,
    today varchar(100),
    vs varchar(100),
    game int(10),
    quarter int(10)
);

select * from result_table;