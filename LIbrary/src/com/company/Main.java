package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] library = new String[65];
        Welcomelibrary(library);
        initialise(library);
        while (true){
            librarymenu(library);
        }
    }
    public static void initialise(String[] library){

        for(int i = 1; i < 65; i++){
            library[i] = "r";

        }
    }
    public static void Welcomelibrary(String[] library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*--- Welcome to the MS Library ---*");
        System.out.println(" ");

        System.out.println("Do you member at the MS Library? (Y/N)");
        String member = scanner.nextLine();

        while (true){
            try {
                if (member.equals("Y")) {
                    System.out.print("Enter your first name : ");
                    String fname = scanner.next();
                    System.out.println("Enter your sure name :");
                    String surename = scanner.next();
                    System.out.println("Enter your ID number :");
                    int ID = scanner.nextInt();
                    break;


                }
                else {
                    System.out.println("Please register at the Library..");
                    System.out.println("Thanks for joining us..");
                    System.exit(0);
                    break;
                }
            }catch (InputMismatchException x){
                System.out.println("Invalid input");

            }
        }
    }
    public static void librarymenu(String[] library){

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to the MS Library Menu---");
        System.out.println(" ");
        System.out.println("A : The types of books we have");
        System.out.println("B : Authors' Nomenclature");
        System.out.println("C : hand over a book");
        System.out.println("D : Use of e-Library");
        System.out.println("E : View all seats in library");
        System.out.println("F : View empty seats");
        System.out.println("G : Carrying a book from the library");
        System.out.println("H : Store data into file");
        System.out.println("I : Load program data from file");
        System.out.println("J : Exit the library menu");
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Enter a letter :");

        String input = scanner.next().toLowerCase(Locale.ROOT);

        switch (input){

            case "a": typesofbooks(library);
                break;
            case "b": authors(library);
                break;
            case "c": handoverabook(library);
                break;
            case "d": useElibrary(library);
                break;
            case "e": allseats (library);
                break;
            case "f": emptyseats(library);
                break;
            case "g": carryabook(library);
                break;
            case "h": storeadata(library);
                break;
            case "i": loaddata(library);
                break;
            case "j": exit(library);
                break;
            default:
                System.out.println("Invalid input..!!");
        }

    }
    private static void typesofbooks(String[] library){

        Scanner scanner = new Scanner(System.in);
        System.out.println("--* The types of books we have *--");
        System.out.println(" ");

        System.out.println("A : Action and Adventure");
        System.out.println("B : Comic Book or Graphic Novel");
        System.out.println("C : Fantasy");
        System.out.println("D : Classics");
        System.out.println("E : Detective and Mystery");
        System.out.println("F : Horror");
        System.out.println("G : Historical Fiction");
        System.out.println("H : Literary Fiction");
        System.out.println("I : Romance");
        System.out.println("J : Short Stories");
        System.out.println("K : Memoir");
        System.out.println("L : Women's Fiction");
        System.out.println("M : Poetry");
        System.out.println("N : True Crime");
        System.out.println("O : Science Fiction");
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Enter a letter :");

        String input = scanner.next().toLowerCase(Locale.ROOT);
        switch (input) {
            case "a":
                System.out.println("-Action and Adventure-");
                System.out.println(" ");
                System.out.println("1) The Hunger Games");
                System.out.println("2) Harry Potter  ");
                System.out.println("3) The Sea of Monsters ");
                System.out.println("4) The Lost Hero");
                System.out.println("5) The Da Vinci Code");
                System.out.println("6) The Three Musketeers");
                System.out.println("7) Tarzan of the Apes");
                System.out.println("8) The Riddle of the Sands");
                System.out.println("9) Children of the Comet");
                System.out.println("10) The Call of the Wild");
                System.out.println("What do you choose?");
                String action = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "b":
                System.out.println("-Comic Book or Graphic Novel-");
                System.out.println(" ");
                System.out.println("1) Watchmen");
                System.out.println("2) Daytripper ");
                System.out.println("3) Blacksad ");
                System.out.println("4) Black Panther");
                System.out.println("5) Wonder Woman");
                System.out.println("6) The Walking Dead");
                System.out.println("7) Pluto");
                System.out.println("8) X-Men");
                System.out.println("9) All Star Superman");
                System.out.println("10) Batman");
                System.out.println("What do you choose?");
                String comic = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "c":
                System.out.println("-Fantasy-");
                System.out.println(" ");
                System.out.println("1) Game of Thrones");
                System.out.println("2) The Name of the Wind ");
                System.out.println("3) The Way of Kings");
                System.out.println("4) A Wizard of Earthsea");
                System.out.println("5) Assassin's Apprentice");
                System.out.println("6) The Colour of Magic");
                System.out.println("7) The Name of the Wind");
                System.out.println("8) Gardens of the Moon ");
                System.out.println("9) Prince of Thorns");
                System.out.println("10) The Black Company");
                System.out.println("What do you choose?");
                String fantasy = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "d":
                System.out.println("--Classics--");
                System.out.println(" ");
                System.out.println("1) Pride and Prejudice");
                System.out.println("2) To Kill a Mockingbird ");
                System.out.println("3) The Great Gatsby");
                System.out.println("4) Brave New World");
                System.out.println("5) I Capture The Castle");
                System.out.println("6) Jane Eyre");
                System.out.println("7) Crime and Punishment ");
                System.out.println("8) The Call of the Wild ");
                System.out.println("9) Persuasion");
                System.out.println("10) Wide Sargasso Sea");
                System.out.println("What do you choose?");
                String cassic = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "e":
                System.out.println("--Detective and Mystery--");
                System.out.println(" ");
                System.out.println("1) Gone Girl");
                System.out.println("2) The Big Sleep ");
                System.out.println("3) Woman In White");
                System.out.println("4) The Daughter of Time");
                System.out.println("5) The Day Of The Jackal");
                System.out.println("6) In The Woods");
                System.out.println("7) The Moonstone");
                System.out.println("8) Eye Of The Needle");
                System.out.println("9) Sharp Objects");
                System.out.println("10) The Detective");
                System.out.println("What do you choose?");
                String detective= scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "f":
                System.out.println("--Horror--");
                System.out.println(" ");
                System.out.println("1) The Haunting Of Hill House");
                System.out.println("2) Burnt Offerings");
                System.out.println("3) The Shining");
                System.out.println("4) House Of Leaves");
                System.out.println("5) The Elementals");
                System.out.println("6) The Woman In Black");
                System.out.println("7) Dracula");
                System.out.println("8) Young Goodman Brown");
                System.out.println("9) The Willows");
                System.out.println("10) I Am Legend");
                System.out.println("What do you choose?");
                String horror = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "g":
                System.out.println("--Historical Fiction--");
                System.out.println(" ");
                System.out.println("1) The Underground Railroad");
                System.out.println("2) In The Shadow Of The Banyan");
                System.out.println("3) Atonement");
                System.out.println("4) How Much of These Hills Is Gold");
                System.out.println("5) The Poisonwood Bible");
                System.out.println("6) The Name of the Rose");
                System.out.println("7) The Night Watchman");
                System.out.println("8) Things Fall Apart");
                System.out.println("9) The Rose Code");
                System.out.println("10) Vera");
                System.out.println("What do you choose?");
                String historycal = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "h":
                System.out.println("--Literary Fiction--");
                System.out.println(" ");
                System.out.println("1) The Kite Runner");
                System.out.println("2) The Secret History");
                System.out.println("3) The Vanishing Half");
                System.out.println("4) The Remains of the Day");
                System.out.println("5) The Handmaid's Tale");
                System.out.println("6) Cloud Cuckoo Land");
                System.out.println("7) The Shadow of the Wind");
                System.out.println("8) Cloud Cuckoo Land");
                System.out.println("9) Once There Were Wolves");
                System.out.println("10) Infinite Country");
                System.out.println("What do you choose?");
                String literary = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "i":
                System.out.println("--Romance--");
                System.out.println(" ");
                System.out.println("1) Jane Eyre");
                System.out.println("2) Anna Karenina");
                System.out.println("3) Love in the Time of Cholera ");
                System.out.println("4) North and South");
                System.out.println("5) Emma");
                System.out.println("6) Pride and Prejudice");
                System.out.println("7) The Princess Bride");
                System.out.println("8) Wuthering Heights");
                System.out.println("9) Romeo and Juliet");
                System.out.println("10) The Notebook ");
                System.out.println("What do you choose?");
                String romance = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "j":
                System.out.println("--Short Storiese--");
                System.out.println(" ");
                System.out.println("1) The Thing Around Your Neck");
                System.out.println("2) American Housewife");
                System.out.println("3) The Safety of Objects ");
                System.out.println("4) After the Quake");
                System.out.println("5) The King Is Always Above the People");
                System.out.println("6) The Largesse of the Sea Maiden");
                System.out.println("7) Sour Heart");
                System.out.println("8) Stories of Your Life and Others");
                System.out.println("9) The Boat");
                System.out.println("10) Tenth of December");
                System.out.println("What do you choose?");
                String storiese = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "k":
                System.out.println("--Memoire--");
                System.out.println(" ");
                System.out.println("1) Educated by Tara Westover");
                System.out.println("2) Priestdaddy by Patricia Lockwood");
                System.out.println("3) Becoming by Michelle Obama");
                System.out.println("4) Everything I Know About Love by Dolly Alderton");
                System.out.println("5) Know My Name by Chanel Miller");
                System.out.println("6) The Lonely City by Olivia Laing");
                System.out.println("7) Set the Boy Free");
                System.out.println("8) Red Notice");
                System.out.println("9) The Moon’s a Balloon");
                System.out.println("10) Fun Home");
                System.out.println("What do you choose?");
                String memoire = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "l":
                System.out.println("--Women's Fiction--");
                System.out.println(" ");
                System.out.println("1) Americanah");
                System.out.println("2) Everything I Never Told You");
                System.out.println("3) The Goldfinch");
                System.out.println("4) Land of Love and Drowning");
                System.out.println("5) Bad Feminist");
                System.out.println("6) Boy, Snow, Bird");
                System.out.println("7) Her");
                System.out.println("8) The Lifeboat");
                System.out.println("9) Swamplandia");
                System.out.println("10) Ten Thousand Saints");
                System.out.println("What do you choose?");
                String ficition= scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "m":
                System.out.println("--Poetry--");
                System.out.println(" ");
                System.out.println("1) And Still I Rise");
                System.out.println("2) Leaves of Grass");
                System.out.println("3) Selected Poems");
                System.out.println("4) The Essential Rumi");
                System.out.println("5) Robert Frost's Poems");
                System.out.println("6) These are the Hands");
                System.out.println("7) Mary Wants to be a Superwoman");
                System.out.println("8) The Sun and Her Flowers ");
                System.out.println("9) Calling a Wolf a Wolf");
                System.out.println("10) The Wild Fox of Yemen");
                System.out.println("What do you choose?");
                String poetry = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "n":
                System.out.println("--True Crime--");
                System.out.println(" ");
                System.out.println("1) In Cold Blood");
                System.out.println("2) Helter Skelter");
                System.out.println("3) The Stranger Beside Me");
                System.out.println("4) Zodiac");
                System.out.println("5) The Journalist and the Murderer");
                System.out.println("6) Midnight in the Garden of Good and Evil");
                System.out.println("7) Shot in the Heart");
                System.out.println("8) My Dark Places ");
                System.out.println("9) The Run of His Life");
                System.out.println("10) Billion Dollar Whale");
                System.out.println("What do you choose?");
                String crime = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case  "o":
                System.out.println("--Science Fiction--");
                System.out.println(" ");
                System.out.println("1) The War of the Worlds");
                System.out.println("2) Frankenstein");
                System.out.println("3) The Modern Prometheus");
                System.out.println("4) Nineteen Eighty-Four");
                System.out.println("5) Fahrenheit 451");
                System.out.println("6) Brave New World");
                System.out.println("7) The Time Machine");
                System.out.println("8) The Invisible Man");
                System.out.println("9) A Wrinkle in Time ");
                System.out.println("10) Men in Black 3");
                System.out.println("What do you choose?");
                String science = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

        }

    }
    private static void authors(String[] library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--* Select a book by author name *--");
        System.out.println(" ");

        System.out.println("A : William Shakespeare");
        System.out.println("B : Agatha Christie");
        System.out.println("C : J. K. Rowling");
        System.out.println("D : Gilbert Patten");
        System.out.println("E : Robert Ludlum");
        System.out.println("F : Sir Arthur Conan Doyle");
        System.out.println("G : EL James");
        System.out.println("H : Evan Hunter");
        System.out.println("I : Robin Cook");
        System.out.println("J : Denise Robins");

        String input = scanner.next().toLowerCase(Locale.ROOT);
        switch (input) {
            case "a":
                System.out.println("-William Shakespeare-");
                System.out.println(" ");
                System.out.println("1) Hamlet");
                System.out.println("2) Romeo and Juliet");
                System.out.println("3) King Lear");
                System.out.println("4) Julius Caesar");
                System.out.println("5) As You Like It");
                System.out.println("What do you choose?");
                String william = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "b":
                System.out.println("-Agatha Christie-");
                System.out.println(" ");
                System.out.println("1) Murder on the Orient Express");
                System.out.println("2) And Then There Were None");
                System.out.println("3) Five Little Pigs");
                System.out.println("4) A Murder is Announced");
                System.out.println("5) The ABC Murders");
                System.out.println("What do you choose?");
                String agatha = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");

                break;

            case "c":
                System.out.println("-J. K. Rowling-");
                System.out.println(" ");
                System.out.println("1) Harry Potter and the Philosopher's Stone");
                System.out.println("2) A Tale of Two Cities");
                System.out.println("3) The Little Prince");
                System.out.println("4) Dream of the Red Chamber");
                System.out.println("5) fantastic beasts and where to find them");
                System.out.println("What do you choose?");
                String rowling = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "d":
                System.out.println("-Gilbert Patten-");
                System.out.println(" ");
                System.out.println("1) Frank Merriwell at Yale");
                System.out.println("2) Boltwood of Yale");
                System.out.println("3) Dime Novel Mormons");
                System.out.println("4) The Boy From the West");
                System.out.println("5) The Call of the Varsity");
                System.out.println("What do you choose?");
                String patten = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "e":
                System.out.println("-Robert Ludlum-");
                System.out.println(" ");
                System.out.println("1) The Scarlatti Inheritance");
                System.out.println("2) The Osterman Weekend");
                System.out.println("3) Trevayne");
                System.out.println("4) The Cry of the Halidon");
                System.out.println("5) The Road to Gandolfo");
                System.out.println("What do you choose?");
                String robert = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "f":
                System.out.println("-Sir Arthur Conan Doyle-");
                System.out.println(" ");
                System.out.println("1) Mysteries and Adventures");
                System.out.println("2) The Adventures of Sherlock Holmes");
                System.out.println("3) The Last Galley");
                System.out.println("4) Danger! and Other Stories");
                System.out.println("5) Three of Them");
                System.out.println("What do you choose?");
                String doyle = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "g":
                System.out.println("-EL James-");
                System.out.println(" ");
                System.out.println("1) Fifty Shades of Grey");
                System.out.println("2) Fifty Shades Darker");
                System.out.println("3) Fifty Shades Freed");
                System.out.println("4) Fifty Shades of Grey as Told by Christian ");
                System.out.println("5) Fifty Shades Darker as Told by Christian");
                System.out.println("What do you choose?");
                String james = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "h":
                System.out.println("-Evan Hunter-");
                System.out.println(" ");
                System.out.println("1) Find The Feathered Serpent");
                System.out.println("2) Don't Crowd Me");
                System.out.println("3) Runaway Black");
                System.out.println("4) Cut Me In");
                System.out.println("5) The Pusher");
                System.out.println("What do you choose?");
                String evan = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "i":
                System.out.println("-Robin Cook-");
                System.out.println(" ");
                System.out.println("1) Coma");
                System.out.println("2) Pndemic");
                System.out.println("3) Viral");
                System.out.println("4) Toxin");
                System.out.println("5) outbreak");
                System.out.println("What do you choose?");
                String cook = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

            case "j":
                System.out.println("-Denise Robins-");
                System.out.println(" ");
                System.out.println("1) Christmas Roses");
                System.out.println("2) The Marriage Bond ");
                System.out.println("3) The Dark Death");
                System.out.println("4) The Tiger in Men");
                System.out.println("5) Since We Love");
                System.out.println("What do you choose?");
                String robins = scanner.next().toLowerCase(Locale.ROOT);
                System.out.println(" ");
                break;

        }
    }
    private static void handoverabook(String[] library) {
        Scanner scanner = new Scanner(System.in);
        boolean books = false;
        System.out.println("--Return of  Books--");
        System.out.println(" ");
        System.out.println("Name of the person who obtained the books:");
        String person = scanner.next().toLowerCase(Locale.ROOT);
        for (int i = 1; i < 2; i++){
            if (library[i].toLowerCase(Locale.ROOT).equals(person)) {
                library[i] = "r";
                books = true;
                break;
            }
        }
        if (!books){
            System.out.println("Plz enter your correct name..");
        }
        System.out.println("How many books did you buy?");
        int buybooks =scanner.nextInt();
        System.out.println("What books were bought?");
        String boooks = scanner.next().toLowerCase(Locale.ROOT);
        System.out.println("When did you pick up the book?");
        int pick = scanner.nextInt();
        System.out.println("The day you return the books?");
        int retrn = scanner.nextInt();
        System.out.println("You have correctly completed the book delivery process...");
        System.out.println("Thanks for joining us..");

    }
    private static void useElibrary(String[] library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Welcome to the e-library-");
        System.out.println("");
        System.out.println("What do you choose?");

        System.out.println("A : Rules in the e-Library");
        System.out.println("B : Are you entering the e-library?");
        System.out.println("C : All seats in the e-Library");
        System.out.println("D : Show empty seats in the e-library");
        System.out.println("E : The amount you have to pay");
        System.out.println(" ");
        System.out.println("Enter a letter :");

        String input = scanner.next().toLowerCase(Locale.ROOT);

        switch (input){
            case "a" :
                System.out.println(" -MS E Library Rules-");
                System.out.println("");
                System.out.println(" * Please use audio equipment");
                System.out.println(" * Use only one computer per person");
                System.out.println(" * Wait only for the relevant period of time");
                System.out.println(" * Avoid playing computer games or fun games");
                System.out.println(" * Inform the staff before using the Internet");
                System.out.println(" * Using obscene or abusive language or gestures are strictly discouraging.");
                System.out.println(" * e-Library Punjab is a reference library. No library item can be checked out");
                System.out.println(" * Keep your mobiles switched-off or on silent mode within the library premises.");
                System.out.println(" * Do not change configuration of computers or any other equipment in the library.");
                System.out.println(" * Photography and recording are not allowed on Library premises without prior permission.");
                break;

            case "b":
                System.out.println("-Welcome to the e-library-");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println(" Are you entering the e-library? (Y/N)");
                String elibrary = scanner1.nextLine();

                while (true){
                    try {
                        System.out.println("Seat number where you sit :");
                        int seat_no = scanner.nextInt();
                        if (1<= seat_no && seat_no <= 15) {
                            if (seat_no == 15){
                                break;
                            }

                        if (elibrary.equals("Y")){
                            if (library[seat_no].equals("r")){
                            System.out.println("Enter your name :");
                            String ename = scanner.next();
                            library[seat_no] = ename;
                            }

                            System.out.println("Enter your library no:");
                            int l_no = scanner1.nextInt();
                            System.out.println("Enter your ID card no:");
                            int ID = scanner1.nextInt();

                            System.out.println("Did you read the Rules?(Y/N>)");
                            String rulses = scanner.next();
                            if (rulses.equals("Y")){
                                System.out.println("Would you like to stay in the e-library for a while?");
                                int time = scanner.nextInt();
                                System.out.println("Ok..You can use it now... ");
                                System.out.println(" ");
                                break;
                            }
                        }
                            else {
                                System.out.println("Please read the rules and regulations");
                            }
                        }
                        else {
                            System.out.println("Thanks for joining us..");
                            break;
                        }
                    }catch (InputMismatchException x){
                        System.out.println("Invalid Input");
                        break;
                         }
                    }
                break;

            case "c":
                System.out.println("-All seats in the e-Library-");
                System.out.println(" ");

                for (int i = 0 ; i < 15; i++){
                    library[i] = "r";
                    if (library[i].equals("r")){
                        System.out.println("Seat " + "is empty");
                    }
                    else {
                        System.out.println("Seats " + i + ": " + library[i]);
                        }
                    }
                break;

            case "d":
                System.out.println("-empty seats in the e-library-");
                System.out.println("");

                for (int i = 1; i < 16; i++) {
                    if (library[i].equals("r")) {
                        System.out.println("Seats " + i + " is empty ");
                      }
                    else {
                        System.out.println("Seats " + i + " :" + library[i]);
                    }

                   }

            case "e":
                System.out.println("-The amount you have to pay-");
                System.out.println(" ");
                System.out.println("* Charges rs.100 per hour");

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("How much money do you have?");
                int money = scanner2.nextInt();

                if (money <= 100 ){
                    System.out.println("You can use e-library for 1 hour..");
                    System.out.println(" ");
                }
                else if (money <= 200 && money > 100){
                    System.out.println("You can use e-library for 2 hour..");
                    System.out.println(" ");
                }
                else if (money <= 300 && money > 200){
                    System.out.println("You can use e-library for 3 hour..");
                    System.out.println(" ");
                }
                else if (money <= 400 && money > 300){
                    System.out.println("You can use e-library for 4 hour..");
                    System.out.println(" ");
                }
                else if (money <= 500 && money > 400){
                    System.out.println("You can use e-library for 5 hour..");
                    System.out.println(" ");
                }
                else if (money <= 10000 && money > 500){
                    System.out.println("The maximum time that can be used is 5 hours..");
                    System.out.println(" ");
                }
                else {
                    System.out.println("Your money is not enough..");
                    System.out.println(" ");
                   }
                }
             }


    private static void allseats(String[] library){
        System.out.println("--* View all seats in library *--");
        System.out.println(" ");

        for (int i = 1; i < 65; i++) {
            if (library[i].equals("r")) {
                System.out.println("Seats " + i );
            }
            else {
                System.out.println("Seats " + i + " :" + library[i]);
            }

        }

    }

    private static void emptyseats(String[] library){
        System.out.println("--* empty seats in the library *--");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Seat number where you sit :");
                int seat_num = scanner.nextInt();
                if (1 <= seat_num && seat_num <= 65) {
                    if (seat_num == 65) {
                        break;
                    }

                    if (library[seat_num].equals("r")){
                        System.out.println("Enter your name :");
                        String name = scanner.next();
                        library[seat_num] = name;
                        break;
                    }
                    else {
                        System.out.println("plz enter a letters..");
                    }
                }
                else {
                    System.out.println("We have 65 seats. Try another one..");
                }

            } catch (InputMismatchException x){
                System.out.println("There is one..");
                System.out.println("You can try another one..");
                break;

            }
        }

        for (int i = 1; i < 65; i++) {
            if (library[i].equals("r")) {
                System.out.println("Seats " + i + " is empty ");
            }
            else {
                System.out.println("Seats " + i + " :" + library[i]);
            }

        }
    }

    private static void carryabook(String[] library) {
        System.out.println("--* Carry A Book *--");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the book you are carrying?");
        String carry = scanner.next();
        System.out.println("Date of receipt of the book?");
        int date = scanner.nextInt();
        System.out.println("Date the book is returned?");
        int retrn = scanner.nextInt();
        System.out.println("A book can only be kept for 14 days");
        System.out.println("How many diaries did you keep?");
        int keep = scanner.nextInt();

        if (keep <= 15) {
            if (keep == 15) {
                System.out.println("You do not have to pay a fine...");
            }
        }
        else if (keep <= 18 && keep > 16) {
            System.out.println("It is 2 days late to deliver the book to you..");
            System.out.println("Therefore you have to pay a fine of rs.50/-");
            System.out.println(" ");
        }
        else if (keep <= 20 && keep > 18) {
            System.out.println("It is 4 days late to deliver the book to you..");
            System.out.println("Therefore you have to pay a fine of rs.75/-");
            System.out.println(" ");
        }
        else if (keep <= 22 && keep > 20) {
            System.out.println("It is 6 days late to deliver the book to you..");
            System.out.println("Therefore you have to pay a fine of rs.100/-");
            System.out.println(" ");
        }

        else if (keep <= 25 && keep > 22) {
            System.out.println("It is 8 days late to deliver the book to you..");
            System.out.println("Therefore you have to pay a fine of rs.120/-");
            System.out.println(" ");
        }

        else {
            System.out.println("Your library account will be invalid..");
        }

    }




    private static void storeadata(String[] library){
        try {

            FileWriter myWriter = new FileWriter("Details.txt");
            for (int i = 1; i < 13; i++) {
                myWriter.write("Cabin : " + i + "    " + "Passengers Name : ");
                if(!library[i].equals("e")) {
                    myWriter.write(library[i]);
                }
                else {
                    myWriter.write("empty cabin");
                }

                myWriter.write(System.lineSeparator());
            }
            myWriter.close();
            System.out.println("Data successfully saved");

        } catch (IOException x ) {
            System.out.println("Error!!" + x );
        }

    }
    private static void loaddata(String[] library){
        try {

            File file = new File("Details.txt");
            Scanner readFile = new Scanner(file);
            while (readFile.hasNext()) {
                System.out.println(readFile.nextLine());
            }

            System.out.println("----------------------------------------------");
        } catch (IOException x) {
            System.out.println("Error! " + x );
        }
    }

    private static void exit(String[] library){
            System.out.println("Thanks for joining us...");
            System.out.println("See you again..");
            System.exit(0);
        }
   }

