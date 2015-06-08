package fr.iutvalence.ardechois.stealthgameproject.controller;

import fr.iutvalence.ardechois.stealthgameproject.model.Position;
import fr.iutvalence.ardechois.stealthgameproject.model.SGPModel;
import fr.iutvalence.ardechois.stealthgameproject.view.SGPView;

public class SGPController
{
    private SGPModel model;
    private SGPView view;
    
    public SGPController(SGPModel model, SGPView view)
    {
        this.model=model;
        this.view=view;
    }
    
    
}
