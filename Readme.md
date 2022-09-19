1. File> Settings> File Encoding : Intellij Project Encoding : UTF-8로 변경
2. Help> Edit Custom VM Option: 아래 옵션추가
```vm option
-Dfile.encoding=UTF-8
-Dconsole.encoding=UTF-8
```
3. clean & build


### 06 
코틀린 빌드스크립트는 .kts확장자 . 코틀린 스크립트의 약자



kotlin-java-spring 이 submodule 로 잡히는 걸로 확인되서 추가 작업 필요