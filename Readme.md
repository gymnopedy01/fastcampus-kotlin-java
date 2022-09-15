1. File> Settings> File Encoding : Intellij Project Encoding : UTF-8로 변경
2. Help> Edit Custom VM Option: 아래 옵션추가
```vm option
-Dfile.encoding=UTF-8
-Dconsole.encoding=UTF-8
```
3. clean & build