package com.example;

import java.util.List;

public class AlexLion extends Lion {
    public AlexLion( Feline feline) throws Exception {
        super("Самец", feline);
    }
    public String getPlaceOfLiving(){return "Нью-Йоркский зоопарк" ;}

    public List<String> getFriend()  { return List.of("Марти", "Глория", "Мелман");

    }

    @Override
    public int getKittens() {
        return 0;
    }
}
