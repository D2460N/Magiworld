package Gameproto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    Player player1;
    Player player2;


    public void start() {
        createPlayer1();
        afficherPlayer1();
        createPlayer2();
        afficherPlayer2();
        commencerCombat();

    }

    public void createPlayer1() {
        Scanner sc = new Scanner(System.in);
        int role;
        int level;
        int force;
        int agility;
        int intelligence;

        do {

            do {

                System.out.println("Joueur1 Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");
                try {
                    role = sc.nextInt();
                } catch(InputMismatchException exception){
                    sc.nextLine();
                    role = -1;
                }
                if (role != 1 &&role != 2 &&role != 3)
                    System.out.println("Commande non prise en charge, Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");


            } while (role != 1 &&role != 2 &&role != 3);

            System.out.println("Joueur1 Veuillez entrer votre niveau");
            try {
                level = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                level = -1;
            }
            System.out.println("Joueur1 Veuillez entrer votre force");
            try {
                force = sc.nextInt();
            }catch(InputMismatchException exception){
                    sc.nextLine();
                    force = -1;
                }

            System.out.println("Joueur1 Veuillez entrer votre agilité");
            try {
            agility = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                agility = -1;
            }

            System.out.println("Joueur1 Veuillez entrer votre intelligence");
            try {
            intelligence = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                intelligence = -1;
            }
            if (level != force + agility + intelligence) {
                System.out.println("Il faut que la somme de la Force, de l'Agilité et de l'Intelligence soit égale au Niveau de votre personnage");

            }


        } while (level != (force + agility + intelligence));

        if (role == 1) {


            player1 = new Guerrier("1", level, force, agility, intelligence);
        } else if (role == 2) {
            player1 = new Rodeur("1", level, force, agility, intelligence);
        } else if (role == 3) {
            player1 = new Mage("1", level, force, agility, intelligence);
        }


    }

    public void afficherPlayer1() {
        System.out.println(player1.getDescription());
    }


    public void createPlayer2() {
        Scanner sc = new Scanner(System.in);
        int role;
        int level;
        int force;
        int agility;
        int intelligence;

        do {
            do {


                System.out.println("Joueur2 Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");
                try{
                role = sc.nextInt();
                }catch(InputMismatchException exception){
                    sc.nextLine();
                    role = -1;
                }

                if (role != 1 && role != 2 && role !=  3 ) {
                    System.out.println("Commande non prise en charge, Veuillez choisir parmis les options suivantes : 1-Guerrier 2-Rodeur 3-Mage ");
                }


            } while (role != 1 && role != 2 && role != 3 );

            System.out.println("Joueur2 Veuillez entrer votre niveau");
            try{
            level = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                level = -1;
            }

            System.out.println("Joueur2 Veuillez entrer votre force");
            try{
            force = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                force = -1;
            }

            System.out.println("Joueur2 Veuillez entrer votre agilité");
            try{
            agility = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                agility = -1;
            }

            System.out.println("Joueur2 Veuillez entrer votre intelligence");
            try{
            intelligence = sc.nextInt();
            }catch(InputMismatchException exception){
                sc.nextLine();
                intelligence = -1;
            }
            if (level != force + agility + intelligence) {
                System.out.println("Il faut que la somme de la Force, de l'Agilité et de l'Intelligence soit égale au Niveau de votre personnage");

            }

        } while (level != force + agility + intelligence);

        if (role == 1) {


            player2 = new Guerrier("2", level, force, agility, intelligence);
        } else if (role == 2) {
            player2 = new Rodeur("2", level, force, agility, intelligence);
        } else if (role == 3) {
            player2 = new Mage("2", level, force, agility, intelligence);
        }

    }


    public void afficherPlayer2() {
        System.out.println(player2.getDescription());
    }



    public void commencerCombat() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            do {
                System.out.println("Joueur1 Veuillez choisir une attaque les options suivantes : 1-Attaque Basique 2-Attaque Spéciale");
                try{
                choice = sc.nextInt();
                }catch(InputMismatchException exception){
                    sc.nextLine();
                    choice = -1;
                }
                if (choice == 1)
                    player1.basicAttack(player2);

                else if (choice == 2)
                    player1.specialAttack(player2);

                else if (choice != 1 &&choice != 2 )

                    System.out.println("Commande non prise en charge, Veuillez choisir parmis les options suivantes : 1-Attaque Basique 2-Attaque Spéciale");
            } while (choice != 1 && choice != 2 ) ;
            if (player2.getVie() <= 0){
                break;
            }
            do {
                System.out.println("Joueur2 Veuillez choisir une attaque les options suivantes : 1-Attaque Basique 2-Attaque Spéciale");
                try{
                choice = sc.nextInt();
                }catch(InputMismatchException exception){
                    sc.nextLine();
                    choice = -1;
                }
                if (choice == 1)
                    player2.basicAttack(player1);

                else if (choice == 2)
                    player2.specialAttack(player1);

                else if (choice != 1 &&choice != 2 )

                    System.out.println("Commande non prise en charge, Veuillez choisir parmis les options suivantes : 1-Attaque Basique 2-Attaque Spéciale");
            } while (choice != 1 && choice != 2 ) ;
            if (player1.getVie() <= 0){
                break;
            }
        } while (player1.getVie() > 0 && player2.getVie() > 0);
       if (player1.getVie() > 0)
           System.out.println("Bien joué Joueur1 vous avez gagné !");
       else
           System.out.println("Bien joué Joueur2 vous avez gagné !");
    }

}