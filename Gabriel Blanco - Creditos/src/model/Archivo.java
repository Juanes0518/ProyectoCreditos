package model;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Archivo 
{
	private File f;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;
	private String line, cred;
	
	public Archivo()
	{
		
	}
	
	public String readLog()
	{
		String str = "";
		f = new File("./docs/resources/MyCred.log");
		try 
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			line = br.readLine();
			while(line != null)
			{
				str += line+"\n";
				line = br.readLine();
			}
			fr.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return str;
	}
	
	public void saveLog(String InsertLineToSave)
	{
		f = new File("./docs/resources/MyCred.log");
		try 
		{
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			for (int i = 0; i < 1; i++) 
			{
				pw.println(InsertLineToSave);
			}
			
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void saveCred(String InsertLineToSave)
	{
		f = new File(cred);
		try 
		{
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			for (int i = 0; i < 1; i++) 
			{
				pw.println(InsertLineToSave);
			}
			
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public String loadCred()
	{
		String str = "";
		final JFileChooser chooser = new JFileChooser();
		final FileNameExtensionFilter ext = new FileNameExtensionFilter("Archivo .cred", "cred");
		chooser.setFileFilter(ext); 
		int returnVal = chooser.showOpenDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			try 
			{
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				line = br.readLine();
				while(line != null)
				{
					str += line+"\n";
					line = br.readLine();
				}
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		if(returnVal == JFileChooser.CANCEL_OPTION)
		{
			chooser.cancelSelection();
		}
		cred = chooser.getSelectedFile().toString();
		return str;
	}
	public void saveCredAs(String InsertLineToSave)
	{
		final JFileChooser chooser = new JFileChooser();
		final FileNameExtensionFilter ext = new FileNameExtensionFilter("Archivo .cred", "cred");
		chooser.setFileFilter(ext);
		int returnVal = chooser.showSaveDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			f = chooser.getSelectedFile();
			try 
			{
				fw = new FileWriter(f);
				pw = new PrintWriter(fw);
				for (int i = 0; i < 1; i++) 
				{
					pw.println(InsertLineToSave+"\n");
				}
				
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		if(returnVal == JFileChooser.CANCEL_OPTION)
		{
			chooser.cancelSelection();
		}
		cred = chooser.getSelectedFile().toString();
	}

	public String getCred() {
		return cred;
	}

	public void setCred(String cred) {
		this.cred = cred;
	}
}
