# G-PRC Practice Android

GitHub Actions로 Android Studio 없이 APK를 빌드하는 프로젝트입니다.

## GitHub에 올리는 방법
이 ZIP을 먼저 PC에서 압축 해제하세요. 그 다음 ZIP 파일 자체가 아니라
압축을 풀었을 때 보이는 `.github`, `app`, `build.gradle.kts`,
`settings.gradle.kts` 등의 파일/폴더를 저장소 최상위에 업로드하세요.

## APK 만들기
업로드 후 GitHub 저장소의 `Actions` 탭을 엽니다.

1. 왼쪽에서 `Android APK Build` 선택
2. `Run workflow` 선택
3. 빌드가 완료될 때까지 기다림
4. 완료된 실행을 열기
5. 페이지 아래 `Artifacts`에서 `GPRC-Practice-APK` 다운로드
6. 다운로드한 ZIP 안의 `app-debug.apk`를 Android 휴대폰에 설치

main/master 브랜치에 파일을 올릴 때도 자동 빌드됩니다.

## 앱 조작
- 가로 화면
- 오른쪽 하단: 로봇 이동/회전 터치 조이스틱
- 왼쪽 하단: SWITCH 버튼
- RED vs CPU BLUE
- 60초 경기
