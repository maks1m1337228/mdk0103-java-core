package Game;

import java.util.Scanner;

import static Game.Choice.*;


public class Menu {
        static void mainMenu() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Меню\n");
            System.out.println("1.Начать игру\n");
            System.out.println("2.Загрузить игру\n");
            System.out.println("3.Выйти\n");
            System.out.println("\nВаш выбор:");
             int choice = scanner.nextInt();
             mainMenuChoice(choice);

        }

        static void startGame() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга   Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду. - подумал Лисёнок.\n");
            System.out.println("Как поступить лисенку?\n");
            System.out.println("1.Вернуться домой\n");
            System.out.println("2.Отправиться на поиски\n");
            System.out.println("3.Показать меню");
            int choice = scanner.nextInt();
            startGameChoice(choice);
        }

        static void goHome() {
            System.out.println("Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга!\n");
            System.out.println("ВЫ ВЫИГРАЛИ");
        }

        static void goSearch() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.\n");
            System.out.println("1. Попытаться разузнать о Бельчонке у лесных жителей\n");
            System.out.println("2. Искать Бельчонка в одиночку\n");
            int choice = scanner.nextInt();
            goSearchChoice(choice);
        }

        static void questions() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Пока Лисёнок принимал решение, лесные жители разошлись кто куда.Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов\n" +
                    "Кого выбрать?\n");
            System.out.println("1. Расспросить Сову\n");
            System.out.println("2. Расспросить Волка");
            int choice = scanner.nextInt();
            questionsChoice(choice);
        }

        static void answerOwl() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.\n" +
                    " Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.\n");
            System.out.println("1. Поверить Сове и отправиться вглубь леса\n");
            System.out.println("2. Сове не стоит верить\n");
            int choice = scanner.nextInt();
            answerOwlChoice(choice);
        }

        static void soloSearch() {
            System.out.println("Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать.\n");
            System.out.println("ВЫ ПРОИГРАЛИ!");
        }
        static void answerWolf() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?\n");
            System.out.println("1.Волк прав");
            System.out.println("2.Волку не стоит верить");
            int choice = scanner.nextInt();
            answerWolfChoice(choice);


        }

        static void trustOwl() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.\n");
            System.out.println("1. Нет, потрачено слишком много времени, нужно идти дальше\n");
            System.out.println("2. Нужно воспользоваться шансом и раздобыть мёд\n");
            int choice = scanner.nextInt();
            trustOwlChoice(choice);

        }

        static void useChance() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел.\n" +
                    "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.");
            System.out.println("1. Подождать, вдруг пчёлы улетят\n");
            System.out.println("2. Нужно попытаться выкрасть мед немедленно");
            int choice = scanner.nextInt();
            useChanceChoice(choice);
        }

        static void kiteBees() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?");
            System.out.println("1. Поесть немного и передохнуть\n");
            System.out.println("2. Скорее отнести мёд Медвежонку\n");
            int choice = scanner.nextInt();
            kiteBeesChoice(choice);

        }
        static void stealHoney() {
            System.out.println("Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски.");
            System.out.println("ВЫ ПРОИГРАЛИ!");
        }
        static void giveHoney() {
            System.out.println("Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.\n");
            System.out.println("1. Медвежонок ничего не знает, нужно продолжить поиски\n");
            System.out.println("2. Может быть он прав и Лисёнок просто паникует\n");
        }
        static void eatAndRest() {
            System.out.println("Пока лисенок ел, злобные пчелы вернулись и покусали его");
            System.out.println("ВЫ ПРОИГРАЛИ!");
        }
}
