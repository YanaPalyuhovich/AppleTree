package palyuhovich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a command");
		while (true) {
			try {
				String line = reader.readLine();
				if ("grow".equals(line)) {
					System.out.println(tree.graw(100));
				} else if ("shake".equals(line)) {
					System.out.println(tree.shake());
				} else if ("exit".equals(line)) {
					System.exit(0);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
