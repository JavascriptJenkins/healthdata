DROP TABLE IF EXISTS cancel_train;
DROP TABLE IF EXISTS healthdata;




CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;


CREATE TABLE healthdata (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    Rndrng_NPI VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Last_Org_Name VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_First_Name VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_MI VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Crdntls VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Gndr VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Ent_Cd VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_St1 VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_St2 VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_City VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_State_Abrvtn VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_State_FIPS VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Zip5 VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_RUCA VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_RUCA_Desc VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Cntry VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Type VARCHAR(250) NOT NULL,
    Rndrng_Prvdr_Mdcr_Prtcptg_Ind VARCHAR(250) NOT NULL,
    HCPCS_Cd VARCHAR(250) NOT NULL,
    HCPCS_Desc VARCHAR(2000) NOT NULL,
    HCPCS_Drug_Ind VARCHAR(250) NOT NULL,
    Place_Of_Srvc VARCHAR(250) NOT NULL,
    Tot_Benes VARCHAR(250) NOT NULL,
    Tot_Bene_Day_Srvcs VARCHAR(250) NOT NULL,
    Avg_Sbmtd_Chrg VARCHAR(250) NOT NULL,
    Avg_Mdcr_Alowd_Amt VARCHAR(250) NOT NULL,
    Avg_Mdcr_Pymt_Amt VARCHAR(250) NOT NULL,
    Avg_Mdcr_Stdzd_Amt VARCHAR(250) NOT NULL,
    TOT_SRVCS VARCHAR(250) NOT NULL,

    updatedtimestamp DATE NOT NULL,
    createtimestamp DATE NOT NULL
);


CREATE TABLE cancel_train (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fname VARCHAR(250) NOT NULL,
  lname VARCHAR(250) NOT NULL,
  iscanceled BOOLEAN NOT NULL,
  upvotes INT NOT NULL,
  downvotes INT NOT NULL,
  cancelstatus INT NOT NULL,
  why VARCHAR(500) NOT NULL,
  imageurl VARCHAR(250) NOT NULL,
  updatedtimestamp TIMESTAMP NOT NULL,
  createtimestamp TIMESTAMP NOT NULL
  );


CREATE TABLE token (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    token VARCHAR(250) NOT NULL,
    usermetadata VARCHAR(250) NOT NULL,
    tokenused INT NOT NULL,
    updatedtimestamp DATE NOT NULL,
    createtimestamp DATE NOT NULL
);

--   INSERT INTO cancel_train (fname,
--                            lname,
--                            iscanceled,
--                            upvotes,
--                            downvotes,
--                            cancelstatus,
--                            why,
--                            imageurl,
--                            updatedtimestamp,
--                            createtimestamp) VALUES
--     ('Dave','Evans',true,20,10,10,'did something bad','/images/myimage1','1970-01-01 12:12:12','1970-01-01 12:12:12'),
--     ('Steve','Evans',false,30,10,30,'did something real bad','/images/myimage2','1970-01-01 12:12:12','1970-01-01 12:12:12'),
--     ('Alex','Evans',true,50,10,90,'did something extra bad','/images/myimage3','1970-01-01 12:12:12','1970-01-01 12:12:12');

-- INSERT INTO real_estate (fname,
--                          lname,
--                          yrblt,
--                          isnew,
--                          sqft,
--                          baths,
--                          beds,
--                          street,
--                          city,
--                          state,
--                          zip,
--                          listing) VALUES
--   ('Dave','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC'),
--   ('Steve','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC'),
--   ('Bill','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC');