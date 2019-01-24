

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_564",life_fnc_processAction,"564",0,false,false,"",' life_inv_564_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "564" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "564" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"564",0,false,false,"",' !license_civ_564 && playerSide isEqualTo civilian '];