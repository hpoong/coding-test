### 제한사항

- 5 ≤ `players`의 길이 ≤ 50,000
  - `players[i]`는 i번째 선수의 이름을 의미합니다.
  - `players`의 원소들은 알파벳 소문자로만 이루어져 있습니다.
  - `players`에는 중복된 값이 들어가 있지 않습니다.
  - 3 ≤ `players[i]`의 길이 ≤ 10
- 2 ≤ `callings`의 길이 ≤ 1,000,000
  - `callings`는 `players`의 원소들로만 이루어져 있습니다.
  - 경주 진행중 1등인 선수의 이름은 불리지 않습니다.

---

### 입출력 예

| players | callings | result |
| --- | --- | --- |
| ["mumu", "soe", "poe", "kai", "mine"] | ["kai", "kai", "mine", "mine"] | ["mumu", "kai", "mine", "soe", "poe"] |

---

### 입출력 예 설명

입출력 예 #1

4등인 "kai" 선수가 2번 추월하여 2등이 되고 앞서 3등, 2등인 "poe", "soe" 선수는 4등, 3등이 됩니다. 5등인 "mine" 선수가 2번 추월하여 4등, 3등인 "poe", "soe" 선수가 5등, 4등이 되고 경주가 끝납니다. 1등부터 배열에 담으면 ["mumu", "kai", "mine", "soe", "poe"]이 됩니다.