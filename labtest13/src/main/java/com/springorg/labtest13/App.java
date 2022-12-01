package com.springorg.labtest13;

import java.sql.SQLException;
import java.util.Scanner;

import com.springorg.labtest13.dao.userdio;
import com.springorg.labtest13.daoimpl.userimpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		userdio ud = new userimpl();
		System.out.println("1. To Create user:");
		System.out.println("2. To View user:");
		System.out.println("3. To View all user:");
		System.out.println("4. To Update user:");
		System.out.println("5. To Delete user:");
		System.out.println("9. To Exit:");

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice :");
			int ch = scan.nextInt();
			int i = 0;
			switch (ch) {
			case 1: {
				scan.nextLine();
				System.out.println("enter your username");
				String usename = scan.nextLine();
				System.out.println("enter your password");
				String password = scan.next();
				if (password.length() >= 8) {
					i = ud.createuser(usename, password);
					System.out.println(" inserted");
				}else
				System.out.println("enter valide password");
				break;
			}
			case 2:
				System.out.println("enter the username which user  wnat to see");
				String disp = scan.next();
				ud.displayuser(disp);
				break;
			case 3:
				ud.displayallluser();
				break;
			case 4: {
				scan.nextLine();
				System.out.println("enter the usernae  where u upadte the recordand ");
				String username = scan.nextLine();
				System.out.println("enter the password profile which u wont to update");
				String password = scan.nextLine();
				i = ud.updaetpass(username, password);
				System.out.println(i + " record updated..");
				break;
			}
			case 5: {
				scan.nextLine();
				System.out.println("enter the username which user  wnat to delete");
				String u = scan.nextLine();
				i = ud.deleteuser(u);
				System.out.println(i + " record deleted..");
				break;
			}
			case 9:
				
				System.out.println("exit database");
				System.exit(0);

			default:
				System.out.println("Enter valid choice...");

			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
