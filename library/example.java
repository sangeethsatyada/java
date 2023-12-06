//package collections;
import java.util.*;
class Books
{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> al=new ArrayList<String>(); 
	public void addBook()
	{
		System.out.println("Enter book name : ");
		String book_name=sc.nextLine();
		al.add(book_name);		
	}
	public void removeBook()
	{
		System.out.println("Enter bookname:");
		String rmBook=sc.nextLine();
		if(al.contains(rmBook)) {
			int index=al.indexOf(rmBook);
			al.remove(index);
		}
		else
		{
			System.out.println("Book Not Found");
		}
	}
	public void readBook()
	{
		System.out.println("Enter book name:");
		String book_name=sc.nextLine();
		if(al.contains(book_name)) {
			System.out.println("Reading........");
		}
		else
			System.out.println("Book Not Found");
	}
	public static void all_books()
	{
		for(String book:al) {
			System.out.println("The book is: "+book);
		}
	}
}
public class example extends Books{
	static Scanner sc=new Scanner(System.in);
    public void admin()
{
    int password=4495; 
    System.out.println("Enter password:");
    int pass=sc.nextInt();
    if(password==pass){
        Books books = new Books(); // Create an object of the Books class
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display");
        int ch=sc.nextInt();
        if(ch==1) {
            books.addBook(); // Call addBook on the Books object
        }
        if(ch==2) {
            removeBook();
        }
        if(ch==3) {
            all_books();
        }
    }
    else{
        System.out.println("Failed");
    }
}

    public void student()
    {
        int password=1234;
        System.out.println("Enter password");
        int pass=sc.nextInt();
        if(password==pass) {
        	readBook();
        }
        else
        	System.out.println("Wrong password");
        
    }
	public static void main(String[] args) {
        while(true){
		System.out.println("Welcome:");
        System.out.println("1.ADMIN");
        System.out.println("2.Student");
        System.out.println("3.Availabale Books:");
        System.out.println("4.Exit");
        System.out.println("Enter choice:");
        int ch=sc.nextInt();
        example m=new example();
        
        switch(ch){
            case 1:m.admin();
            break;
            case 2:m.student();
            break;
            case 3:all_books();
            break;
            case 4:System.exit(0);
            default:
            System.out.println("Invalid choice:");
        }
    }
	}

}

