package view;

import controller.MemeTokenController;
import controller.TechTokenController;

import java.util.Scanner;

public class TokenManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private MemeTokenController memeTokenController = new MemeTokenController();
    private TechTokenController techTokenController = new TechTokenController();

    public void manageMainMenu() {
        do {
            System.out.println("-----CHUONG TRINH QUAN LY GIAO DICH TOKEN-----\n" +
                    "1.Quan ly giao dich Token cong nghe.\n" +
                    "2.Quan ly giao dich Token meme.\n" +
                    "3.Ket thuc chuong trinh.\n" +
                    "Nhap vao muc can chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Quan ly giao dich Token cong nghe.");
                    break;
                case 2:
                    System.out.println("Quan ly giao dich Token meme.");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui long chon lai!");
            }
        } while (true);

    }

    public void manageMemeTokenMenu() {
        do {
            System.out.println("----Quan ly giao dich Token meme----" +
                    "1.Hien thi danh sach giao dich.\n" +
                    "2.Them moi giao dich.\n" +
                    "3.Chinh sua giao dich.\n" +
                    "4.Xoa giao dich.\n" +
                    "5.Quay lai menu chinh.\n" +
                    "6.Ket thuc chuong trinh.\n" +
                    "Nhap vao muc can chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    memeTokenController.getAll();
                    break;
                case 2:
                    memeTokenController.addMemeToken();
                case 3:
                    memeTokenController.updateMemeToken();
                case 4:
                    System.out.println("Xoa giao dich");
            }
        } while (true);
    }

    public static void main(String[] args) {
        TokenManagement tokenManagement = new TokenManagement();
        tokenManagement.manageMainMenu();
    }
}
