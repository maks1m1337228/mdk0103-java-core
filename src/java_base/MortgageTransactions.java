package java_base;

public class MortgageTransactions {
        public static void main(String[] args) {

            String[] docs = {"Водительское", "Свидетельство", "Паспорт"};
            String[] clients = {"Вася", "Петя", "Олег"};

            if (docs.length != clients.length) {
                System.out.println("Ошибка");
            }
            else {
                System.out.println("Загружено");
                System.out.println(clients[0] + " предоставил " + docs[2]);
                System.out.println(clients[1] + " предоставил " + docs[0]);
                System.out.println(clients[2] + " предоставил " + docs[1]);
            }

        }
    }

