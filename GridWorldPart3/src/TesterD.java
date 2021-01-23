import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class TesterD {

	public static void main(String[] args) {

		ActorWorld world = new ActorWorld();
		Jumper j = new Jumper();
		Bug b = new Bug();
		world.add(j);
		world.add(b);
		j.moveTo(new Location(1, 2));
		j.setDirection(Location.SOUTH);
		b.moveTo(new Location(3, 2));
		world.show();

	}

}
