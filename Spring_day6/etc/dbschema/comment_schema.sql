drop table tcomment;
drop table tuser;
drop sequence SEQ_COMMENT;

create table tuser(
  user_id varchar2(20) primary key,
  pass varchar2(20) not null
);

create table tcomment(
  comment_no number  primary key,
  user_id varchar2(20) not null,
  content varchar2(500) not null
);

alter table tcomment add constraint tcomment_tuser_fk
 foreign key(user_id) references tuser(user_id);

create sequence SEQ_COMMENT;