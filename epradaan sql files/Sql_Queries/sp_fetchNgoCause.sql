USE [ePradhaan]
GO

/****** Object:  StoredProcedure [epradhaan].[sp_fetchNgoCause]    Script Date: 13-02-2023 15:57:59 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





create PROCEDURE [epradhaan].[sp_fetchNgoCause]
 --DECLARE
  @NgoId int
AS
BEGIN
		SELECT
		[NgoCauseId],
		
		[TargetedMoney],
		[DriveTitle],
		[DriveDesc]
		
		FROM epradhaan.ngoCause  where epradhaan.ngoCause.NgoId=@NgoId
END

GO


