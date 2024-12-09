package Collections;

public class MessagesData {
    static String[] statuses = {"LOW", "MEDIUM", "HIGH", "ИЧИБАН"};
    static String[] codes = {"ZV", "SVO", "ZOV", "V", "GOIDA"};
    static String[] texts = {"Привет", "Как дела", "Вот ар ю дуинг", "Лешка Скут", "Ваташива Чифу дес", "ВАЦАОНИМА"};

    public MessagesData(String[] statuses, String[] codes, String[] texts) {
        this.statuses = statuses;
        this.codes = codes;
        this.texts = texts;
    }
}
