package currencyConverter;
import java.util.Scanner;
public class main {
public static void main(String[] args){
    
    Boolean passed = false;
        Boolean firstStage = false;
        Boolean secondStage = false;
        Boolean glitch = false;

        Scanner captcha = new Scanner(System.in);

        System.out.println(
                "Ethan is a second-year medical student struggling to keep up with the demanding coursework, feeling overwhelmed by failure and the pressure to live up to his family's expectations.\n");
        System.out.println(
                "Samantha now in her mid-40s, she wakes up each day feeling trapped in a cycle she cant escape. Her job is slipping, her relationships are strained, and the weight of her addiction is a constant shadow over her life.\n");
        System.out.println(
                "Viktor appeared to be a kind and trustworthy person, but secretly, he manipulated those around him to gain power, carefully hiding his true intentions behind a facade of generosity.\n");
        System.out.println(
                "Dominic, an extremely wealhy individual who promised to give you 70% of his life savings if you save his life.\n");

        System.out.println("        Trolley");
        System.out.println("           |");
        System.out.println("           v");
        System.out.println("       ---------");
        System.out.println("       |       |");
        System.out.println("       v       v");
        System.out.println("     Ethan   Samantha");
        System.out.println("             Viktor");
        System.out.println("             Dominic");

        System.out.println();
        System.out.println("   option 1   option 2\n");

        System.out.println("To prove that you are a human you must solve this test by choosing option 1 or \n");
        System.out.println("read their backstories above the drawing");

        System.out.println("Type 1 or 2 depending on which option you choose\n");
        System.out.print("Your input: ");
        byte answer1 = captcha.nextByte();

        if (answer1 == 1) {
            firstStage = true;
        } else if (answer1 == 2) {
            firstStage = false;
        } else {
            System.out.println("Invalid input you failed the test.");
            passed = false;
        }

        System.out.println("  ------------------------  ");

        if (firstStage) {

            System.out.println(
                    "\nA year later, Ethan is struggling less academically, seeking support, and slowly rediscovering his passion for medicine, though the path remains challenging.\n");
            System.out.println(
                    "Lena, Ethan's old classmate now suffering from poverty to support her younger brother Julian.\n");
            System.out.println(
                    "Julian, chose a life of reckless independence and adventure, but his struggles with addiction and responsibility have distanced him from the family.\n");

            System.out.println();

            System.out.println("        Trolley");
            System.out.println("           |");
            System.out.println("           v");
            System.out.println("       ---------");
            System.out.println("       |       |");
            System.out.println("       v       v");
            System.out.println("     Ethan   Lena");
            System.out.println("             Julian");

            System.out.println();
            System.out.println("   option 1   option 2\n");

            System.out.println("Stage 2");

            System.out.print("Your input: ");
            byte answer2 = captcha.nextByte();

            if (answer2 == 1) {
                secondStage = true;
            } else if (answer2 == 2) {
                secondStage = false;
            } else {
                System.out.println("Invalid input you failed the test.");
                passed = false;
            }
        } else {
            System.out
                    .println("\nViktor killed Dominic and took all of his money that he was supposed to give to you.");
            System.out.println(
                    "Now that you saw him again in a similiar predicament, you can take revenge or choose not to. The choice is yours.");

            System.out.println("        Trolley");
            System.out.println("           |");
            System.out.println("           v");
            System.out.println("       ---------");
            System.out.println("       |       |");
            System.out.println("       v       v");
            System.out.println("     Viktor Homeless Kid");
            System.out.println("            A Priest");
            System.out.println("            hundredths of");
            System.out.println("            other people");

            System.out.println();
            System.out.println("   option 1   option 2\n");

            System.out.println("Final Stage");

            System.out.print("Your input: ");
            byte answer999 = captcha.nextByte();

            glitch = true;
            System.out.println(
                    "\nYou quickly found out that your choice never mattered, you felt something cold touch the back of your head.");
            System.out.println("\"Kill father and I'll shoot.\" those words sent chills down your spine.");
            System.out.println(
                    "You were forced to watch hundredths of people die because of your actions, this made you fall into the pits of despair forever regretting your decision.\n");
            System.out.println("you failed the test.");
            passed = false;
        }

        System.out.println("  ------------------------  ");

        if (secondStage) {
            System.out.println(
                    "\nEthan woke up in a familliar sight, he had been through this multiple times and he is confident you will choose him again.");
            System.out.println(
                    "But never did he expect to see his parents at the other side, he silently begged you to choose his parents over him.");

            System.out.println("        Trolley");
            System.out.println("           |");
            System.out.println("           v");
            System.out.println("       ---------");
            System.out.println("       |       |");
            System.out.println("       v       v");
            System.out.println("     Ethan   Ethan's Mother");
            System.out.println("             Ethan's Father");

            System.out.println();
            System.out.println("   option 1   option 2\n");

            System.out.println("Stage 3");

            System.out.print("Your input: ");
            byte answer3 = captcha.nextByte();

            System.out.println();

            if (answer3 == 1) {
                System.out.println(
                        "Ethan fell into despair as he watched his parents get ran over by the trolley, he stopped pursuing medicine and became an alcoholic.");
                System.out.println("you failed the test.");
                passed = false;
            } else if (answer3 == 2) {
                System.out.println(
                        "Ethan's parents fell into despair after watching their son get ran over by the trolley, \"You're a monster they said before mournfully leaving the place. \"");
                System.out.println("you passed the test.");
                passed = true;
            } else {
                System.out.println("You realized you don't have to choose, this time you can save both.");
                System.out.println(
                        "You stopped the evil trolley that claimed countless human lives, Ethan and his parents was extremely grateful for your actions.");
                System.out.println(
                        "Ethan went on to save countless lives as a doctor and later found the cure for cancer.");
                System.out.println("\nCongratulations.");
                passed = true;
            }
        } else if (!secondStage && !glitch) {
            System.out.println(
                    "Lena became a flight attendant 1and had a successful life, Julian on the other hand completely overcame his addiction after meeting the love of his life.");
            System.out.println("They later happily married");
            System.out.println("You passed the test.");
            passed = true;
        }
        System.out.println();
        System.out.println("passed: " + passed);
        captcha.close();


    Scanner s = new Scanner(System.in);
    System.out.print(" Convert [ PHP , USD , JPY , GBP , CNY ] : "); 
    String currency1 = s.nextLine();
    System.out.print(" to [ PHP , USD , JPY , GBP , CNY ] : ");
    String currency2 = s.nextLine();
    System.out.print("Amount : ");
    int amount = s.nextInt();
    currencies c = new currencies(currency1 , currency2 , amount);
    System.out.print("-> " + c.converter());
    s.close();





}






}
