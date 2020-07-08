-- if문
declare
	a number := 10;
begin
	if (a>0) then
--	수행문
		dbms_output.put_line('a>0');
	elsif (a=0) then
		dbms_output.put_line('a=0');
	else
		dbms_output.put_line('a<0');
	end if;
end;
/