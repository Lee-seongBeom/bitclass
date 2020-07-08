declare
begin
	for cnt in reverse 1..5 loop
		dbms_output.put_line('cnt='||cnt);
	end loop;
end;
/