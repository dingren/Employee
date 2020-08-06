create table T_EMPLOYEE
(
    ID          INT,
    "firstname" VARCHAR(255),
    "lastname"  VARCHAR(255)
);

create unique index T_EMPLOYEE_ID_UINDEX
    on T_EMPLOYEE (ID);