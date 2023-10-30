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
                car.setNum(nextCarnumber);

                System.out.println(nextCarnumber + "번째 차량 정보가 등록되었습니다.");
                carArray.add(car);
                nextCarnumber++;
                //list 기능 구현 필요
            } else if (cdm.equals("list")) {
                if (carArray.isEmpty()) {
                    System.out.println("생성된 차량 정보가 없습니다.");
                } else {
                    for (int i = 0; i < carArray.size(); i++) {
                        System.out.println(carArray.get(i) + "\n");
                    }
                }
                //update 기능 구현 필요
            } else if (cdm.equals("update")) {
                System.out.print("수정을 원하는 게시물 번호를 입력:");
                int num = sc.nextInt();
                sc.nextLine();
                boolean correction = false;
                for (int i = 0; i < carArray.size(); i++) {
                    if (carArray.get(i).getNum() == num) {
                        System.out.print("carname:");
                        String carname = sc.nextLine();
                        System.out.print("carcolor:");
                        String carcolor = sc.nextLine();
                        System.out.print("carmodel:");
                        String carmodel = sc.nextLine();
                        System.out.print("carkm:");
                        int carkm = sc.nextInt();
                        sc.nextLine();

                        carDTO car = carArray.get(i);

                        car.setCarName(carname);
                        car.setCarColor(carcolor);
                        car.setCarModel(carmodel);
                        car.setKm(carkm);

                        System.out.println(num + "번 게시물을 수정하였습니다.");
                        carArray.set(i, car);

                        correction = true;
                    } else if (!correction) {
                        System.out.println("수정 요청한 게시물 num 찾을 수 없습니다.");
                    }
                }
            }
            //delete 기능 구현 필요

            //반복문 종료
            else if (cdm.equals("break")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("등록된 명령문이 아닙니다.");
            }


        }
        sc.close();

    }
}
