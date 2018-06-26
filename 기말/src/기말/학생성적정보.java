package 기말;

public class 학생성적정보 {
private final int 최대저장학생수;
private String[] 학번배열, 이름배열, 학점배열;
private int[] 중간배열, 기말배열, 출석배열, 과제배열, 총계배열;

public 학생성적정보(int 입력줄수)
{
this.최대저장학생수 = 입력줄수;

// 객체 생성
학번배열 = new String[최대저장학생수];
이름배열 = new String[최대저장학생수];
중간배열 = new int[최대저장학생수];
중간배열 = new int[최대저장학생수];
기말배열 = new int[최대저장학생수];
출석배열 = new int[최대저장학생수];
과제배열 = new int[최대저장학생수];
총계배열 = new int[최대저장학생수];
학점배열 = new String[최대저장학생수];

// 총계, 학점 초기화
for (int i = 0; i < 최대저장학생수; i++)
{
총계배열[i] = 0;
학점배열[i] = "X";
}
}

// 학생성적자료 저장하기
public void 학생성적자료_저장하기(String[] 학번, String[] 이름, int[] 중간, int[] 기말, int[] 출석, int[] 과제)
{
this.학번배열 = 학번;
this.이름배열 = 이름;
this.중간배열 = 중간;
this.기말배열 = 기말;
this.출석배열 = 출석;
this.과제배열 = 과제;
}

// 학생성적정보 저장하기 (자료를 토대로 나온 총계, 학점)
public void 학생성적정보_저장하기(int[] 총계, String[] 학점)
{
this.총계배열 = 총계;
this.학점배열 = 학점;
}

// get
public String[] get학번배열() { return this.학번배열; }
public String[] get이름배열() { return this.이름배열; }
public String[] get학점배열() { return this.학점배열; }
public int[] get중간배열() { return this.중간배열; }
public int[] get기말배열() { return this.기말배열; }
public int[] get출석배열() { return this.출석배열; }
public int[] get과제배열() { return this.과제배열; }
public int[] get총계배열() { return this.총계배열; }

// set
public void set총계배열(int[] 총계) { this.총계배열 = 총계; }
public void set학점배열(String[] 학점) { this.학점배열 = 학점; }
}
