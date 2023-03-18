USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchDonorsNgo]    Script Date: 13-02-2023 15:55:51 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE PROCEDURE [epradhaan].[sp_fetchDonorsNgo]
 --DECLARE
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
		[DonatedMoney],
		[Images]
		FROM epradhaan.donor  where epradhaan.donor.Selected =1
END

GO


