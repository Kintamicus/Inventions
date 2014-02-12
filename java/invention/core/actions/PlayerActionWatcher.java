package invention.core.actions;

import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerActionWatcher {
	/*
	 * This class will simply watch a player and save any acceptable actions to their player
	 */
	private EntityPlayerMP player;
	private Action lastAction;
	
	public PlayerActionWatcher(EntityPlayerMP player) {
		this.setPlayer(player);
	}

	public EntityPlayerMP getPlayer() {
		return player;
	}

	public void setPlayer(EntityPlayerMP player) {
		this.player = player;
	}

	public Action getLastAction() {
		return lastAction;
	}

	public void setLastAction(Action lastAction) {
		this.lastAction = lastAction;
	}
}
