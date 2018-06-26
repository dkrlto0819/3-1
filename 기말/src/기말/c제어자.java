package 기말;

public class c제어자 {
private final int 최대저장학생수;
private 학생성적정보 학생성적정보_객체;
private 점수적용자료 점수적용자료_객체;

public c제어자(int 입력줄수)
{
this.최대저장학생수 = 입력줄수;

학생성적정보_객체 = new 학생성적정보(최대저장학생수);
점수적용자료_객체 = new 점수적용자료();
}

// 학생성적계산
public void 학생성적계산()
{
int[] 총점배열;
String[] 학점배열;

총점배열 = 총점계산();
학점배열 = 학점계산(총점배열);

// 계산결과 저장
학생성적정보_객체.set총계배열(총점배열);
학생성적정보_객체.set학점배열(학점배열);
}

// 반영비율에 따른 총점 계산
private int[] 총점계산()
{
double[] 점수반영비율_퍼센트;
int[] 점수반영비율, 중간점수, 기말점수, 출석점수, 과제점수;
int[] 총점 = new int[최대저장학생수];

점수반영비율 = 점수적용자료_객체.get점수반영비율();
점수반영비율_퍼센트 = new double[점수반영비율.length];
중간점수 = 학생성적정보_객체.get중간배열();
기말점수 = 학생성적정보_객체.get기말배열();
출석점수 = 학생성적정보_객체.get출석배열();
과제점수 = 학생성적정보_객체.get과제배열();

// 점수반영비율 설정
for (int i = 0; i < 점수반영비율.length; i++)
{
점수반영비율_퍼센트[i] = 점수반영비율[i] / 100.0;
}

// 총점 계산
for (int i = 0; i < 최대저장학생수; i++)
{
총점[i] = (int) ((중간점수[i] * 점수반영비율_퍼센트[0]) + (기말점수[i] * 점수반영비율_퍼센트[1]) 
+ (출석점수[i] * 점수반영비율_퍼센트[2]) + (과제점수[i] * 점수반영비율_퍼센트[3]));
}

return 총점;
}

// 총점에 따른 학점 계산
private String[] 학점계산(int[] 총점배열)
{
String[] 학점결과 = new String[최대저장학생수];
String[] 학점문자;
int[] 학점역치;

학점문자 = 점수적용자료_객체.get학점문자();
학점역치 = 점수적용자료_객체.get학점점수역치();

for (int i = 0; i < 최대저장학생수; i++) // i번째 학생에 대해
{

for (int j = 0; j < 학점역치.length; j++) // 학점 판단
{
// 학점 판단
if (총점배열[i] >= 학점역치[j])
{
학점결과[i] = 학점문자[j];
break;
}
}

if (학점결과[i] == null)
{
학점결과[i] = 학점문자[학점역치.length];
}
}

return 학점결과;
}

// 학생성적정보와의 상호작용
public void 학생성적자료_저장하기(String[] 학번, String[] 이름, int[] 중간, int[] 기말, int[] 출석, int[] 과제)
{
학생성적정보_객체.학생성적자료_저장하기(학번, 이름, 중간, 기말, 출석, 과제);
}

public String[] get학번배열() { return 학생성적정보_객체.get학번배열(); }
public String[] get이름배열() { return 학생성적정보_객체.get이름배열(); }
public String[] get학점배열() { return 학생성적정보_객체.get학점배열(); }
public int[] get중간배열() { return 학생성적정보_객체.get중간배열(); }
public int[] get기말배열() { return 학생성적정보_객체.get기말배열(); }
public int[] get출석배열() { return 학생성적정보_객체.get출석배열(); }
public int[] get과제배열() { return 학생성적정보_객체.get과제배열(); }
public int[] get총계배열() { return 학생성적정보_객체.get총계배열(); }
}
