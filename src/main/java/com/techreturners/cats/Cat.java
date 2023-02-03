package com.techreturners.cats;

import java.util.Random;

interface Cat {

    boolean isAsleep();
    void goToSleep();
    void wakeUp();
    String getSetting();
    int getAverageHeight();
    String eat();

}

abstract class GenericCat implements Cat {
    private boolean isAsleep = false; // awake by default
    private int averageHeight = 0; // in cm

    String setting = "domestic";

    protected void setAverageHeight(int height) {
        averageHeight = height;
    }

    protected void setConditioning(String wildOrDomestic) {
        setting = wildOrDomestic;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    abstract public String eat();
}


class DomesticCat extends GenericCat {

    Random random = new Random();

    DomesticCat() {
        super.setAverageHeight(23);
        super.setConditioning("domestic");

    }

    public String eat() {

        int x = random.nextInt(10);
        if (x < 3)
            return ("It will do I suppose");
        // else
        return ("Purrrrrrr");
    }

}

class LionCat extends GenericCat {

    LionCat() {
        super.setAverageHeight(1100);
        super.setConditioning("wild");
    }
    public String eat() {
        return ("Roar!!!!");
    }

}

class CheetahCat extends GenericCat {
    CheetahCat() {
        super.setAverageHeight(12);
        super.setConditioning("wild");
    }
    public
    String eat() {
        return ("Zzzzzzz");
    }
}
