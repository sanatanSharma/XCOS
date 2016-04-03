/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentRankingSystem
{
	private ArrayList<Student> listStudents;
	
	public StudentRankingSystem()
	{
		listStudents = new ArrayList<Student>();
	}
	
	
	public void addStudent(int roll, String name, int lang1, int lang2, int maths, int science, int es) throws Exception
	{
		Student newstudent = new Student(roll, name, lang1, lang2, maths, science, es);
		listStudents.add(newstudent);
	}
	
	public void printRankList()
	{
		int[] rolls = getRankList();
		System.out.println("RANK LIST");
		for ( int i = 0 ; i < rolls.length ; i++ )
		{
			System.out.println(i+1+" "+listStudents.get(rolls[i]).getName());
		}
	}
	
	private int[] getRankList()
	{
		order();
		int[] rolls = new int[listStudents.size()];
		int i = listStudents.size()-1;
		for ( Student student : listStudents) 
		{
			rolls[i--] = listStudents.indexOf(student);
		}
		return rolls;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void order()
	{
		Collections.sort(listStudents, new Comparator() 
		{
			public int compare(Object o1, Object o2)
			{
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				if ( comp(s1.totalMarks(), s2.totalMarks()) != 0 )
					return comp(s1.totalMarks(), s2.totalMarks());
				else if ( comp(s1.getmaths(), s2.getmaths()) != 0 )
					return comp(s1.getmaths(), s2.getmaths());
				else if ( comp(s1.getscience(), s2.getscience()) != 0 )
					return comp(s1.getscience(), s2.getscience());
				else if ( comp(s1.getes(), s2.getes()) != 0 )
					return comp(s1.getes(), s2.getes());
				else if ( comp(s1.getLang1(), s2.getLang1()) != 0 )
					return comp(s1.getLang1(), s2.getLang1());
				else
					return comp(s1.getLang2(), s2.getLang2());
				
			}
		});
	}
	
	private int comp(int a, int b)
	{
		if (a==b)
			return 0;
		else if ( a<b )
			return -1;
		else
			return 1;
	}
}



