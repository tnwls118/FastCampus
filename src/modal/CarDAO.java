package modal;

import java.util.ArrayList;
import java.util.Scanner;

public class CarDAO {
    public static void main(String[] args) {
        ArrayList<carDTO> carArray = new ArrayList<>();
        int nextCarnumber = 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 입력문 예시 =====\n1.create\n2.update\n3.list\n4.delete\n5.break");
            System.out.print("명령문 입력:");
            String cdm = sc.nextLine();

            //차량 정보 생성
            if (cdm.equals("create")) {
                System.out.print("carname:");
                String carname = sc.nextLine();
                System.out.print("carcolor:");
                String carcolor = sc.nextLine();
                System.out.print("carmodel:");
                String carmodel = sc.nextLine();
                System.out.print("carkm:");
                int carkm = sc.nextInt();
                sc.nextLine();

                carDTO car = new carDTO();

                car.setCarName(carname);
                car.setCarColor(carcolor);
                car.setCarModel(carmodel);
                car.setKm(carkm);

                System.out.println(nextCarnumber+"번째 차량 정보가 등록되었습니다.");
                carArray.add(car);
                nextCarnumber++;
            }
            //list 기능 구현 필요
            //update 기능 구현 필요
            //delete 기능 구현 필요

            //반복문 종료
            else if (cdm.equals("break")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("등록된 명령문이 아닙니다.");
            }


        }
        sc.close();

    }
}
