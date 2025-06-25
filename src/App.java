import java.util.Scanner;

class App {
    void run() {
        System.out.println("== 명언 앱 ==");

        int lastQuotationId = 0;

        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String authorName = scanner.nextLine();

                lastQuotationId++;

                int id = lastQuotationId;

                Quotaion quotation = new Quotaion(id, content, authorName);

                System.out.printf("%d번 명언이 등록 되었습니다.\n", lastQuotationId);
            }
        }
    }
}


