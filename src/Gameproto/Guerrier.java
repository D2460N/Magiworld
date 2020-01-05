package Gameproto;

public class Guerrier extends Player {

    public Guerrier(String playerOwner, int level, int force, int agility, int intelligence) {
        super(playerOwner, level, force, agility, intelligence);
    }

    @Override
    public void basicAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getBasicAttackName(), this.getForce());
        enemy.setVie(enemy.getVie() - this.getForce());
    }

    @Override
    public void specialAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getSpecialAttackName(), this.getForce());
        enemy.setVie(enemy.getVie() - this.getForce() * 2);
    }

    @Override
    String getDescription() {
        return "Je suis un guerrier";
    }

    @Override
    String getBasicAttackName() {
        return "Epée";
    }

    @Override
    String getSpecialAttackName() {
        return "Rage";
    }

}