/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Student
{
	private int roll;
	private String name;
	private int lang1;
	private int lang2;
	private int maths;
	private int science;
	private int es;
	
	
	public Student(int roll, String name, int lang1, int lang2, int maths, int science, int es) 
	{
		this.roll = roll;
		this.name = name;
		this.lang1 = lang1;
		this.lang2 = lang2;
		this.maths = maths;
		this.science = science;
		this.es = es;
	}
	
	public int getLang1()
	{
		return lang1;
	}
	public void setLang1(int lang1)
	{
		this.lang1 = lang1;
	}
	public int getLang2()
	{
		return lang2;
	}
	public void setLang2(int lang2)
	{
		this.lang2 = lang2;
	}
	public int getmaths()
	{
		return maths;
	}
	public void setmaths(int maths)
	{
		this.maths = maths;
	}
	public int getscience()
	{
		return science;
	}
	public void setscience(int science)
	{
		this.science = science;
	}
	public int getes()
	{
		return es;
	}
	public void setes(int es)
	{
		this.es = es;
	}
	public Integer totalMarks()
	{
		return lang1+lang2+maths+es+science;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
}