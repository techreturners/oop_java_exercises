package com.techreturners.cats;

interface Cat {
    public void eat();
    public void goToSleep();
    public void wakeUp();
    public Boolean isAsleep();
}

class DomesticCat implements Cat {
    private Boolean asleep = false;
    private Integer height = 22;

    public Boolean isAsleep() {
        return asleep;
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    }
}