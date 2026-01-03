import java.util.*;
public class Main {
	static Scanner sc = new Scanner (System.in);
	//diri dampi gid na buangan ko pwede lang gali butang di mga scanner para ma dala sa new methods gamay, basta by 9 guro tapos nako aight aight kita lang duwa HAHAHAHAHAHA 
	
	
	static String[] movies = { "Barbie land",
        "The First Slam Dunk",
        "Chainsaw Man - The Movie: Reze Arc",
        "Kingsman: The Secret Service",
        "John Wick"
    };

       static String[] times = {
        "8:30 - 10:30",
        "1:00 - 3:00",
        "3:00 - 5:00",
        "5:00 - 8:00"
    };

         static int ticketPrice = 250;
         
	public static void main(String[] args) {

		int choice;
		do {  
		System.out.println("\n=== STEVENS LITTLE MOVIE THEATER ===");
            System.out.println("1. Book Movie");
            System.out.println("2. View Movies and time");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

           choice =  sc.nextInt();
           
            switch (choice)
            {
            	
            	case 1: 
            	bookMovie();
            	break;
            	
            	case 2:
            	show();
            	break;
            	
            	case 3:
            	System.out.print("\n === Thank you for visiting Stevens little theatre!!, please come again!!!===");
            	break;
            	default:
            	System.out.print("The void is coming.");
            	
            	
  
            
	      	} 
		} while (choice != 3);
	
	}
	//movies choice
	static void bookMovie() 
	{
		 System.out.println("\nCustomer Name: ");
        String namea = sc.nextLine();
        String name = sc.nextLine();
       

     System.out.println("Contact Number: ");
     
        String contact = sc.nextLine();
        
        
        //int lang kay daw wla gana kung call out ko
        int movie = selectMovie();
        int time = selectTime();
        int tickets = selectTickets();

  int total = tickets * ticketPrice;
   printReceipt(name, contact, movie, time, tickets, total);
		
	}
	//number 3
	static void show()
	{
	    System.out.println("\n=== MOVIES & TIMES ===");
        for (String movie : movies) {
            System.out.println("\n" + movie);
            for (String time : times) {
                System.out.println("  - " + time);
            }
	}
	
	}
	
	//Movies for each
	static int selectMovie() {
			 	  int choice;
 	 	
			 	System.out.print("\n== MOVIE SELECTION ==\n");

			for (int x = 0; x < movies.length; x++)
			System.out.println((x + 1)+ "." + " " +movies[x] );  
			
			  // Ask user to choose a movie
      System.out.print("Select movie: ");
        choice = sc.nextInt();
       sc.nextLine();

        if (choice >= 1 && choice <= movies.length) {
            return choice - 1;
        }

        System.out.println("Invalid movie Defaulting to first.");
        return 0;
    }
    
    
    
    //TIMEEEEEE
      static int selectTime() {
    int choice;
    System.out.println("\n=== TIME SLOTS ===");
    for (int i = 0; i < times.length; i++) {
        System.out.println((i + 1) + ". " + times[i]);
    }

    System.out.print("Select time: ");
    choice = sc.nextInt();
    sc.nextLine(); 

    if (choice >= 1 && choice <= times.length) {
        System.out.println("You selected time: " + times[choice - 1]);
        return choice - 1;
    }

    System.out.println("Invalid time. Defaulting to first.");
    return 0;
}
    //moneyyy
    static int selectTickets() {
    int tickets;

    System.out.print("Select number of tickets: ");
    tickets = sc.nextInt();
    sc.nextLine(); // consume newline

    if (tickets > 0) {
        return tickets;
    }

    System.out.println("Invalid ticket amount. Defaulting to 1 ticket.");
    return 1;
}
        static void printReceipt(String name, String contact, int movie, int time, int tickets, int total) {
        System.out.println("\n=== BOOKING INFORMATION (POS RECEIPT) ===");
        System.out.println("Customer: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Movie: " + movies[movie]);
        System.out.println("Time: " + times[time]);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per Ticket: ₱" + ticketPrice);
        System.out.println("TOTAL: ₱" + total);
        System.out.println("Date of purchase: 1/3/26");
        System.out.println("======================================");
    }
}