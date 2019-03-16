package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		String inputPath = "//home//lucas" + "//eclipse-workspace//interface-comparable//peoplesNames.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
			String line = br.readLine();
			while (line != null) {
				String name = line.split(",")[0];
				Double salary = Double.parseDouble(line.split(",")[1]);
				employees.add(new Employee(name, salary));
				//System.out.println(line);
				line = br.readLine();
			}
			Collections.sort(employees);
			System.out.println("");

			for (Employee e : employees) {
				System.out.println(e);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
