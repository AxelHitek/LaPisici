IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='CATS' AND xtype='U')
    CREATE TABLE CATS (
        ID int,
        NAME varchar(64) not null,
        COLOR varchar(64)
    )
go

IF NOT EXISTS
	(SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'CAT_SEQENCE') AND type = 'SO')
BEGIN
	CREATE SEQUENCE CAT_SEQENCE
	AS INT
	START WITH 1
	INCREMENT BY 1
	COMMIT;
END;