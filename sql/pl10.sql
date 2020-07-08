declare
	type arr_empno is table of emp.empno%type index by binary_integer;
	type arr_ename is table of emp.ename%type index by binary_integer;
--	v_ename emp.ename%type;
	v_empno arr_empno;
	v_ename arr_ename;
	cnt integer:=2;
begin
	v_empno(0) :=7369 ;
	v_empno(1) :=7788 ;
	v_empno(2) :=7839 ;

	for i in 0..cnt loop
		select ename into v_ename(i) from emp where empno=v_empno(i);
		dbms_output.put_line(v_ename);
	end loop;

	for i in 0..cnt loop
		dbms_output.put_line(v_ename);
	end loop;

end;
/