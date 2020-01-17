package Gameproto;

public class Rodeur extends Player {

    public Rodeur(String playerOwner, int level, int force, int agility, int intelligence) {
        super(playerOwner, level, force, agility, intelligence);
    }

    @Override
    public void basicAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getBasicAttackName(), this.getAgility());
        enemy.setVie(enemy.getVie()-this.getAgility());
        System.out.printf("Il reste %d points de vie à l'adversaire. \n", enemy.getVie());
    }

    @Override
    public void specialAttack(Player enemy) {
        System.out.printf("%s utilise %s et reçoit %d points d'agilité.\n", this.getPlayerOwner(), this.getSpecialAttackName(), this.getAgility()*2);
        this.setAgility(this.getLevel()*2);
        System.out.printf("Il reste %d points de vie à l'adversaire. \n", enemy.getVie());
    }

    @Override
    String getDescription() {
        return "Je suis un rodeur ! Je tire mes pouvoirs de l'agilité, mon attaque basique est un tir à l'arc et mon attaque spéciale est la concentration !";
    }

    @Override
    String getBasicAttackName() {
        return " Tir à l’Arc";
    }

    @Override
    String getSpecialAttackName() {
        return "Concentration";
    }
}