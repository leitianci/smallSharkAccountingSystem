import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String log = "";//日志
        int balence = 0;//余额

        while(true){


            System.out.println("--------小鲨鱼记账系统--------");
            System.out.println("1.收入记录");
            System.out.println("2.支出记录");
            System.out.println("3.收支明细");
            System.out.println("4.退   出");
            System.out.println("请输入要选择的功能：");
            int choice = sc.nextInt();

            while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("输入错误，请选择正确的功能:");
                choice = sc.nextInt();
            }

            switch(choice){
                case 1:
                    System.out.println("请输入收入金额：");
                    int income = sc.nextInt();
                    balence += income;
                    System.out.println("请输入说明：");
                    String detail1 = sc.next();
                    log = log + "收入" +  income + "，明细：" + detail1  + "，余额：" + balence+ "\n";
                    break;
                case 2:
                    System.out.println("请输入收入金额：");
                    int outcome = sc.nextInt();
                    balence -= outcome;
                    System.out.println("请输入说明：");
                    String detail2 = sc.next();
                    log = log + "支出" +  outcome + "，明细：" + detail2 + "，余额：" + balence + "\n";
                    break;
                case 3:
                    System.out.println(log);
                    break;
                case 4:
                    System.out.println("是否退出:(y/n)");
                    String exit = sc.next();
                    if(exit.equals("y")){
                        return;
                    }
            }
        }



    }


}
