package application;

import entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Candidate, Integer> total = new HashMap<>();
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Usei o try-with-resources aqui para fechar o arquivo automático

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);
                Candidate candidate = new Candidate(name);
                int totalVotesSoFar = total.getOrDefault(candidate, 0);
                total.put(candidate, totalVotesSoFar + votes);

                line = br.readLine();
            }
            System.out.println("ELECTION RESULT");
            for (Candidate key : total.keySet()) {
                System.out.println(key.getName() + ": " + total.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}