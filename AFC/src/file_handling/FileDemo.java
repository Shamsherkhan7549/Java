package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileDemo {
	public static void main(String str[]) {
		//create a file
				File f = new File("d:\\data.txt");
				try
				{
				boolean b =f.createNewFile();
				if(b)
					System.out.println("File Created");
				else
					System.out.println("File not created");
				}
				catch(IOException ex)
				{
					System.out.println(ex);
				}
				if(f.exists())
				{
					System.out.println("File Created");
				}
				
				//write data in a file
				try
				{
					String name = JOptionPane.showInputDialog("Enter Student name");
					String email = JOptionPane.showInputDialog("Enter Student email");
					String age = JOptionPane.showInputDialog("Enter Student age");
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);
				out.println(name+"\t"+email+"\t"+age);
				
				out.close();
				bw.close();
				fw.close();
				JOptionPane.showMessageDialog(null,"Data saved in file");
				}
				catch(IOException ex)
				{
					System.out.println(ex);
				}
				
				
				//to read the data from a file
				JFileChooser jc = new JFileChooser();
				jc.showOpenDialog(null);
				File file=jc.getSelectedFile();
				try
				{
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
//				String data = br.readLine();
//				System.out.println(data);
				String data;
				while((data = br.readLine())!=null)
				{
					System.out.println(data);
				}
				
				br.close();
				fr.close();
				}
				catch(IOException ex)
				{
					System.out.println(ex);
				}
				

			}

		}


	}
}
