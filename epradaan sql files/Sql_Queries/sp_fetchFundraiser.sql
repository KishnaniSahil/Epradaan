USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchFundraiser]    Script Date: 13-02-2023 15:55:58 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





create PROCEDURE [epradhaan].[sp_fetchFundraiser]
 --DECLARE
AS
BEGIN
		SELECT
		[FundraiserId],
		[FundraiserName],
		
		[Email],
		[Contact]
		
		FROM epradhaan.fundraiser  
END

GO


