USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchFundraiserCause]    Script Date: 13-02-2023 15:56:11 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





create PROCEDURE [epradhaan].[sp_fetchFundraiserCause]
 --DECLARE
  @FundraiserId int
AS
BEGIN
		SELECT
		[FundraiserCauseId],
		
		[TargetedMoney],
		[CauseTitle],
		[CauseDesc]
		
		FROM epradhaan.FundraiserCause  where epradhaan.FundraiserCause.FundraiserId=@FundraiserId
END

GO


