-- set serveroutput on;
declare
-- 변수의 선언부(java로 보면 class)
	num1 number(3) :=123;
	num2 number;
	msg1 varchar2(50);
begin
-- 명령 (java로 보면 main())
	-- dbms_output.put_line 는 System.out.println();
	dbms_output.put_line('Hello'||'world..');
	dbms_output.put_line(1||2||3||4||5);
	dbms_output.put_line('1+2+3+4+5='||(1+2+3+4+5));
	dbms_output.put_line('num1='||num1);
	msg1:='1+2+3+4+5= ';
	num2:=1+2+3+4+5;
	dbms_output.put_line(msg1||num2);
end;
/