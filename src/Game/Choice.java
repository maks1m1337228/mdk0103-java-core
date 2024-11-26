package Game;


import static Game.Menu.*;

public class Choice {
    static void mainMenuChoice(int choice) {
        switch (choice) {
            case 1:
                startGame();
                break;
            case 2:
                System.out.println("В разработке");
                break;
            case 3:
                System.exit(0);
        }


    }

    static void startGameChoice(int choice) {
        switch (choice) {
            case 1:
                goHome();
                break;
            case 2:
                goSearch();
                break;
            case 3:
                mainMenu();
                break;
        }


    }

    static void goSearchChoice(int choice) {
        switch (choice) {
            case 1:
                questions();
                break;
            case 2:
                soloSearch();
                break;

        }
    }

    static void questionsChoice(int choice) {
        switch (choice) {
            case 1:
                answerOwl();
                break;
            case 2:
                answerWolf();
                break;
        }
    }

    static void answerOwlChoice(int choice) {
        switch (choice) {
            case 1:
                trustOwl();
                break;
            case 2:
                soloSearch();
                break;
        }
    }

    static void answerWolfChoice(int choice) {
        switch (choice) {
            case 1:
                goHome();
                break;
            case 2:
                soloSearch();
                break;
        }
    }

    static void trustOwlChoice(int choice) {
        switch (choice) {
            case 1:
                soloSearch();
                break;
            case 2:
                useChance();
                break;
        }
    }

    static void useChanceChoice(int choice) {
        switch (choice) {
            case 1:
                kiteBees();
                break;
            case 2:
                stealHoney();
                break;
        }
    }
    static void kiteBeesChoice(int choice) {
        switch (choice) {
            case 1:
                eatAndRest();
                break;
            case 2:
                giveHoney();
                break;
        }
    }

    static void giveHoneyChoice(int choice) {
        switch (choice) {
            case 1:
                soloSearch();
                break;
            case 2:
                goHome();
                break;
        }
    }







}
