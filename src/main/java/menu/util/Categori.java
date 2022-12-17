package menu.util;

import camp.nextstep.edu.missionutils.Randoms;

public enum Categori {
    JAPAN(1, "일식"),
    KOREA(2, "한식"),
    CHINA(3, "중식"),
    ASIAN(4, "아시안"),
    WESTERN(5, "양식");


    private final int number;
    private final String name;

    Categori(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public static String getCategoriNameWithCode(int code) {
        for (Categori categori : Categori.values()) {
            if (categori.number == code) {
                return categori.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
