declare
	v_row dept%rowtype;--row 타입은 컬럼 전체를 받는것
begin
	select dname,loc into v_row.dname,v_row.loc from dept where deptno=10;
	dbms_output.put_line('dname:'||v_row.dname);
	dbms_output.put_line('loc:'||v_row.loc);
end;
/