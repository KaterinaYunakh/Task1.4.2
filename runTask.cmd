if not exist "src\main\java\classes" mkdir src\main\java\classes

"%JAVA_HOME%\bin\javac" -d src\main\java\classes -cp src\main\java src\main\java\com\katerina\Cars\Main.java
"%JAVA_HOME%\bin\java" -cp src\main\java\classes Main

pause