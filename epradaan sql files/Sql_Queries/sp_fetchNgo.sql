USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchNgo]    Script Date: 13-02-2023 15:57:36 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





create PROCEDURE [epradhaan].[sp_fetchNgo]
 --DECLARE
AS
BEGIN
		SELECT
		[NgoId],
		[NgoName],
		[NgoAddress],
		[Email],
		[Contact]
		
		FROM epradhaan.ngo  
END

GO


