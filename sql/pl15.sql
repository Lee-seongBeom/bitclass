create or replace procedure proc01
(num in number,num2 out number)
is
-- 선언부
begin
	num2 := 1000+num;
	dbms_output.put_line('hello world222'||num);
end;
/