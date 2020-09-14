package com.techreturners.cats;

interface Cat {
    public void goToSleep();
    public void wakeUp();
    public Boolean isAsleep();
    public String getSetting();
    public Integer getAverageHeight();
    public String eat();
}
abstract class AbstractCat implements Cat {
    private Boolean asleep = false;
    private Integer height;
    private String setting;
    private String eatResponse;

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

    public String eat() {
        return eatResponse;
    }

    public AbstractCat(int height, String setting, String eatResponse) {
        this.height = height;
        this.setting = setting;
        this.eatResponse = eatResponse;
    }
}