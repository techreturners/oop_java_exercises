package com.techreturners.cats;

interface Cat {
    public void eat();
    public void goToSleep();
    public void wakeUp();
    public Boolean isAsleep();
    public String getSetting();
    public Integer getAverageHeight();
}

class DomesticCat implements Cat {
    private Boolean asleep = false;
    private Integer height = 23;
    private String setting = "domestic";

    public Boolean isAsleep() {
        return asleep;
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    }

    public String getSetting() {
        return setting;
    }

    public Integer getAverageHeight() {
        return height;
    }
}