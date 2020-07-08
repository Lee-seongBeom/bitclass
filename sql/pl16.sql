create or replace function func01
--(num1 number,num2 number,num3 number) 
return number
is
 cnt number;
begin
--	return num1+num2+num3;
	insert into dept values(60,'test','test');
	select count(*) into cnt from dept;
	return cnt;
end;
/