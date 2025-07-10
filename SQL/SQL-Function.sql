-- 1. String Functions 

SELECT concat("Shamsher", " Khan") AS fullname;
SELECT length("SHAMSHER KHAN") AS lenght;
SELECT lower("SHAMSHER KHAN") AS lower;
SELECT upper("shamsher khan");
SELECT substring("shamsher khan",5,13);
SELECT replace("SHAMSHER", "SHAM", "KHAN") ;
SELECT trim(" shamsher khan ") AS name;

-- � 2. Numeric Functions 
SELECT abs(-45);
SELECT abs(-4.5);
SELECT ceil(1.28);
SELECT floor(1.78);
SELECT round(1.1558,2);
SELECT mod(12,7);
SELECT pow(2,3);

-- �️ 3. Date and Time Functions 
SELECT now(); -- it's print date and time
SELECT curdate(); -- it's print current date
SELECT curtime(); -- it's print  current time
SELECT datediff('2025-07-13','2025-07-10'); -- it's print difference from two date
SELECT date_format(now(),'%d-%m-%y'); -- it's print date according to given order 