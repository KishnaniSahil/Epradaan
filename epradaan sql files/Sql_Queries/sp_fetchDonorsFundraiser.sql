USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchDonorsFundraiser]    Script Date: 13-02-2023 15:55:43 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE PROCEDURE [epradhaan].[sp_fetchDonorsFundraiser]
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
		FROM epradhaan.donor  where epradhaan.donor.Selected =0
END

GO


