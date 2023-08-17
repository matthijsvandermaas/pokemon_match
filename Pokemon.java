public class Pokemon {
    String name;
    String type;
    int xp;
    String attack1;
    int attackHp1;
    String attack2;
    int attackHp2;

//constructor
    public Pokemon(String name, String type, int xp, String attack1, int attackHp1, String attack2, int attackHp2) {
        this.name = name;
        this.type = type;
        this.xp = xp;
        this.attack1 = attack1;
        this.attackHp1 = attackHp1;
        this.attack2 = attack2;
        this.attackHp2 = attackHp2;
    }
    // Getter and setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setAttack1(String attack1) {
        this.attack1 = attack1;
    }

    public void setAttackStrength1(int attackHp1) {
        this.attackHp1 = attackHp1;
    }

    public void setAttack2(String attack2) {
        this.attack2 = attack2;
    }

    public void setAttackStrength2(int attackHp2) {
        this.attackHp2 = attackHp2;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public int getXp() {
        return xp;
    }

    public String getAttack1() {
        return attack1;
    }

    public int getAttackHp1() {
        return attackHp1;
    }

    public String getAttack2() {
        return attack2;
    }

    public int getAttackHp2() {
        return attackHp2;
    }


}
