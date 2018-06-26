package 기말;

public class 점수적용자료 {
private int[] 점수반영비율;
private int[] 학점점수역치;
private String[] 학점문자;

public 점수적용자료()
{
점수반영비율 = new int[]{30, 30, 10, 30};
// 비율 : 중간, 기말, 출석, 과제
// 중간비율 + 기말비율 + 출석비율 + 과제비율 = 100% 가 되도록 설정
학점점수역치 = new int[]{97, 94, 90, 87, 84, 80, 77, 74, 70, 67, 64, 60};
학점문자 = new String[]{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
// 학점 : A+, A0, A-, B+, B0, B-, C+, C0, C-, D+, D0, D-
}

// get
public int[] get점수반영비율() { return this.점수반영비율; }
public int[] get학점점수역치() { return this.학점점수역치; }
public String[] get학점문자() { return this.학점문자; }
}
