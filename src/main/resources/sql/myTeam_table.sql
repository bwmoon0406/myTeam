-- myTeam_table
drop table if exists myTeam_table;
create table myTeam_table
(
	id int primary key auto_increment,
    playerName varchar(100),
    playerPosition varchar(100) default 0,
    playerAge int default 0,
    playerToll int default 0,
    playerBackNumber int default 0,
    playQuarter int default 0, 
    playerAssist int default 0,
    playerQuarterAssist int default 0,
    playerBlock int default 0,
    playerQuarterBlock int default 0,
    playerSteel int default 0,
    playerQuarterSteel int default 0,
    playerRebound int default 0,
    playerQuarterRebound int default 0,
    playerOr int default 0,
    playerQuarterOr int default 0,
    playerDr int default 0,
    playerQuarterDr int default 0,
    playerTurnOver int default 0,
    playerQuarterTurnOver int default 0,
    playerGoal int default 0,
    playerQuarterGoal int default 0
);

select * from myTeam_table;

