/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //											   
//INPUT : The program first requires the number of students as input. 													   //
//		For each student, roll number, name, lang1, lang2, maths, science, es, data										   //
//		should be provided separated by space.																			   //
//		5																												   //
//		1 a 89 10 71 87 18 																								   //
//		2 b 6 39 76 22 92 																								   //
//		3 c 38 96 86 62 75 																								   //
//		4 d 70 84 9 22 41     		 		 	 	 	 	 	 														   //
//		5 e 63 37 93 26 31 																								   //
//		The above is a sample input format and data.                                                                       //
//OUTPUT : The output consists of names of students sorted based on their appropriate ranks calculated using criterion 'b' //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentRanking
{
	public static void main ( String[]args ) throws Exception
	{
		StudentRankingSystem sys = new StudentRankingSystem();
		System.out.print("Enter the no. of students : ");
		System.out.println();
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
		int noOfStudents = Integer.parseInt(br.readLine());
		
		for ( int i = 0 ; i < noOfStudents ; i++)
		{
			String[] tmp = br.readLine().split(" ");
			int roll = Integer.parseInt(tmp[0]);
			String name = tmp[1];
			int lang1 = Integer.parseInt(tmp[2]);
			int lang2 = Integer.parseInt(tmp[3]);
			int maths = Integer.parseInt(tmp[4]);
			int science = Integer.parseInt(tmp[5]);
			int es = Integer.parseInt(tmp[6]);
			sys.addStudent(roll, name, lang1, lang2, maths, science, es);
		}
		sys.printRankList();
	}
}

