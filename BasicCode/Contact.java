package BasicCode;
import Interface.*;
import java.lang.*;
public class Contact implements Iinfo{
	private String Wsite;
	private String mail;
	private String mobNum;
	public Contact()
	{
		System.out.println(" ");
	}
	public Contact(String Wsite,String mail,String mobNum)
	{
		this.Wsite=Wsite;
		this.mail=mail;
		this.mobNum=mobNum;
	}
	public void setWebSite(String Wsite)
	{
		this.Wsite=Wsite;
	}
	public String getWebSite()
	{
		return Wsite;
	}
	public void setGmail(String mail)
	{
		this.mail=mail;
	}
	public String getGmail()
	{
		return mail;
	}
	public void setCell(String mobNum)
	{
		this.mobNum=mobNum;
	}
	public String getCell()
	{
		return mobNum;
	}
	public void ShowInfo()
	{
		System.out.println("Website:"+Wsite);
		System.out.println("gmail:"+mail);
		System.out.println("contact:"+mobNum);
	}
}