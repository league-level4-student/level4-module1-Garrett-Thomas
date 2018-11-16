package _07_Monty_Hall;

import java.util.Random;

public class mainMan {
	static Random gen = new Random();
	static String[] doors = new String[3];
	static int yes;
	static int no = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			run();
		}

	}

	public static void run() {
		doors[gen.nextInt(3)] = "lambo";
		for (int i = 0; i < doors.length; i++) {
			if (doors[i] != "lambo") {
				doors[i] = "goat";
			}
			System.out.println(yes);
		}
		int doorChoosed = gen.nextInt(3);
		for (int i = 0; i < doors.length; i++) {
			if (doors[i] != "lambo" && i != doorChoosed) {
				doors[i] = "opened";
			}
		}
		for (int j = 0; j < doors.length; j++) {
			// System.out.println(doors[j]);
			if (doors[j] != "opened" && j != doorChoosed) {
				doorChoosed = j;
			}
		}
		if (doors[doorChoosed] != "lambo") {
			// System.out.println("no");
			no++;
		} else {
			// System.out.println("yes");
			yes++;
		}
		for (int i = 0; i < doors.length; i++) {
			doors[i] = "";
		}
	}
}
