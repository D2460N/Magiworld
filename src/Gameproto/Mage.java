package Gameproto;

public class Mage extends Player {

    public Mage(String playerOwner, int level, int force, int agility, int intelligence) {
        super(playerOwner, level, force, agility, intelligence);
    }

    @Override
    public void basicAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getBasicAttackName(), this.getIntelligence());
        enemy.setVie(enemy.getVie() - this.getIntelligence());
    }

    @Override
    public void specialAttack(Player enemy) {
        System.out.printf("%s utilise %s et reçoit %d points de vie.\n", this.getPlayerOwner(), this.getSpecialAttackName(), this.getVie());
        this.setVie(this.getVie() - this.getIntelligence() * 2);
    }

    @Override
    String getDescription() {
        return "Je suis un mage";
    }

    @Override
    String getBasicAttackName() {
        return "Boule de feu";
    }

    @Override
    String getSpecialAttackName() {
        return "Soin";
    }

}