import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.grid.Location;

//What will a jumper do if it encounters another jumper in its path? 
public class TesterE {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper j = new Jumper();
        world.add(new Location(4, 5), j);
        j.setDirection(Location.SOUTH);
        world.add(new Location(3, 5), new Jumper());
        world.show();

    }	

}
