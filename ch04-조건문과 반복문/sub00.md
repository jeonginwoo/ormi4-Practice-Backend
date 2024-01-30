# 📖4. 조건문과 반복문

## ☑️ if문

```java
if (조건식) {
	실행문;
	실행문;
	...
} else if (조건식) {
	실행문;
	...
} else {   // 앞의 if, else if 조건식 모두 false일 경우 실행되는 else 코드블록
	실행문;
	...
}
```

## ☑️ switch/case 문

```java
switch(입력변수) {
    case 입력값1: 
				 실행문1; 
				 ...
         break;
    case 입력값2: 
				 실행문2; 
				 ...
         break;
    ...
    default: ...
				 디폴트_실행문;
         break;
}
```

❗case문에 break 명령어를 사용하지 않으면 다음 case문의 내용까지 실행한다.

❗범위 조건일 경우 부적절함.

## ☑️ 배열 (5.6 미리보기)

### ✔️ 선언

```java
int[] lottoNumbers;
int lottoNumbers[];
```

```java
// 배열 초기화
// 자동으로 배열 길이가 7이 됨
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
```

### ✔️ 크기 설정

```java
String[] weeks = new String[7];
// 크기 설정 안하면 오류 발생.
```

### ✔️ 접근

```java
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
System.out.println(weeks[1]);
```

```
화
```

### ✔️ 길이

```java
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
System.out.println(weeks.length);
```

```
7
```

## ☑️ for문

```java
for (초기화식; 조건문; 증감식) {
	...
}
```

```java
// for each 문
for (type 변수명: iterate) {
    body-of-loop
}
```

## ☑️ while문, do-while문

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

```java
// do-while 문
do {
		실행문; -> 조건식의 결과가 true일 때 실행될 문장
		...
} while (조건식);
```