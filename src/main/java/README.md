# 문자열 사칙 연산 계산기 구현

## 기능 목록
* 덧셈 기능
* 뺼셈 기능
* 곱셈 기능
* 나눗셈 기능
* 문자열 입력 기능
  * 입력값이 null이거나 공백 문자일 경우, throw IllegalArgumentException
  * 사칙연산 기호가 아닌 경우, throw IllegalArgumentException

---
# 자동차 경주 게임 구현

## 기능 목록
* 주어진 횟수(n)동안 m대의 자동차는 전진/멈출 수 있다.
* 사용자로부터 자동차들의 이름과 전진시도 횟수를 입력받는다.
  * 자동차들의 이름은 쉼표(,)를 기준으로 구분한다.
  * n이 양수가 아니면, throw IllegalArgumentException
  * 자동차 이름이 잘못입력되면, throw IllegalArgumentException
* 자동차의 전진 조건은 0~9 사이의 랜던 값을 구한 후 그 값이 4 이상일 경우이다.
* 매 전진 시도마다 자동차들의 위치를 출력한다.
* 경주 게임을 완료한 후 누가 우승했는지를 출력한다.
  * 우승자는 한명 이상일 수 있다. 