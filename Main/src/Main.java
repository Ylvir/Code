import java.util.*;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        double movieamount;
        String movieName;

        out.print("==Welcome to Johann's movie theater!==\nEnter your name: ");
        String name = sc.nextLine();

        out.print("Enter your contact Number: ");
        long contact = sc.nextInt();

        out.print("Enter your birth date: ");
        String birth = sc2.nextLine();

        out.println("==Movies Available==");
        out.print("\n1 - One Piece Red (₱ 250)\n2 - Your name (₱ 250)\n3 - Demon slayer infinity castle (₱ 250)\n4 -  evan almighty (₱ 250)\n==============\npick a movie (1-4): ");

        int movie = sc.nextInt();

        out.print("\ninput the numbers of tickets: ");
        int tickets = sc.nextInt();
        int tickprice = 250;

        int ticksum = tickets * tickprice;

        try{
            switch (movie)
        {
            case 1:
                movieName = "One piece Red";
                break;
            case 2:
                movieName = "Your name";
                break;
            case 3:
                movieName = "Demon Slayer infinity castle";
                break;
            case 4:
                movieName = "Evan almighty";
                break;
            default:
                out.print("Movie invalid\nInput the right movie");
                return;
        }
            String time;
            out.println("\nPick an available time");
            out.print("1 - 8:30-10:30\n2 - 1:00-3:00\n3 - 3:00-5:00\n4 - 5:00-8:00\nChoose the time: ");
            int movieTime = sc.nextInt();

            switch (movieTime)
            {
                case 1:
                    time = "8:30-10:30";
                    break;

                case 2:
                    time = "1:00-3:00";
                    break;

                case 3:
                    time = "3:00-5:00";
                    break;

                case 4:
                    time = "5:00-8:00";
                    break;

                default:
                    out.print("invalid\ninput a valid time ");
                    return;
            }
            out.print("\n==Thank your for booking in johans movie!==");
            out.println("\nName: " + name + "\nBirth date: " + birth +  "\nContact number " + contact + " \nmovie: " + movieName + "\nTime: " + time + "\nAmount of tickets: " + tickets +"\nTotal amount: " + " ₱" + ticksum);
            out.print("=====Enjoy your movie!=====");
        } catch (Exception e)
        {out.print("");}
    }
}