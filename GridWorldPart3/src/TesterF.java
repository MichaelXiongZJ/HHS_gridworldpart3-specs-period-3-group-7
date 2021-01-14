import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

//Are there any other tests the jumper needs to make? 
public class TesterF {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 5), new Jumper());
        world.add(new Location(4, 6), new Rock());
        world.add(new Location(4, 4), new Rock());
        world.add(new Location(3, 5), new Rock());
        world.add(new Location(5, 5), new Rock());
        world.show();

    }	

}
