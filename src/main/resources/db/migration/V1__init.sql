CREATE TABLE babies(
    baby_id UUID primary key ,
    first_name varchar(100),
    last_name varchar(100) not null,
    age int not null,
    gender varchar(20),
    birth_date date not null
);

CREATE TABLE milestones(
    milestone_id UUID primary key,
    baby_id UUID not null references babies(baby_id),
    milestone_type varchar(20) not null,
    title varchar(200),
    notes varchar(250),
    achieved_on date not null,
    created_at timestamp not null DEFAULT now()
);

CREATE INDEX idx_milestones_baby_id on milestones(baby_id);