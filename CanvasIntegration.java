import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class CanvasIntegration
{
	private String token;
	private String courseWebsite = "https://erau.instructure.com/api/v1/courses.json?all_events=true&per_page=100&access_token=" + token; 

	public CanvasIntegration(String token) {
		this.token = token;
	}

	public ArrayList<String> getCourseIDs()
	{
		ArrayList<String> IDs = new ArrayList<String>();

		try 
		{
			URL url= new URL(courseWebsite);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()))) 
			{
				for (String line; (line = reader.readLine()) != null; ) 
				{
					while (line.indexOf("{\"id\":") != -1)
					{
						IDs.add(line.substring(line.indexOf("{\"id\":") + 6, line.indexOf("{\"id\":") + 12));
						line = line.substring(line.indexOf("{\"id\":") + 1);
					}
				}
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return IDs;
	}

	public ArrayList<String> getAssignments(ArrayList<String> IDs)
	{
		ArrayList<String> assignments = new ArrayList<String>();
		ArrayList<String> dates = new ArrayList<String>();
		ArrayList<String> combo = new ArrayList<String>();

		for (int i = 0; i < IDs.size(); i++)
		{
			String website = "https://erau.instructure.com/api/v1/courses/" + IDs.get(i) + "/assignments.json?all_events=true&per_page=100&access_token=2386~49TZj9vm1Nm4vHLJaqIJe9kE4MbHjMDDoLppJZeWVLWKCNeXPpdFopIUK7Jhm6XR";
			try 
			{
				URL url= new URL(website);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				try (BufferedReader reader = new BufferedReader(
						new InputStreamReader(conn.getInputStream()))) 
				{
					for (String line; (line = reader.readLine()) != null; ) 
					{
						String linea = line;
						String lineb = line;
						while (linea.indexOf("\"name\":\"") != -1)
						{
							linea = linea.substring(linea.indexOf("\"name\":\"") + 8);
							int j = 0;
							String temp = "";

							while (!linea.substring(j, j + 1).equals("\""))
							{
								temp += linea.substring(j, j + 1);
								j++;
							}
							assignments.add(temp);
						}

						while (lineb.indexOf("\"due_at\":") != -1)
						{
							lineb = lineb.substring(lineb.indexOf("\"due_at\":") + 9);
							int j = 0;
							String temp = "";

							while (!lineb.substring(j, j + 1).equals(","))
							{
								temp += lineb.substring(j, j + 1);
								j++;
							}

							if (temp.substring(0, 1).equals("\""))
							{
								temp = temp.substring(1, 11);
							}
							dates.add(temp);
						}
					}
				}
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		for (int k = 0; k < assignments.size(); k++)
		{
			combo.add(assignments.get(k));
			combo.add(dates.get(k));
		}

		return combo;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
}