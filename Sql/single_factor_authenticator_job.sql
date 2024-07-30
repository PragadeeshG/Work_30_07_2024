create table if not exists single_factor_authenticator_job(
sfa_device_id Integer not null,
sfa_device_name varchar(255) null,
sfa_device_registry varchar(255) null,
sfa_device_start_time varchar(255) null,
sfa_device_approved_time varchar(255) null,
sfa_device_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint single_factor_authenticator_job_pk primary key(sfa_device_id));