--删除表
drop table TAB_RESIDENT;
drop table TAB_RESIDENTHEALTHY;
drop table TAB_HYPERTENSION;
drop table TAB_DIABETES;
drop table TAB_CHILDRENHEALTHY;
drop table TAB_CHILDRENVACCINE;
drop table TAB_MATERNAL;
drop table TAB_ELDERLY;
drop table TAB_PERSONAL;
drop table TAB_GROUP;
drop table TAB_INFECTIOUS;
drop table TAB_USER;

--删除表空间和数据文件
drop tablespace myData including contents and datafiles;

--创建表空间
create tablespace myData
datafile 'D:\DevTools\oracleuser\oradata\MYDATABASE\DATAFILE\PUBLIC_HEALTH_SYSTEM_DATA.DBF' size 10M
autoextend on next 10M maxsize 100M;

--查询表空间对应的数据文件
select tablespace_name, file_id, bytes, file_name from dba_data_files order by file_id;

--居民信息表
create table tab_resident
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  nation varchar2(20) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  province varchar2(20),
  diploma varchar2(20),
  occupation varchar2(20),
  marriage varchar2(10)
)TABLESPACE myData;

--居民健康信息表
create table tab_residentHealthy
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  pulse int,
  height int,
  weight int,
  bloodPressure int,
  healtAssessment varchar2(20),
  responsibleDoctor varchar2(20),
  allergy varchar2(100),
  disease varchar2(100),
  surgery varchar2(100),
  family varchar2(100),
  disability varchar2(100)
)TABLESPACE myData;

--高血压患者信息表
create table tab_hypertension
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  bloodPressure int not null,
  grade int not null,
  testDate varchar2(20)  not null
)TABLESPACE myData;

--糖尿病患者信息表
create table tab_diabetes
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  type varchar2(20)  not null,
  testDate varchar2(20) not null
)TABLESPACE myData;

--儿童健康信息表
  create table tab_childrenHealthy
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  infirmity char(3) not null,
  infirmityFactor varchar2(100),
  visit int,
  oneYears int,
  twoYears int,
  sixYears int,
  mother varchar2(20),
  father varchar2(20)
)TABLESPACE myData;

--儿童疫苗接种信息表
create table tab_childrenvaccine
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  relatives varchar2(20),
  phone varchar2(20) not null,
  address varchar2(100),
  inoculationDate varchar2(20), 
  inoculationContent varchar2(100)
)TABLESPACE myData;

--孕产妇信息表
create table tab_maternal
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  expected varchar2(20),
  deliveryRecord varchar2(20),
  oneVisit varchar2(100),
  gestationalAge varchar2(20),
  twoVisit varchar2(100),
  postpartumVisit varchar2(100),
  postpartum42Day varchar2(100),
  deliveryMode varchar2(20),
  deliveryDate varchar2(20),
  babyName varchar2(20),
  babySex char(3),
  husband varchar2(20),
  healthCard varchar2(32),
	registrationDate varchar2(20)
)TABLESPACE myData;

--老年人健康信息表
create table tab_elderly
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  sex char(3) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100),
  testDate varchar2(20),
  selfCare varchar2(20),
  healthy varchar2(20),
  hypertension varchar2(20),
  diabetes varchar2(20)
)TABLESPACE myData;

--个人健康教育信息表
create table tab_personal
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  eduDoctor varchar2(20) not null,
  eduDate varchar2(20) not null,
  eduMode varchar2(20) not null,
  eduTheme varchar2(20) not null,
  eduContent clob
)TABLESPACE myData;

--群体健康教育信息表
  create table tab_group
(
  id varchar2(32) not null primary key,
  eduDate varchar2(20) not null,
  eduTheme varchar2(50) not null,
  eduType varchar2(20) not null,
  eduPlace varchar2(20) not null,
  eduObject varchar2(20) not null,
  eduNumber int not null,
  eduContent clob
)TABLESPACE myData;

--传染病信息表
create table tab_infectious
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  rId varchar2(32) not null,
  birthday varchar2(20) not null,
  phone varchar2(20) not null,
  address varchar2(100) not null,
  startDate varchar2(20) not null,
  diagnosisDate varchar2(20) not null,
  cardType varchar2(50) not null,
  type varchar2(20) not null,
  category varchar2(20) not null,
  occupation varchar2(20) not null,
  doctorReport varchar2(20) not null,
  registrationDate varchar2(20) not null
)TABLESPACE myData;

--用户信息表
create table tab_user
(
  id varchar2(32) not null primary key,
  name varchar2(20) not null,
  password varchar2(32) not null,
  rights varchar2(10) not null
)TABLESPACE myData;
