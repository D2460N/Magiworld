package Gameproto;

public abstract class Player {
    private String playerOwner;
    private int level;
    private int force;
    private int agility;
    private int intelligence;
    private int vie;
    private int viemax;

    public Player(String playerOwner, int level, int force, int agility, int intelligence) {
        this.playerOwner = playerOwner;
        this.level = level;
        this.force = force;
        this.agility = agility;
        this.intelligence = intelligence;
        this.vie = level * 5;
        this.viemax = vie;
    }

    public abstract void basicAttack(Player enemy);

    public abstract void specialAttack(Player enemy);


    /**
     * Character description
     *
     * @return w/ attributs
     */
    abstract String getDescription();

    /**
     * @return Basic attack name
     */
    abstract String getBasicAttackName();

    /**
     * @return Special attack name
     */
    abstract String getSpecialAttackName();


    public String getPlayerOwner() {
        return playerOwner;
    }

    public int getLevel() {
        return level;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getViemax() {
        return viemax;
    }


    public void setPlayerOwner(String playerOwner) {
        this.playerOwner = playerOwner;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


}