package ts;

import java.util.*;

public class Solver {

	public static void main(String[] args) {
		
		System.out.println("Welcome to HomeworkSolver!");
		System.out.println("Type help for keywords. Type end to quit.");
		
		List<String> keywords = new ArrayList<>();
		keywords.add("prime");
		
		try (Scanner in = new Scanner(System.in))
		{
			while(in.hasNextLine())
			{
				String input = in.nextLine();
				if (input.toLowerCase().equals("help")) displayHelp();
				else if (input.toLowerCase().equals("end")) return;
				else
				{
					String[] words = input.split("\\s+");
					String keyWord = words[0];
					
					switch (keyWord.toLowerCase())
					{
					case "prime":
						for (int i = 1; i < words.length; i++)
						{
							try
							{
								System.out.print("" + MathSolver.isPrime(Long.parseLong(words[i])) + " ");
							}
							catch (Exception e)
							{
								System.out.print("Error, invalid input.");
							}
						}
						System.out.print("\n");
						break;
					case "factorization":
						if (words.length > 2) System.out.println("Too many arguments.");
						else System.out.println(MathSolver.primeFactorization(Long.parseLong(words[1])));
						break;
					case "gcd":
						if (words.length != 3) System.out.println("Incorrect number of arguments.");
						else System.out.println(MathSolver.gcd(Long.parseLong(words[1]), Long.parseLong(words[2])));
						break;
					case "matrix":
						if (words.length != 3) System.out.println("Incorrect number of arguments.");
						else 
						{
							Matrix m = new Matrix(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
							m.createMatrix();
							m.printMatrix();
						}
						break;
					default:
						System.out.println("Not valid expression.");
					}
				}
			}
		}
	}
	
	public static void displayHelp()
	{
		System.out.println("Type keywords followed by the value.");
		System.out.println("Keyword\t\t\tValue\t\t\tDescription");
		System.out.println("-------\t\t\t-----\t\t\t-----------");
		System.out.println("prime\t\t\tnumber(s)\tPrints yes if prime, no if composite.");
		System.out.println("factorization\t\tnumber\t\tPrints prime factorization of number.");
		System.out.println("gcd\t\t\t2 numbers\tPrints greatest common divisor of 2 numbers.");
	}

}
