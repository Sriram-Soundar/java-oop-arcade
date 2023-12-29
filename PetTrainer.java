package Games.PetTrainer;

import Games.AGame;

import java.util.Scanner;

/**
 * @Sriram Soundarapandian
 * @version 1 
 */
public class PetTrainer extends AGame
{
    public PetTrainer(){
        super("PetTrainer");
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sriram's Pet Trainer Game!");
        System.out.println("What would you like to name your Cat?");
        String catName = scanner.nextLine();
        System.out.println("What color is your cat?");
        String catColor = scanner.nextLine();
        Cat playerCat = new Cat(catName, catColor);

        System.out.println("What would you like to name your Dog?");
        String dogName = scanner.nextLine();
        System.out.println("What breed is your dog?");
        String dogBreed = scanner.nextLine();
        Dog playerDog = new Dog(dogName, dogBreed);

        System.out.println("What would you like to name your Slime?");
        String slimeName = scanner.nextLine();
        Slime playerSlime = new Slime(slimeName, 0);

        int counter = 0;
        String catInput = null;
        String dogInput = null;
        String slimeInput = null;

        for(int i = 0; i < 5; i++){
            while(true) {
                System.out.println("Pick an action for your cat(walk or feed)");
                catInput = scanner.nextLine().toLowerCase();
                if((!((catInput.equals("walk")) || (catInput.equals("feed"))))) {
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue;
                }
                else {
                    break;
                }
            }
            pickAndRunAction(playerCat, catInput);

            while(true) {
                System.out.println("Pick an action for your dog(walk or feed)");
                dogInput = scanner.nextLine().toLowerCase();
                if((!((dogInput.equals("walk")) || (dogInput.equals("feed"))))) {
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue;
                }
                else {
                    break;
                }
            }
            pickAndRunAction(playerDog, dogInput);

            while(true) {
                System.out.println("Pick an action for your slime(walk or feed)");
                slimeInput = scanner.nextLine().toLowerCase();
                if((!((slimeInput.equals("walk")) || (slimeInput.equals("feed"))))) {
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue;
                }
                else {
                    break;
                }
            }
            pickAndRunAction(playerSlime, slimeInput);
        }
            /*do {
                System.out.println("Pick an action for your slime walk or feed)");
                try{
                    slimeInput = scanner.nextLine().toLowerCase();
                }catch(Exception e){
                    System.out.println("Input is not valid. Please choose walk or feed.");
                }
            }while((!((slimeInput.equals("walk")) || (slimeInput.equals("feed")))));
            pickAndRunAction(playerSlime, slimeInput);
        */


        int catTotal = playerCat.health + playerCat.happiness + playerCat.energy;
        int dogTotal = playerDog.health + playerDog.happiness + playerDog.energy;
        int slimeTotal = playerSlime.health + playerSlime.happiness + playerSlime.energy;
        if((catTotal > dogTotal) && (catTotal > slimeTotal)){
            System.out.println("Your cat wins!!!");
        }else if((dogTotal > catTotal) && (dogTotal > slimeTotal)){
            System.out.println("Your dog wins!!!");
        }else if((slimeTotal > catTotal) && (slimeTotal > dogTotal)){
            System.out.println("Your slime wins!!!");
        }else if((slimeTotal == catTotal) && (slimeTotal > dogTotal)){
            System.out.println("Your slime and cat have tied!");
        }else if((dogTotal == catTotal) && (dogTotal > slimeTotal)){
            System.out.println("Your dog and cat have tied!");
        }else if((dogTotal == slimeTotal) && (dogTotal > catTotal)){
            System.out.println("Your dog and slime have tied!");
        }else if((dogTotal == slimeTotal) && (dogTotal == catTotal)){
            System.out.println("All your pets have tied!!!");
        }
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sriram's Pet Trainer Game!");
        System.out.println("What would you like to name your Cat?");
        String catName = scanner.nextLine();
        System.out.println("What color is your cat?");
        String catColor = scanner.nextLine();
        Cat playerCat = new Cat(catName, catColor);

        System.out.println("What would you like to name your Dog?");
        String dogName = scanner.nextLine();
        System.out.println("What breed is your dog?");
        String dogBreed = scanner.nextLine();
        Dog playerDog = new Dog(dogName, dogBreed);

        System.out.println("What would you like to name your Slime?");
        String slimeName = scanner.nextLine();
        Slime playerSlime = new Slime(slimeName, 0);

        int counter = 0;
        String catInput = null;
        String dogInput = null;
        String slimeInput = null;

        for(int i = 0; i < 5; i++){
            while(true) { 
                System.out.println("Pick an action for your cat(walk or feed)");
                catInput = scanner.nextLine().toLowerCase();
                if((!((catInput.equals("walk")) || (catInput.equals("feed"))))) { 
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue; 
                }
                else { 
                    break; 
                } 
            }
            pickAndRunAction(playerCat, catInput);

            while(true) { 
                System.out.println("Pick an action for your dog(walk or feed)");
                dogInput = scanner.nextLine().toLowerCase();
                if((!((dogInput.equals("walk")) || (dogInput.equals("feed"))))) { 
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue; 
                }
                else { 
                    break; 
                } 
            }
            pickAndRunAction(playerDog, dogInput);

            while(true) { 
                System.out.println("Pick an action for your slime(walk or feed)");
                slimeInput = scanner.nextLine().toLowerCase();
                if((!((slimeInput.equals("walk")) || (slimeInput.equals("feed"))))) { 
                    System.out.println("Input is not valid. Please choose walk or feed.");
                    continue; 
                }
                else { 
                    break; 
                } 
            }
            pickAndRunAction(playerSlime, slimeInput);
        }
            /*do {
                System.out.println("Pick an action for your slime walk or feed)");
                try{
                    slimeInput = scanner.nextLine().toLowerCase();
                }catch(Exception e){
                    System.out.println("Input is not valid. Please choose walk or feed.");
                }
            }while((!((slimeInput.equals("walk")) || (slimeInput.equals("feed")))));
            pickAndRunAction(playerSlime, slimeInput);
        */
        

        int catTotal = playerCat.health + playerCat.happiness + playerCat.energy;
        int dogTotal = playerDog.health + playerDog.happiness + playerDog.energy;
        int slimeTotal = playerSlime.health + playerSlime.happiness + playerSlime.energy;
        if((catTotal > dogTotal) && (catTotal > slimeTotal)){
            System.out.println("Your cat wins!!!");
        }else if((dogTotal > catTotal) && (dogTotal > slimeTotal)){
            System.out.println("Your dog wins!!!");
        }else if((slimeTotal > catTotal) && (slimeTotal > dogTotal)){
            System.out.println("Your slime wins!!!");
        }else if((slimeTotal == catTotal) && (slimeTotal > dogTotal)){
            System.out.println("Your slime and cat have tied!");
        }else if((dogTotal == catTotal) && (dogTotal > slimeTotal)){
            System.out.println("Your dog and cat have tied!");
        }else if((dogTotal == slimeTotal) && (dogTotal > catTotal)){
            System.out.println("Your dog and slime have tied!");
        }else if((dogTotal == slimeTotal) && (dogTotal == catTotal)){
            System.out.println("All your pets have tied!!!");
        }
    }

    public static void pickAndRunAction(Pet pet, String action){
        if(action.equals("walk")){
            System.out.println(pet.walk());
        }else if(action.equals("feed")){
            System.out.println(pet.feed());
        }
    }
}
