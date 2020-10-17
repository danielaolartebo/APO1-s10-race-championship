/**
 * Universidad Icesi (Cali - Colombia)
 * Algoritmos y programacion I
 * Seguimiento 10
 * @Author: Daniela Olarte Borja A00368359
 * @Date: 17/10/2020
 */
package ui;
import java.util.Scanner;
import model.Championship;
public class Main {
	private static final int size = 0;
	public Scanner lector = new Scanner(System.in);
	public static Championship championships;
	public Main(){
	showMenu(false);
	}
	public static void main(String[] args) {
		boolean extra=false;
		championships= new Championship(0, 0);
		System.out.println("Welcome");
		Main start=new Main();
		extra=start.showMenu(extra);
	}
	public boolean showMenu(boolean extra){
		boolean pExtra= extra;
		boolean menu=true;
		while (menu){
		System.out.println("Choose an option to proceed: \n" +
						"(1) register championship       \n" +
						"(2) register pilot              \n" +
						"(3) show all-average time       \n" +
						"(4) exit                        \n");
		int option=lector.nextInt();
		lector.nextLine();
		switch(option){
				case 1: registerChampionship();
					pExtra=true;
                	break;
				case 2: if(pExtra){
					registerPilot();
					}else{
						System.out.println("You should register the championship first");
					}
                	break;
				case 3: if(pExtra){
						System.out.println(championships.showAverageTimes());
					}else{
						System.out.println("You should register the pilots first");
					}
					break;
				case 4: System.out.println("Have a great day!");
					break;
				default: System.out.println("Error. Select a valid option");
			}
		}
		return pExtra;
	}
	public void registerChampionship(){
		System.out.println("Type in the race's year");
    	int year=lector.nextInt();
    	System.out.println("Type in the race's awards");
		int races=lector.nextInt();
		championships=new Championship(year, races);
	}
	public void registerPilot(){
		System.out.println("Type in the quantity of pilots");
		int size=lector.nextInt();
		lector.nextLine();
		for(int i=0; i<size; i++){
			System.out.println("Type in the name of pilot #"+(i+1));
			String name=lector.nextLine().toUpperCase();
			lector.nextLine();
			System.out.println("Type in the age of pilot #"+(i+1));
			int age=lector.nextInt();
			lector.nextLine();
			System.out.println("Type in your team: \n" +
								"FERRARI      \n" +
								"MCLAREN      \n" + 
								"REDBULL      \n" +
								"MERCEDES     \n" +
								"RACINGPOINT  \n" +
								"ALFAROMEO    \n" +
								"RENAULT      \n" +
								"WILLIAMS     \n" );
			String team=lector.nextLine().toUpperCase();
			System.out.println("Type in the quantity of races");
			int races=lector.nextInt();
			lector.nextLine();
			int[] ray= new int[races];
			for(int f=0; f< races; f++){
				System.out.println("Race #"+(f+1)+" time: ");
				ray[f]=lector.nextInt();
				lector.nextLine();
			}
			championships.addPilot(name,age,team,ray);
			}
        }
}