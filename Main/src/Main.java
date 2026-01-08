import java.util.*;
public class Main {
	static Scanner sc = new Scanner (System.in);
	
	
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

          try {
        choice = sc.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("\nInvalid input. Please enter a number.\n");
        sc.nextLine();
        choice = 0;
       continue;
    }
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
            	System.out.print("\n Invalid input.\n Please choose a number between 1 and 3\n");
            	
            	
  
            
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
 	 	
			 while(true){	System.out.print("\n== MOVIE SELECTION ==\n");

			for (int x = 0; x < movies.length; x++)
			System.out.println((x + 1)+ "." + " " +movies[x] );  
			
			
      System.out.print("Select movie: ");
      try{
        choice = sc.nextInt();
        sc.nextLine();
        if (choice >= 1 && choice <= movies.length) {
                return choice - 1;}
        else
        {System.out.println("Enter number between 1 to 5");
        }
        
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. please use Numbers only.");
         sc.nextLine();
        }
       
 
			 }
    }
    
    
    
    //TIMEEEEEE
      static int selectTime() {
    int choice;
   while(true) {System.out.println("\n=== TIME SLOTS ===");
    for (int i = 0; i < times.length; i++) {
        System.out.println((i + 1) + ". " + times[i]);
    }

    System.out.print("Select time: ");
    
   try { choice = sc.nextInt();
    sc.nextLine(); 

    if (choice >= 1 && choice <= times.length) {
       
        return choice - 1;
    } else{

    System.out.println("Invalid time. Please pick between 1 to 4");}
   }  catch (InputMismatchException e) {
            System.out.println("Invalid input. please use Numbers only.");
         sc.nextLine();
        }
    }
}


    //moneyyy
    static int selectTickets() {
    int tickets;

  while(true)  {System.out.print("Select number of tickets: ");
    try{
    tickets = sc.nextInt();
    sc.nextLine(); 

    if (tickets > 0) {
        return tickets;
    } else 
     { System.out.println("\nInvalid ticket amount. Please input tickect amount greater than 0\n");}
     
    }catch (InputMismatchException e) {
            System.out.println("Invalid input. please use Numbers only.");
         sc.nextLine();
        }
}
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