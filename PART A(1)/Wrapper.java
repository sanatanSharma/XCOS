/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME :   Sanatan Sharma																								   //											   
//INPUT :  The user can enter font type, background color, font color or may choose and enter nothing.    				   //                                                                 			   //
//		   For the former changes will be made, for the latter previous settings are restored.							   //
//		   																												   //
//OUTPUT : Changes are made according to the input data. 																   //		
//		   If a field is left blank last known setting of that field is applied. 										   //	
//Sources : stackoverflow.com																							   //
//		    docs.orcale.com/javase/uiswing																			       //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public class Wrapper 
{
	public static void main ( String[]args )
	{
		 java.awt.EventQueue.invokeLater(new Runnable() 
		 {
	            public void run() 
	            {
	                new ChangeProp().setVisible(true);
	            }
	     }); 
	}
}
