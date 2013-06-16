public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	if(cmd.getName().equalsIgnoreCase("addteam")){ 
		String cmd = "scoreboard teams add " + //argument 1. derpy me is tired and does not want to code.
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
		// i'm so tired
		return true;
	}
	return false; 
}
