/*Colorado State University Global 
#24SD-CSC320-2: Programming 1
#Dr. Douglas Mujeye
#September 22, 2024*/

import java.util.ArrayList;
import java.util.Scanner;

public class GetWeeklyTemperatures {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> daysOfTheWeek = new ArrayList<>();
		ArrayList<Double> temperatures = new ArrayList<>();
		
		daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");
		
		for(int i = 0; i < daysOfTheWeek.size(); i++) {
			System.out.println("Enter the average temperature for " + daysOfTheWeek.get(i) + ": ");
			double avgTemp = scanner.nextDouble();
			temperatures.add(avgTemp);
		}
		
		while(true) {
			System.out.println("Enter a day of the week to see its temperature or 'week' to see the weekly average or 'exit' when finished.");
			String userInput = scanner.next();
			
			if(userInput.equalsIgnoreCase("exit")) {
				System.out.println("Exiting program.");
				break;
			} else if(userInput.equalsIgnoreCase("week")) {
				double totalTemp = 0.0;
				for(int i = 0; i < temperatures.size(); i++) {
					totalTemp = totalTemp + temperatures.get(i);
				}
				double weeklyAverage = totalTemp / temperatures.size();
				System.out.println("This is the weekly average temperature: " + weeklyAverage);
			} else {
				int dayIndex = -1;
				for(int i = 0; i < daysOfTheWeek.size(); i++) {
					if(daysOfTheWeek.get(i).equalsIgnoreCase(userInput)) {
						dayIndex = i;
						break;
					}
				}
				if(dayIndex != -1) {
					System.out.println("Average temperature for " + userInput + ": " + temperatures.get(dayIndex));
				} else {
					System.out.println("Invalid entry, enter a day of the week or 'week' for the weekly average.");
				}
			}		
		}
		scanner.close();
	}
}
	


