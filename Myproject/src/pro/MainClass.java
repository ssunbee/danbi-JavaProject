package pro;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {


        // TODO Auto-generated constructor stub
        DAO test = new DAO();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----회 원 관 리 프 로 그 램---");
            System.out.println("    1. 회원정보 입력         ");
            System.out.println("    2. 회원정보 삭제         ");
            System.out.println("    3. 회원정보 검색         ");
            System.out.println("    4. 회원정보 수정         ");
            System.out.println("    5. 회원 목록 보기        ");
            System.out.println("    6. 파일로 저장하기        ");
            System.out.println("    7. 회원정보 파일 불러오기  ");
            System.out.println("    0. 종료                 ");
            System.out.println(" --------------------------");

            System.out.print("번호를 선택하세요>> ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                choice = -1;
            }

            if (choice == 1) {
                test.userInsert();
            } else if (choice == 2) {
                test.userDelete();
            } else if (choice == 3) {
                test.userSelect();
            } else if (choice == 4) {
                test.userUpdate();
            } else if (choice == 5) {
                test.printAll();
            } else if (choice == 6) {
                try {
                    test.dataSave();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (choice == 7) {
                test.dataLoad();
            } else if (choice == 0) {
                System.out.println("종료합니다.");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("잘못 선택했습니다.");
            }

        }


    }
}