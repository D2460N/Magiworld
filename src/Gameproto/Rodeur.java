package Gameproto;

public class Rodeur extends Player {

    public Rodeur(String playerOwner, int level, int force, int agility, int intelligence) {
        super(playerOwner, level, force, agility, intelligence);
    }

    @Override
    public void basicAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getBasicAttackName(), this.getAgility());
        enemy.setVie(enemy.getVie()-this.getForce());
    }

    @Override
    public void specialAttack(Player enemy) {
        System.out.printf("%s utilise %s et reçoit %d points d'agilité.\n", this.getPlayerOwner(), this.getSpecialAttackName(), this.getAgility());
        this.setAgility(this.getLevel()*2);
    }

    @Override
    String getDescription() {
        return "Je suis un rodeur";
    }

    @Override
    String getBasicAttackName() {
        return "Arc";
    }

    @Override
    String getSpecialAttackName() {
        return "Concentration";
    }
}