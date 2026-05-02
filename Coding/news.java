package Coding;

import java.util.Scanner;

public class news {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a employ ID :");
        int emp0ID = in.nextInt();
        String employname = in.nextLine();
        switch (emp0ID) {
            case 1:
                System.out.println("emply no. is : 17");

                System.out.print("enter a empl dep  name :");
                employname = in.nextLine();
                switch (employname) {

                    case "EC":
                        System.out.println("ashu soni");
                        break;
                    case "CSE":
                        System.out.println("ansh soni");
                        break;
                    case "CIVIL":
                        System.out.println("harsh soni");
                        break;

                    default:
                        System.out.println("you enteried a wrong department name !!");
                        break;
                }
                break;
            case 2:
                System.out.println("emply no. is : 17");
                System.out.print("enter a empl dep  name :");
                employname = in.nextLine();
                switch (employname) {
                    case "EC":
                        System.out.println("ansh soni");
                        break;
                        case "CSE":
                        System.out.println("ashu soni");
                        break;
                    case "CIVIL":
                        System.out.println("harsh soni");
                        break;

                    default:
                        System.out.println("you enteried a wrong department name !!");
                        break;
                }

                break;

            case 3:
                System.out.println("emply no. is : 34658");
                System.out.print("enter a empl dep  name :");
                employname = in.nextLine();
                switch (employname) {
                    case "EC":
                        System.out.println("ashu soni");
                        break;
                    case "CSE":
                        System.out.println("ansh soni");
                        break;
                    case "CIVIL":
                        System.out.println("harsh soni");
                        break;

                    default:
                        System.out.println("you enteried a wrong department name !!");
                        break;
                }

                break;
            default:
                System.out.println("please enter a valid empID !!");
                break;
        }
    }
}
