create table policy12(
	Id int not null auto_increment,
	Name varchar(64),
	Category varchar(64),
	Sum_assured int,
	primary key (Id)
	);

	
create table customer12(
	Id int not null auto_increment,
	Name varchar(64),
	policy_id int,
	
	primary key (Id)
	
		);
		
create table policy_customer(
		policy_id int not null,
		customer_id int not null,
		primary key(policy_id,customer_id),
		foreign key (policy_id)
			references policy12(Id),
		foreign key (customer_id)
			references customer12(Id)
			
			);
		
		