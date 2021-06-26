::color f0
::rmdir .\bin\ /s/q
::mkdir .\bin
javac -encoding UTF-8 -sourcepath .\src .\src\com\util\Output.java .\src\com\sample\Form2.java .\src\com\sample\TestShowImageTwo.java -d .\bin
copy /B /Y .\SetonAcademy_JoinThePack_1.jpg .\bin\com\sample
java -classpath .\bin com.sample.TestShowImageTwo
::pause

::[CMD] 目錄與檔案管理常用指令
::https://edisonx.pixnet.net/blog/post/57090736
::https://docs.microsoft.com/zh-tw/windows-server/administration/windows-commands/copy
::https://edisonshih.pixnet.net/blog/post/28109815