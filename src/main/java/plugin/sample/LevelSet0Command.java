package plugin.sample;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class LevelSet0Command implements CommandExecutor{

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player player) {
      player.setLevel(0);
    }

    return false;
  }
}
