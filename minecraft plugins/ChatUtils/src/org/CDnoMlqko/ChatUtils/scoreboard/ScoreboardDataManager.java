package org.CDnoMlqko.ChatUtils.scoreboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import org.bukkit.entity.Player;

public class ScoreboardDataManager {
	
	private static String fileName = "ScoreboardData.txt";
	
	static File outputFile;
	
	public static HashMap<String, ScoreboardDataContainer> scoreboardData;
	
	public ScoreboardDataManager()
	{
		outputFile = new File(fileName);
	}
	
	@SuppressWarnings("unchecked")
	public static void LoadScoreboard()
	{
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(outputFile));
			scoreboardData = (HashMap<String, ScoreboardDataContainer>) in.readObject();
			in.close();
		}
		catch(IOException  e)
		{
			System.out.println(fileName + " is deleted or corrupted! Creating a new one.");
			scoreboardData = new HashMap<String, ScoreboardDataContainer>();
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFile));
				out.writeObject(scoreboardData);
				out.close();
				System.out.println("Successfully created "+ fileName);
			} catch (IOException e1) {
				System.out.println("Failed to create " + fileName);
			}
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(fileName + " can't be readed!");
		}
	}
	
	public static void initialisePlayerScoreboardIfNeeded(Player p)
	{
		if(!scoreboardData.containsKey(p.getName()))
		{
			scoreboardData.put(p.getName(), new ScoreboardDataContainer());
		}
	}
	
	public static void SaveScoreboard()
	{
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFile));
			out.writeObject(scoreboardData);
			out.close();
		} catch (IOException e) {
			System.out.println("failed to create a file to save the scoreboard in.");
		}
	}
	
	
	
}
