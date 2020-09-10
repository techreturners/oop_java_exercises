package com.techreturners.cats;

interface Cat {
    public void goToSleep();
    public void wakeUp();
    public Boolean isAsleep();
    public String getSetting();
    public Integer getAverageHeight();
    public String eat();
}

class BasicCat implements Cat {
    protected Boolean asleep;
    protected Integer height;
    protected String setting;
    protected String eatSound;

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
        return eatSound;
    }
}

class DomesticCat extends BasicCat {
    this.asleep = false;
    this.height = 23;
    this.setting = "domestic";
    this.eatSound = "Purrrrrrr";
}

class LionCat extends BasicCat {
    private Boolean asleep = false;
    private Integer height = 1100;
    private String setting = "wild";
    private String eatSound = "Roar!!!!";
}

class CheetahCat extends BasicCat {
    private Boolean asleep = false;
    private Integer height = 1100;
    private String setting = "wild";
    private String eatSound = "Zzzzzzz";
}