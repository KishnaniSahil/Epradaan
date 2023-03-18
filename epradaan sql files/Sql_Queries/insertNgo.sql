alter procedure [ePradhaan].[sp_insertNgo]
@Username varchar(100),
@Password varchar(100),
@Drives varchar(100),
@NgoAddress nvarchar(max),
@Contact int,
@Email nvarchar(max),
@District varchar(100),
@City varchar(100),
@Location varchar(100),
@ngoDescription nvarchar(max)
AS
BEGIN
Insert into ePradhaan.ngo(Username,Password,Drives,NgoAddress,Contact
,Email,District,City,Location,ngoDescription) values(@Username,
@Password ,
@Drives ,
@NgoAddress,
@Contact ,
@Email,
@District,
@City,
@Location,
@ngoDescription)

END
Exec [ePradhaan].[sp_insertNgo] "ROBIN HOOD ARMY","sahil","Food Drive",
"JUHU near godrej hills",9345,"robinhood@gmail.com","Mumbai","Mumbai",
"JUHU","ISKCON Juhu has a novel way of bringing the blessings of Lord Krishna in the form of food.
Anna Daan is Maha Daan" 
select * from ePradhaan.ngo