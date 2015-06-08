package fr.iutvalence.ardechois.stealthgameproject.controller;

import java.util.HashMap;

import fr.iutvalence.ardechois.stealthgameproject.model.Direction;
import fr.iutvalence.ardechois.stealthgameproject.model.SGPModel;
import fr.iutvalence.ardechois.stealthgameproject.view.SGPView;

public class SGPController
{
    private SGPModel model;
    private SGPView view;
    
    public HashMap<String, Direction> directionHashMap;
    
    public SGPController()
    {
        setHashMap();
        
        this.model = new SGPModel();
        this.view = new SGPView();
    }
    
    private void setHashMap()
    {
        this.directionHashMap = new HashMap<String, Direction>();
        this.directionHashMap.put("UP", Direction.UP);
        this.directionHashMap.put("DOWN", Direction.DOWN);
        this.directionHashMap.put("LEFT", Direction.LEFT);
        this.directionHashMap.put("RIGHT", Direction.RIGHT);
    }
    
    public void move(Direction direction)
    {
        model.move(direction);
    }
}
