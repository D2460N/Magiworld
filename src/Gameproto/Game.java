package Gameproto;

import java.util.Scanner;

public class Game {

    Player player1;
    Player player2;


    public void start() {
        createPlayer1();
        afficherPlayer1();
        createPlayer2();
        afficherPlayer2();
        //todo créer joueur1
        //todo récupérer joueur1
        //todo afficher joueur1
        //todo créer joueur2
        //todo récupérer joueur2
        //todo afficher joueur2
        //todo commencer le tour par tour : répéter jusqu'à ce qu'un des joueurs soit mort (do while) première instruction joueur 1 attaque joueur 2 puis joueur 2 attaque joueur 1 a la fin si aucun des joueur est mort
    }

    public void createPlayer1(){
        Scanner sc =  new Scanner(System.in);
        int role;
        int level;
        int force;
        int agility;
        int intelligence;
//todo  utilise do while pour vérifier chaque option
        //todo utiliser try catch pour valider le scanner

        System.out.println("Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");
        role = sc.nextInt();

        System.out.println("Veuillez entrer votre niveau");
        level = sc.nextInt();

        System.out.println("Veuillez entrer votre force");
        force = sc.nextInt();

        System.out.println("Veuillez entrer votre agilité");
        agility = sc.nextInt();

        System.out.println("Veuillez entrer votre intelligence");
        intelligence = sc.nextInt();

        if (role == 1){
            player1 = new Guerrier("1", level , force , agility , intelligence );
        } else if (role == 2){
            player1 = new Rodeur("1", level , force , agility , intelligence );
        } else if (role == 3){
            player1 = new Mage("1", level , force , agility , intelligence );
        }
    }

    public void afficherPlayer1(){
        System.out.println(player1.getDescription());
    }
}

    public void createPlayer2(){
        Scanner sc =  new Scanner(System.in);
        int role;
        int level;
        int force;
        int agility;
        int intelligence;
//todo  utilise do while pour vérifier chaque option
        //todo utiliser try catch pour valider le scanner

        System.out.println("Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");
        role = sc.nextInt();

        System.out.println("Veuillez entrer votre niveau");
        level = sc.nextInt();

        System.out.println("Veuillez entrer votre force");
        force = sc.nextInt();

        System.out.println("Veuillez entrer votre agilité");
        agility = sc.nextInt();

        System.out.println("Veuillez entrer votre intelligence");
        intelligence = sc.nextInt();

        if (role == 1){
            player2 = new Guerrier("2", level , force , agility , intelligence );
        } else if (role == 2){
            player2 = new Rodeur("2", level , force , agility , intelligence );
        } else if (role == 3){
            player2 = new Mage("2", level , force , agility , intelligence );
        }
    }

    public void afficherPlayer2(){
        System.out.println(player2.getDescription());
    }
}




//todo enlever list et map
    //todo avoir deux attributs joueur1 et joueur2 tout deux player/
    //todo pour la création de joueur il faut créer une fonction qui prend en paramètre un player


