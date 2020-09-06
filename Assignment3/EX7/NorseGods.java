package GS222MH_assign3.EX7;

public class NorseGods {
    private String name;
    private String race;
    private String desc;

    public NorseGods() {
    }

    public NorseGods(String name, String race, String desc) {
        setName(name);
        setRace(race);
        setDesc(desc);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }
}
