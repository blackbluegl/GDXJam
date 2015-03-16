package com.gdxjam.ai.state;

public enum TelegramMessage {
	
	//Squad relevant messages
	SQUAD_DISCOVERED_ENEMY,
	SQUAD_DISCOVERED_RESOURCE,
	SQUAD_INPUT_SELECTED,
	
	//Unit relevant messages
	UNIT_TARGET_REQUEST,	//Sent when a unit needs a new target from its squad
	UNIT_TARGET_DESTROYED,	//When a unit is signaling the squad that its target is dead
	UNIT_ADDED_TO_SQUAD,
	
	//Construction System relevant messages
	CONSTRUCT_UNIT_REQUEST,
	CONSTRUCT_UNIT_CONFRIM,
	
	//GUI relevant messages
	GUI_INSUFFICIENT_RESOURCES,
	
	;

}
