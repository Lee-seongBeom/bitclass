@echo off


rem 변수에 dir명 입력받기

echo dir명을 입력해주세요
sep /p dirname =

rem 변수에 클래스명 입력받기

echo 클래스명을 입력해주세요
sep /p name =

echo ------------------------------------------

rem 컴파일 명령어 실행
javac -d . -encoding utf8 %dirname%\%name%.java
java com.bit.day08.%name%

echo ------------------------------------------
