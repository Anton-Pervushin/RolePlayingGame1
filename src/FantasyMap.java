public abstract class FantasyMap implements Fighter {
    private String name;
    private int healthPoints;
    private int strength;
    private int dexterity;
    private int xp;
    private int gold;

    public FantasyMap(String name, int healthPoints, int strength, int dexterity, int xp, int gold){
        this.setName(name);
        this.setHealthPoints(healthPoints);
        this.setStrength(strength);
        this.setDexterity(dexterity);
        this.setXp(xp);
        this.setGold(gold);
    }
    public int attack() {
        if (getDexterity() * 2 > getRandomValue()) return getStrength();
        else return  0;
    }

    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int getRandomValue(){
        return (int) (Math.random()*100);
    }

    public String toString(){
        return String.format("%s здоровье:%d", name, healthPoints);
    }
}
