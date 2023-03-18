USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_sendDonorEmail]    Script Date: 13-02-2023 15:58:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

Create procedure [epradhaan].[sp_sendDonorEmail]
AS
BEGIN
	select epradhaan.donor.Email from epradhaan.donor
END
GO


