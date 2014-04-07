create index IX_538302C on LP_Book (companyId, groupId);
create index IX_196A8ACA on LP_Book (uuid_);
create index IX_7321B71E on LP_Book (uuid_, companyId);
create unique index IX_D9496D20 on LP_Book (uuid_, groupId);