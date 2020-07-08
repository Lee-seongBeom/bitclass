create or replace trigger tri01
after insert or delete on dept
begin
	dbms_output.put_line('insert event');
end;
/