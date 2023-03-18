USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_getDonor]    Script Date: 13-02-2023 15:58:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





Create PROCEDURE [epradhaan].[sp_getDonor]
 	@DonorId int
AS
BEGIN
		SELECT
		[DonorId],
		[DonorName],
		[DonorAddress],
		[Age],
		[Email],
		[Contact],
		[Gender],
		[DonatedMoney]
		FROM epradhaan.donor  where epradhaan.donor.DonorId=@DonorId
END
GO


