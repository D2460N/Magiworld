package Gameproto;

public class Guerrier extends Player {

    public Guerrier(String playerOwner, int level, int force, int agility, int intelligence) {
        super(playerOwner, level, force, agility, intelligence);
    }

    @Override
    public void basicAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getBasicAttackName(), this.getForce());
        enemy.setVie(enemy.getVie() - this.getForce());
        System.out.printf("Il reste %d points de vie à l'adversaire. \n", enemy.getVie());
    }

    @Override
    public void specialAttack(Player enemy) {
        System.out.printf("%s utilise %s et inflige %d points de dommages.\n", this.getPlayerOwner(), this.getSpecialAttackName(), this.getForce());
        enemy.setVie(enemy.getVie() - this.getForce() * 2);
        System.out.printf("Il reste %d points de vie à l'adversaire. \n", enemy.getVie());
    }

    @Override
    String getDescription() {
        return "Je suis un guerrier ! Je tire mes pouvoirs de la force, mon attaque basique est un coup d'épée et mon attaque spéciale est ma rage !";
    }

    @Override
    String getBasicAttackName() {
        return "Coup d’Épée ";
    }

    @Override
    String getSpecialAttackName() {
        return "Coup de Rage";
    }

}