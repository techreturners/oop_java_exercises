package com.techreturners.cats;

interface Cat {
    public void eat();
    public void goToSleep();
    public void wakeUp();
    public Boolean isAsleep();
    public String getSetting();
}

class DomesticCat implements Cat {
    private Boolean asleep = false;
    private Integer height = 22;
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
}