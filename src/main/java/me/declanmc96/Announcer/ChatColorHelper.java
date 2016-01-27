package me.declanmc96.Announcer;

import org.bukkit.ChatColor;

public class ChatColorHelper
{
  public static String replaceColorCodes(String message)
  {
    for (ChatColor color : ) {
      message = message.replaceAll(String.format("&%c", new Object[] { Character.valueOf(color.getChar()) }), color.toString());
    }
    return message;
  }
}
