package com.gdxjam.components;

import com.badlogic.ashley.core.Component;

public class FactionComponent extends Component {

	public enum Faction {
		Player, Enemy, Neutral;
	}

	public Faction faction;

}
